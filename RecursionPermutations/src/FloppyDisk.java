import java.util.Arrays;
import java.util.Scanner;

public class FloppyDisk {
    public static void main(String[] args) {
        final int n = 3;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            int s = sc.nextInt();
            int[] fileSizes = new int[s];

            for (int j = 0; j < s; j++) {
                fileSizes[j] = sc.nextInt();
            }

            System.out.println(minimumUnusedSpace(fileSizes, STORAGE));
        }

    }

    final static int STORAGE = 1440;

    public static int minimumUnusedSpace(int[] fileSizes, int storageRemaining) {

        int minimumStorageRemaining = storageRemaining;

        // will not loop if all files are used up or if none of the files fit inside the storage remaining
        for (int i = 0; i < fileSizes.length; i++) {
            // skip all -1 files and files that will exceed storageRemaining if added
            if (fileSizes[i] != -1 && storageRemaining - fileSizes[i] >= 0) {

                // temp set the file size to be inserted to be -1
                int fileSize = fileSizes[i];
                fileSizes[i] = -1;

                int storageRemainingFromCurrent = minimumUnusedSpace(fileSizes, storageRemaining - fileSize);
                minimumStorageRemaining = Math.min(minimumStorageRemaining, storageRemainingFromCurrent);

                // revert it back after
                fileSizes[i] = fileSize;
            }
        }

        return minimumStorageRemaining;
    }
}
