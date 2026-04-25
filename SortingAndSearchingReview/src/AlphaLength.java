import java.util.Arrays;

public class AlphaLength {
    public static void main(String[] args) {
        String[] list = {"b", "apple", "aa", "hello", "hello", "this","c", "potato", "a", "fired"};
        System.out.println(Arrays.toString(list));
        bubbleSort(list);
        System.out.println(Arrays.toString(list));
        System.out.println(binarySearch(list, "this"));
        System.out.println(binarySearch(list, "fired"));
    }

    public static void insertionSort(String[] list){
        for (int i = 0; i < list.length; i++) {
            int j = i;
            String value = list[i];

            // first check until previous item length is the same or smaller
            while (j > 0 && value.length() < list[j - 1].length()) {
                list[j] = list[j - 1];
                j--;
            }

            // if the previous item length is the same
            // keep looping while the OG value comes before the previous item lexicographically
            while (j > 0 && value.length() == list[j - 1].length() && value.compareToIgnoreCase(list[j - 1]) < 0) {
                list[j] = list[j - 1];
                j--;
            }

            list[j] = value;
        }
    }

    static void insertionSort2(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int j = i;
            String currValue = arr[j];
            boolean correctPosition = false;

            while (j > 0 && !correctPosition) {
                if (currValue.length() < arr[j-1].length()) {
                    arr[j] = arr[j-1];
                    j--;
                } else if (currValue.length() == arr[j - 1].length() && currValue.compareToIgnoreCase(arr[j -1]) < 0) {
                    arr[j] = arr[j-1];
                    j--;
                } else {
                    correctPosition = true;
                }

            }
            arr[j] = currValue;
        }
    }

    static void selectionSort(String[] arr) {

        int length = arr.length;

        for (int i = 0; i < length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < length; j++) {
                if (arr[j].length() < arr[minIndex].length()) {
                    minIndex = j;
                } else if (arr[j].length() == arr[minIndex].length() && arr[j].compareToIgnoreCase(arr[minIndex]) < 0) {
                    minIndex = j;
                }
            }

            String temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }


    static void bubbleSort(String[] list) {
        boolean sorted = false;

        for (int i = list.length - 1; i >= 1 && !sorted; i--) {
            sorted = true;

            for (int j = 0; j <= i - 1; j++) {
                String current = list[j];

                if (current.length() > list[j + 1].length()) {
                    sorted = false;
                    list[j] = list[j + 1];
                    list[j + 1] = current;
                } else if (current.length() == list[j + 1].length() && current.compareToIgnoreCase(list[j + 1]) > 0) {
                    sorted = false;
                    list[j] = list[j + 1];
                    list[j + 1] = current;
                }
            }
        }
    }

    public static int binarySearch(String[] list, String item) {
        int bottom = 0;
        int top = list.length - 1;

        while (bottom <= top) {
            int middle = bottom + (top - bottom) / 2;

            if (item.equals(list[middle])) {
                return middle;
            } else if (item.length() > list[middle].length()) {
                bottom = middle + 1;
            } else if (item.length() == list[middle].length() && item.compareToIgnoreCase(list[middle]) > 0) {
                bottom = middle + 1;
            } else if (item.length() < list[middle].length()) {
                top = middle - 1;
            } else { // length is equal and item comes before middle lexicographically
                top = middle - 1;
            }

        }
        return -1;
    }
}
