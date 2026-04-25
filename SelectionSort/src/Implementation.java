import java.util.Arrays;

public class Implementation {
    public static void main(String[] args) {

        int[] list = {4, 5, 6, 3 ,1, 10};

        System.out.println(Arrays.toString(list));
        selectionSort(list);
        System.out.println(Arrays.toString(list));
    }

    public static void selectionSort(int[] list) {
        for (int i = 0; i < list.length; i++) {
            int smallestIndex = i;

            for (int j = i; j < list.length; j++) {
                if (list[j] < list[smallestIndex]) {
                    smallestIndex = j;
                }
            }

            int temp = list[i];
            list[i] = list[smallestIndex];
            list[smallestIndex] = temp;
        }
    }
}