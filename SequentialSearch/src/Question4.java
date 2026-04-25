import java.util.Arrays;
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {

        // b)
        final int SENTINEL = 0;
        Scanner sc = new Scanner(System.in);
        int[] list;
        int length, query;

        System.out.print("Enter length of array: ");
        length = sc.nextInt();
        list = new int[length];

        for (int i = 0; i < list.length; i++){
            System.out.printf("Enter integer %d: ", i);
            list[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(list));
        System.out.print("Enter an query: ");
        query = sc.nextInt();

        while (query != SENTINEL) {
            modifiedSequentialSearch(list, query);
            System.out.println(Arrays.toString(list));

            System.out.print("Enter an query: ");
            query = sc.nextInt();
        }

        /*
        c)
        This method is more efficient as integers that the user looks up often
        will be moved closer to the front of the list, reducing the amount
        of iterations required to search for it again.
         */
    }

    // a)
    public static void modifiedSequentialSearch(int[] list, int item) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == item && i != 0) {
                int temp;
                temp = list[i - 1];
                list[i - 1] = list[i];
                list[i] = temp;
                return;
            }
        }
    }
}
