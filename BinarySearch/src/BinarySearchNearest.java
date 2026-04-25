public class BinarySearchNearest {
    public static void main(String[] args) {
        int[] list = {1, 4, 5, 6, 10, 12, 50};

        System.out.println(binarySearch(list,5));
        System.out.println(binarySearch(list,2));
        System.out.println(binarySearch(list, 13));
        System.out.println(binarySearch(list, 49));
    }

    public static int binarySearch(int[] list, int item) {
        int bottom = 0;
        int top = list.length - 1;
        boolean found = false;
        int i = -1;

        while (bottom <= top && !found) {
            int middle = bottom + (top - bottom);

            int m = (bottom + top) >>> 1;

            if (item == list[middle]) {
                i = middle;
                found = true;
            } else if (item > list[middle]) {
                bottom = middle + 1;
            } else {
                top = middle - 1;
            }
        }

        if (i == -1) {
            // bottom crosses top

            // if top is -1 return 0
            if (top < 0) {
                return 0;
            } else if (bottom >= list.length){ // if bottom is length return length - 1
                return list.length - 1;
            }
            // return if bottom or top are closer, picks top if they are the same
            return (list[bottom] - item) < (item - list[top]) ? bottom : top;
        }
        return i;
    }
}

// [1, 2, 5, 6] 4
//  l     m  h
// (3 < 5) [1, 2, X, X]
//          ml  h
// (3 > 1) [X, 2, X, X]
//            mlh
// (3 > 2) [X, X, X, X]
//            mh  l
// MID REMAINS AS 2 (index 1)
//

// [1, 2, 5, 6, 7] 3
// (3 < 5) [1, 2, X, X, X]
// (3 > 1) [X, 2, X, X, X]
// (3 > 2)    mh  l