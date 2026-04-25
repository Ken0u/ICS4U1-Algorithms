public class TernarySearch {
    public static void main(String[] args) {
        int[] list = {1, 3, 4, 6, 7, 9};

        System.out.println(binarySearch(list, 4));
        System.out.println(binarySearch(list, 5));

        System.out.println(ternarySearch(list, 4));
        System.out.println(ternarySearch(list, 5));
    }

    public static int ternarySearch(int[] list, int item) {
        int bottom = 0;
        int top = list.length - 1;

        while (top >= bottom) {
            int oneThird = bottom + (top - bottom) / 3;
            int twoThird = bottom + (top - bottom) * 2 / 3;

            if (item == list[oneThird]) {
                return oneThird;
            } else if (item == list[twoThird]) {
                return twoThird;
            } else if (item < list[oneThird]) {
                top = oneThird - 1;
            } else if (item > list[twoThird]) {
                bottom = twoThird + 1;
            } else {
                // lies between oneThird and twoThird
                bottom = oneThird + 1;
                top = twoThird - 1;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] list, int item) {
        int bottom = 0;
        int top = list.length - 1;

        while (top >= bottom) {
            int middle = bottom + (top - bottom) / 2;

            if (item == list[middle]) {
                return middle;
            } else if (item < list[middle]) {
                top = middle - 1;
            } else {
                bottom = middle + 1;
            }
        }

        return -1;
    }
}
