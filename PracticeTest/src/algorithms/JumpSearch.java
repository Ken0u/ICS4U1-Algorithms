package algorithms;

public class JumpSearch {
    public static void main(String[] args) {
        int[] list = {1, 3, 4, 7, 8, 9, 10, 14};
        
        System.out.println(jumpSearch(list, 1));
        System.out.println(jumpSearch(list, 2));
        System.out.println(jumpSearch(list, 14));
        System.out.println(jumpSearch(list, 10));
    }
    
    public static int jumpSearch(int[] list, int value) {
        int index = 0;
        int jump = (int) Math.sqrt(list.length);
        
        while (index < list.length && list[index] <= value) {
            index += jump;
        }
        
        int start = index - jump;
        if (index >= list.length) {
            index = list.length - 1;
        }
        
        for (int i = start; i <= index; i++) {
            if (list[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
