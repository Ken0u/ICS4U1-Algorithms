public class BinarySearchString {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "cherry", "date", "grape", "fig"};

        System.out.println(binarySearch(words, "apple"));
        System.out.println(binarySearch(words, "grape"));
        System.out.println(binarySearch(words, "a"));
    }

    public static int binarySearch(String[] list, String item) {
        int bottom = 0;
        int top = list.length - 1;
        boolean found = false;
        int i = -1;

        while (bottom <= top && !found) {
            int middle = bottom + (top - bottom) / 2;

            if (item.equals(list[middle])) {
                found = true;
                i = middle;
            } else if (item.compareTo(list[middle]) > 0) {
                bottom = middle + 1;
            } else {
                top = middle - 1;
            }
        }

        return i;
    }
}
