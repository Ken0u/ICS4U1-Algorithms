import java.util.Arrays;

public class CocktailShakerSort {
    public static void main(String[] args) {
        double[] list = {10.5, 3.2, 7.8, 1.3, 9.3, 4.8, 1.5};

        System.out.println(Arrays.toString(list));
        shakeSort(list);
        System.out.println(Arrays.toString(list));
    }

    static void shakeSort(double[] list) {
        boolean sorted = false;

        for (int i = list.length - 1; i >= 1 && !sorted; i--) {
            sorted = true;
            int pass = list.length - 1 - i;

            if (pass % 2 == 0) {
                for (int j = list.length - 1; j >= 1; j--) {
                    if (list[j] < list[j - 1]) {
                        sorted = false;
                        double temp = list[j];
                        list[j] = list[j - 1];
                        list[j - 1] = temp;
                    }
                }
            } else {
                for (int j = 0; j < list.length - 1; j++) {
                    if (list[j] > list[j + 1]) {
                        sorted = false;
                        double temp = list[j];
                        list[j] = list[j + 1];
                        list[j + 1] = temp;
                    }
                }
            }

            System.out.printf("Pass #%d: %s%n", pass, Arrays.toString(list));
        }
    }
}
