import java.util.Arrays;

public class BubbleSortSimple {
    public static void main(String[] args) {
        double[] list = {1.5, 2.9, 10.3, 6.2, 8.8, 9.2};
        System.out.println(Arrays.toString(list));
        bubbleSort(list);
        System.out.println(Arrays.toString(list));
    }

    static void bubbleSort(double[] list) {
        boolean sorted = false;

        for (int i = list.length - 1; i >= 1 && !sorted; i--) {
            sorted = true;
            for (int j = 0; j <= i - 1; j++) {
                if (list[j] > list[j + 1]) {
                    sorted = false;
                    double temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
    }


}
