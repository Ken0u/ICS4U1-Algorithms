import java.util.Arrays;

public class Implementation {
    public static void main(String[] args) {

        int[] list = {1, 6, 3, 8, 10, 38, 9};
        System.out.println(Arrays.toString(list));
        bubbleSort(list);
        System.out.println(Arrays.toString(list));

    }

    public static void bubbleSort(int[] list) {
        boolean sorted = false;
        for (int i = list.length - 1; i >= 0 && !sorted; i--) {
            sorted = true;

            for (int j = 0; j < i - 1; j++) {
                if (list[j] > list[j + 1]) {
                    sorted = false;
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
    }

    public static void bubbleSort2(int[] list) {
        for (int i = list.length - 1; i >= 0; i--) {

            for (int j = 0; j < list.length - 1; j++) {
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
    }
}