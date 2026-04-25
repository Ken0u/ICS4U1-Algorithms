import java.util.Arrays;

public class OddEvenSort {
    public static void main(String[] args) {
        int[] list = {13, 12, 13, 18, 15, 16, 14 ,11};
        oddEvenSort(list);
        System.out.println(Arrays.toString(list));
    }
    
    public static void oddEvenSort(int[] list) {
        boolean sorted = false;
        
        while (!sorted) {
            sorted = true;
            
            for (int i = 1; i < list.length - 1; i+= 2) {
                if (list[i] > list[i + 1]) {
                    sorted = false;
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                }
            }
            
            for (int i = 0; i < list.length - 1; i+= 2) {
                if (list[i] > list[i + 1]) {
                    sorted = false;
                    int temp = list[i];
                    list[i] = list[i +1];
                    list[i + 1] = temp;
                }
            }
        }
    }
}