import java.util.*;

public class SortingPractice {
    public static void main(String[] args) {
        String[] list = {
                "banana",
                "apple",
                "grape",
                "orange",
                "kiwi",
                "peach",
                "strawberry",
                "blueberry"
        };
        System.out.println(Arrays.toString(list));
        insertionSort(list);
        System.out.println(Arrays.toString(list));
        list = new String[]{
                "banana",
                "apple",
                "grape",
                "orange",
                "kiwi",
                "peach",
                "strawberry",
                "blueberry"
        };
        bubbleSort(list);
//        System.out.println(Arrays.toString(list));

        int[] arr = {1, 3, 4, 6, 8, 9, 10};
        System.out.println(ternarySearch(arr, 3));
        System.out.println(ternarySearch(arr, 10));
        System.out.println(ternarySearch(arr, 0));

//        List<String> l = new ArrayList<>();
//        l.add("bb");
//        l.add("a");
//        l.add("ccc");
//        l.add("aaa");
//        l.sort(Comparator.comparing(String::length).thenComparing(String::compareTo));
//        System.out.println(l);
    }

    public static void insertionSort(String[] list) {
        for (int i = 0; i < list.length; i++) {
            int j = i;
            String value = list[i];

            while (j > 0 && (value.length() < list[j - 1].length() ||
                    value.length() == list[j - 1].length() && value.compareTo(list[j - 1]) < 0)) {
                list[j] = list[j - 1];
                j--;
            }
            list[j] = value;
        }
    }

    public static void selectionSort(String[] list) {
        for (int i = 0; i < list.length; i++) {
            int minIndex = i;
            for (int j = i; j < list.length; j++) {
                if (list[j].length() < list[minIndex].length() ||
                        list[j].length() == list[minIndex].length() && list[j].compareTo(list[minIndex]) < 0) {
                    minIndex = j;
                }
            }

            String temp = list[i];
            list[i] = list[minIndex];
            list[minIndex] = temp;
        }
    }

    public static void bubbleSort(String[] list) {
        boolean sorted = false;
        for (int i = list.length - 1; i >= 1 && !sorted; i--) {
            sorted = true;

            for (int j = 0; j <= i - 1; j++) {
                if (list[j].length() > list[j + 1].length() ||
                list[j].length() == list[j + 1].length() && list[j].compareTo(list[j + 1]) > 0) {

                    sorted = false;
                    String temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
            System.out.println(Arrays.toString(list));
        }
    }

    public static int ternarySearch(int[] arr, int item) {
        int bottom = 0;
        int top = arr.length - 1;
        while (bottom <= top) {
            int oneThird = bottom + (top - bottom) / 3;
            int twoThird = bottom + (top - bottom) * 2 / 3;

            if (item == arr[oneThird]) {
                return oneThird;
            } else if (item == arr[twoThird]) {
                return twoThird;
            } else if (item < arr[oneThird]) {
                top = oneThird - 1;
            } else if (item > arr[twoThird]) {
                bottom = twoThird + 1;
            } else {
                bottom = oneThird + 1;
                top = oneThird - 1;
            }
        }
        return -1;
    }
}