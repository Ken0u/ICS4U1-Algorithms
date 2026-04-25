package algorithms;

public class CountPositive {
    public static void main(String[] args) {
        int[] list = {1, 6, -1, -3, 9, -1, 3, 9, -8};
        
        System.out.println(countPositive(list));
    }
    
    public static int countPositive(int[] list, int start, int end) {
        if (start == end) {
            if (list[start] > 0) {
                return 1;
            }
            return 0;
        }
        
        if (list[start] > 0) {
            return 1 + countPositive(list, start + 1, end);
        }
        return countPositive(list, start + 1, end);
    }
    
    public static int countPositive(int[] list) {
        return countPositive(list, 0, list.length - 1);
    }
}
