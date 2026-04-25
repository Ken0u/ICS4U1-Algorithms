public class SequentialSortRecursion {
    public static void main(String[] args) {
        int[] list = {1, 3, 7, 5, 2, 9};
        System.out.println(search(list, 7));
        System.out.println(search(list, 9));
        System.out.println(search(list, 4));
    }
    
    public static int search(int[] list, int value) {
        return search(list, value, 0);
    }
    
    public static int search(int[] list, int value, int index) {
        if (index == list.length) {
            return -1;
        } else if (list[index] == value) {
            return index;
        }
        
        return search(list, value, index + 1);
    }
}
