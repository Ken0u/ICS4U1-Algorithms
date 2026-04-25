import java.util.Arrays;

public class SelectionSortPartialList {
    public static void main(String[] args) {
        int[] list = {4, 7, 9, 2, 10, 1, 13, 3};

        System.out.println(Arrays.toString(list));
        selectionSort(list, 3); // top 3
        System.out.println(Arrays.toString(list));

    }

    public static void selectionSort(int[] list, int k) {
        int length = list.length;
        for (int i = length - 1; i >= length - k; i--) {
            int largestIndex = i;

            for (int j = i; j >= 0; j--) {
                if (list[j] > list[largestIndex]) {
                    largestIndex = j;
                }
            }

            int temp = list[i];
            list[i] = list[largestIndex];
            list[largestIndex] = temp;
        }
    }
}
