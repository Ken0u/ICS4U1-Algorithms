import java.util.Arrays;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        final int SIZE = 20, RANGE = 101;
        int query, index;
        Scanner sc = new Scanner(System.in);
        int[] list = new int[SIZE];

        for (int i = 0; i < SIZE; i++){
            list[i] = (int) (Math.random() * RANGE);
        }

        System.out.println(Arrays.toString(list));
        System.out.print("Enter a number to search: ");
        query = sc.nextInt();

        index = sequentialSearch(list, query);

        if (index == -1) {
            System.out.println("Item not found.");
        } else {
            System.out.printf("The element %d is found at index %d.", query, index);
        }

    }

    public static int sequentialSearch(int[] list, int item) {
        for (int i =0; i < list.length; i++){
            if (list[i] == item) {
                return i;
            }
        }
        return -1;
    }
}
