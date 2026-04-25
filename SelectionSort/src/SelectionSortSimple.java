import java.util.Arrays;

public class SelectionSortSimple {
    public static void main(String[] args) {
        double[] list = {5.3, 9.8, 2.3, 1.0, 6.3};

        System.out.println(Arrays.toString(list));
        selectionSort(list);
        System.out.println(Arrays.toString(list));

    }

    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length; i++) {
            int smallest = i;

            for (int j = i; j < list.length; j++) {
                if (list[j] < list[smallest]) {
                    smallest = j;
                }
            }

            double temp = list[i];
            list[i] = list[smallest];
            list[smallest] = temp;

        }
    }
}
