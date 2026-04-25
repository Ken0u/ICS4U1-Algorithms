import java.util.Arrays;

public class SelectionSortNoSwapping {
    public static void main(String[] args) {

        int[] list = {4, 2, 6, 10, 8, 9, 5};
        System.out.println(Arrays.toString(list));
        selectionSort(list);
        System.out.println(Arrays.toString(list));
    }

    /*
    It is better to leave the algorithm as is to avoid unnecessary checks and maintain consistency
    with the algorithm.
     */
    public static void selectionSort(int[] list) {
        for (int i = list.length - 1; i >= 0; i--){
            int largest = i;

            for (int j = i; j >= 0; j--) {
                if (list[j] > list[largest]) {
                    largest = j;
                }
            }

            if (largest != i) {
                int temp = list[i];
                list[i] = list[largest];
                list[largest] = temp;
            }
        }
    }
}
