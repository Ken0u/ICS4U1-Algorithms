public class BinarySearchFirstOccurrence {
    public static void main(String[] args) {
        int[] list = {2, 3, 3, 5, 5, 5, 6, 6};
        System.out.println(binarySearchFirstOccurrence(list, 2));
        System.out.println(binarySearchFirstOccurrence(list, 3));
        System.out.println(binarySearchFirstOccurrence(list, 5));
        System.out.println(binarySearchFirstOccurrence(list, 6));
    }
    
    public static int binarySearchFirstOccurrence(int[] list, int value){ 
        int bottom = 0;
        int top = list.length - 1;
        int index = -1;
        
        while (bottom <= top) {
            int middle = bottom + (top - bottom) / 2;
            int middleVal = list[middle];
            
            if (middleVal == value) {
                index = middle;
                top = middle - 1;
            } else if (value < middleVal) {
                top = middle - 1;
            } else {
                bottom = middle + 1;
            }
        }
        return index;
    }
}
