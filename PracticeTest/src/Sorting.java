import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        
        int[] list = {4, 8, 10, 3, 1, 2, 6};
        System.out.println(Arrays.toString(list));
        bubbleSort(list);
        System.out.println(Arrays.toString(list));
    }
    
    public static void insertionSort(int[] list) {
        for (int i = 0; i < list.length; i++) {
            int j = i;
            int value = list[i];
            
            while (j > 0 && value < list[j - 1]) {
                list[j] = list[j - 1];
                j--;
            }
            
            list[j] = value;
        }
    }
    
    public static void selectionSort(int[] list) {
        for (int i = 0; i < list.length; i++) {
            int smallestIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < list[smallestIndex]) {
                    smallestIndex = j;
                }
            }
            
            int temp = list[i];
            list[i] = list[smallestIndex];
            list[smallestIndex] = temp;
        }
    }
    
    public static void bubbleSort(int[] list) {
        boolean sorted = false;
        
        for (int i = list.length - 1; i >= 1 && !sorted; i--) {
            sorted = true;
            
            for (int j = 0; j <= i - 1; j++) {
                if (list[j] > list[j + 1]) {
                    sorted = false;
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
        
    }
}
