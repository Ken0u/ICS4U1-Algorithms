import java.util.Arrays;

public class CombSort {
    public static void main(String[] args) {
        int[] list = {3, 6, 2, 1, 10, 9, 7};
        combSort(list);
        System.out.println(Arrays.toString(list));
    }
    
    public static void combSort(int[] list) {
        final double K = 1.3;
        int gap = list.length;
        boolean sorted = false;
        int temp;
        
        while (!sorted) {
            
            gap = (int) (gap /= K);
            
            if (gap == 0) {
                gap = 1;
            }
            if (gap == 1) {
                sorted = true;
            }
            
            for (int i = 0; i < list.length - gap; i++) {
                if (list[i] > list[i + gap]) {
                    temp = list[i];
                    list[i] = list[i + gap];
                    list[i + gap] = temp;
                    sorted = false;
                }
            }
        }
    }
}
