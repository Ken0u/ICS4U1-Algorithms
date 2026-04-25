import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] list = {23, 27, 30, 34, 41, 49, 51, 55, 57, 60, 67, 72, 78, 83, 96};

        System.out.println(binarySearch(list, 72));
        System.out.println(binarySearch(list, 41));
        System.out.println(binarySearch(list, 62));
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
                bottom = middle + 1;
            } else { // not in top half
                top = middle - 1;
            }
        }

        return i;
    }

    /*

    binarySearch(list L, item x)
    set bottom to 0
    set top to length of list – 1
    set found to false
    set i to -1
    while (bottom is less than or equal to top and found is false)
        set middle to (bottom + top) / 2
    if (x matches item at index middle)
        set found to true
        set i to middle
    else if (x > item at index middle) //not in the bottom half
        set bottom to middle + 1
    else //not in the top half
        set top to middle -1
    return i
     */
}