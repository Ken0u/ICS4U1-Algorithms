package algorithms;

import java.util.Arrays;

public class SelectionSortDouble {
    public static void main(String[] args) {
        int[] list = {6, 1, 9, 3, 10, 19, 4, 13};
//        int[] list = {6, 2, 1}; // tests for the extra case
        selectionSort(list);
        System.out.println(Arrays.toString(list));
    }
    
    // max and min at once 
    public static void selectionSort(int[] list) {
        
        for (int i =0; i < list.length / 2; i++) {
            int maxIndex = i;
            int minIndex = i;
            
            for (int j = i; j < list.length - i; j++) {
                if (list[j] > list[maxIndex]) {
                    maxIndex = j;
                } 
                if (list[j] < list[minIndex]) {
                    minIndex = j;
                }
            }
            
            int temp1 = list[minIndex];
            int temp2 = list[maxIndex];
            list[minIndex] = list[i];
            list[i] = temp1;
            
            if (!(maxIndex == i && minIndex == list.length - 1 - i)) {
                list[maxIndex] = list[list.length - 1 - i];
                list[list.length - 1 - i] = temp2;
            }
        }
    }
}
