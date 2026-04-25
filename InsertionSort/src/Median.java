import java.util.Arrays;
import java.util.Scanner;

public class Median {
    public static void main(String[] args) {
        int length;
        int[] list;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of array: ");
        length = sc.nextInt();

        list = new int[length];

        for (int i =0 ; i < length; i++) {
            System.out.printf("Element %d: ", i);
            list[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(list));
        insertionSort(list);
        System.out.println(Arrays.toString(list));

        System.out.println();
        System.out.print("Median: ");

        if (length % 2 == 0) {
            System.out.println((list[length / 2] + list[length / 2 - 1]) / 2d);
        } else {
            System.out.println(list[length / 2]);
        }

    }

    public static void insertionSort(int[] list) {
        for (int i = 0; i < list.length; i++) {
            int j = i;
            int value = list[i];

            while (j > 0 && value < list[j - 1]) {
                list[j] = list[j - 1];
                j--;
            }

            list[j] = value;
        }
    }
}
