public class BinarySearchDescending {
    public static void main(String[] args) {
        int[] list = {9, 8, 5, 3, 2, 1};

        System.out.println(binarySearch(list, 3));
        System.out.println(binarySearch(list, 9));
        System.out.println(binarySearch(list, 0));

    }

    public static int binarySearch(int[] list, int item) {
        int bottom = 0;
        int top = list.length - 1;
        boolean found = false;
        int i = -1;

        while (bottom <= top && !found) {
            int middle = bottom + (top - bottom) / 2;

            if (item == list[middle]) {
                found = true;
                i = middle;
            } else if (item > list[middle]) {
                // if item is greater than middle
                // it must be on the left side (descending)
                // eliminate the right side
                top = middle - 1;
            } else {
                // vice versa
                bottom = middle + 1;
            }
        }

        return i;
    }
}
