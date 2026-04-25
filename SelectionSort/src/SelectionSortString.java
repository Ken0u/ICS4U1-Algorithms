import java.util.Arrays;
import java.util.Scanner;

public class SelectionSortString {
    public static void main(String[] args) {
        final int LENGTH = 10;
        Scanner sc = new Scanner(System.in);
        String[] list = new String[LENGTH];

        for (int i = 0; i < LENGTH; i++) {
            System.out.printf("Enter string %d: ", i);
            list[i] = sc.nextLine();
        }

        System.out.println(Arrays.toString(list));
        selectionSort(list);
        System.out.println(Arrays.toString(list));

    }

    public static void selectionSort(String[] list) {
        for (int i = 0; i < list.length; i++) {
            int smallest = i;

            for (int j = i; j < list.length; j++) {
                if (list[j].compareTo(list[smallest]) < 0) {
                    smallest = j;
                }
            }

            String temp = list[i];
            list[i] = list[smallest];
            list[smallest] = temp;
        }
    }
}
