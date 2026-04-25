public class BinarySearch {
    public static void main(String[] args) {
        int[] list = {1, 3, 5, 6, 7, 9, 10};
        System.out.println(binarySearch(list, 5));
        System.out.println(binarySearch(list, 1));
        System.out.println(binarySearch(list, 4));

    }

    public static int binarySearch(int[] list, int item) {
        return binarySearch(list, item, 0, list.length - 1);
    }

    public static int binarySearch(int[] list, int item, int bottom, int top) {

        int middle = bottom + (top - bottom) / 2;
        int middleValue = list[middle];

        if (bottom > top) {
            return -1;
        } else if (item == middleValue) {
            return middle;
        } else if (item < middleValue) {
            return binarySearch(list, item, bottom, middle - 1);
        } else {
            return binarySearch(list, item, middle + 1, top);
        }
    }
}
