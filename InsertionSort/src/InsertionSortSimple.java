import java.util.Arrays;

public class InsertionSortSimple {
    public static void main(String[] args) {
        double[] list = {5.5, 3.2, 1.1, 9.0, 5.2};
//        double[] list = {2, 3, 1};

        System.out.println(Arrays.toString(list));
        insertionSort(list);
        System.out.println(Arrays.toString(list));

    }

    public static void insertionSort(double[] list) {
        for (int i = 0; i < list.length; i++) {
            int j = i;
            double x = list[i];

            while (j > 0 && x < list[j - 1]) {
                list[j] = list[j - 1];
                j--;
            }
            list[j] = x;
        }
    }
}