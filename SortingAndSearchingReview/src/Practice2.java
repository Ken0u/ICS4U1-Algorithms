import java.util.Arrays;

public class Practice2 {
    public static void main(String[] args) {
        int[] arr = {6, 2, 8, 10, 3, 12, 1, 15, 100};
        selectionSort(arr);

        System.out.println(Arrays.toString(arr));
        System.out.println(exponentialSearch(arr, 100));

//        System.out.println(Arrays.toString(arr));
//        doubleEndedSelectionSort(arr);
//        System.out.println(Arrays.toString(arr));
//
//        String[] first = {"C", "B", "A"};
//        String[] last = {"A", "A", "C"};
//
//        for (int i = 0; i < first.length; i++) {
//            int minIndex = i;
//
//            for (int j = i; j < first.length; j++) {
//                if (last[j].compareTo(last[minIndex]) < 0 || last[j].compareTo(last[minIndex]) == 0 && first[j].compareTo(first[minIndex]) < 0) {
//                    minIndex = j;
//                }
//            }
//
//            String temp = last[i];
//            last[i] = last[minIndex];
//            last[minIndex] = temp;
//            temp = first[i];
//            first[i] = first[minIndex];
//            first[minIndex] = temp;
//        }
//
//        for(int i = 0; i < first.length; i++) {
//            System.out.print(first[i] + " " + last[i] + ", ");
//        }



        int NUM = 30;
        String[] firstName = new String[NUM];
        String[] lastName = new String[NUM];

        for (int i = 0; i < NUM; i++) {
            int minIndex = i;
            for (int j = i + 1; j < NUM; j++) {
                if (lastName[j].compareToIgnoreCase(lastName[minIndex]) < 0 ||
                        lastName[j].compareToIgnoreCase(lastName[minIndex]) == 0 &&
                                firstName[j].compareToIgnoreCase(firstName[minIndex]) < 0) {
                    minIndex = i;
                }
            }

            String temp = lastName[i];
            lastName[i] = lastName[minIndex];
            lastName[minIndex] = temp;
            temp = firstName[i];
            firstName[i] = firstName[minIndex];
            firstName[minIndex] = temp;
        }

    }

        public static void bubbleSort(int[] arr) {
            boolean sorted = false;
            for (int i = arr.length - 1; i >= 1 && !sorted; i--) {
                sorted = true;

                for (int j = 0; j <= i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        sorted = false;
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }

    public static void bubbleSort2(int[] arr) {
        boolean sorted = false;
        for (int i = 0; i < arr.length - 1 && !sorted; i++) {
            sorted = true;
            for (int j = arr.length - 1; j >= i + 1; j--) {
                if (arr[j] > arr[j - 1]) {
                    sorted = false;
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }


    public static void selectionSort2(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int maxIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
    }

    public static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int j = i;
            int value = arr[i];

            while (j > 0 && value < arr[j - 1]) {
                arr[j] = arr[j - 1];
                j--;
            }

            arr[j] = value;

        }
    }

    public static void insertionSort2(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int j = i;
            int value = arr[i];

            while (j > 0 && value > arr[j - 1]) {
                arr[j] = arr[j - 1];
                j--;
            }

            arr[j] = value;
        }
    }

    public static int binarySearch(int[] arr, int item) {
        int bottom = 0;
        int top = arr.length - 1;

        while (bottom <= top) {
            int middleIndex = bottom + (top - bottom) / 2;
            int middleValue = arr[middleIndex];

            if (item == middleValue) {
                return middleIndex;
            } else if (item < middleValue) {
                top = middleIndex - 1;
            } else {
                bottom = middleIndex + 1;
            }
        }

        return -1;
    }

    public static int ternarySearch(int[] arr, int item) {
        int bottom = 0;
        int top = arr.length - 1;

        while (bottom <= top) {
            int oneThird = bottom + (top - bottom) / 3;
            int twoThird = bottom + (top - bottom) * 2 / 3;
            int oneThirdValue = arr[oneThird];
            int twoThirdValue = arr[twoThird];

            if (item == oneThirdValue) {
                return oneThird;
            } else if (item == twoThirdValue) {
                return twoThird;
            } else if (item < oneThirdValue) {
                top = oneThird - 1;
            } else if (item > twoThirdValue) {
                bottom = twoThird + 1;
            } else {
                bottom = oneThird + 1;
                top = twoThird - 1;
            }
        }

        return -1;
    }

    public static void shakerSort(double[] arr) {
        boolean sorted = false;

        for (int i = 0; i < arr.length && !sorted; i++) {
            sorted = true;

            if (i % 2 == 0) {
                for (int j = arr.length - 1 - i / 2; j >= i / 2 + 1; j--) {
                    System.out.println(j);
                    if (arr[j] < arr[j - 1]) {
                        sorted = false;
                        double temp = arr[j];
                        arr[j] = arr[j - 1];
                        arr[j - 1] = temp;
                    }
                }
            } else {
                for (int j = i / 2; j <= arr.length - 2 - i / 2; j++) {
                    System.out.println(j);
                    if (arr[j] > arr[j + 1]) {
                        sorted = false;
                        double temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void shakerSort2(double[] arr) {
        int start = 0;
        int end = arr.length - 1;
        boolean sorted = false;

        while (!sorted) {
            sorted = true;
            for (int i = start; i <= end - 1; i++) {
                System.out.println(i);
                if (arr[i] > arr[i + 1]) {
                    sorted = false;
                    double temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            System.out.println(Arrays.toString(arr));
            end--;

            if (!sorted) {
                for (int i = end; i >= start + 1; i--) {
                    System.out.println(i);
                    if (arr[i] < arr[i - 1]) {
                        sorted = false;
                        double temp = arr[i];
                        arr[i] = arr[i - 1];
                        arr[i - 1] = temp;
                    }
                }
                System.out.println(Arrays.toString(arr));
                start++;
            }
        }
    }

    public static void doubleEndedSelectionSort(double[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int minIndex = i;
            int maxIndex = i;
            for (int j = i; j < arr.length - i; j++) {
                System.out.println(j);
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                } else if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }

            double minVal = arr[minIndex];
            double maxVal = arr[maxIndex];

            arr[minIndex] = arr[i];
            arr[i] = minVal;

            if (arr[minIndex] != maxVal) { // if maxValue is in the place of minIndex
                arr[maxIndex] = arr[arr.length - 1 - i];
                arr[arr.length - 1 - i] = maxVal;
            }
            System.out.println(Arrays.toString(arr));
        }
    }

    public static int exponentialSearch(int[] list, int toFind) {
        int top = 1;
        while (top < list.length && list[top - 1] <= toFind) {
            top *= 2;
        }
        int bottom = top / 2 - 1;
        top--;

        if (top > list.length - 1) {
            top = list.length - 1;
        }
        if (bottom < 0) {
            bottom = 0;
        }

        while (bottom <= top) {
            int middle = bottom + (top - bottom) / 2;
            if (toFind == list[middle]) {
                return middle;
            } else if (toFind < list[middle]) {
                top = middle - 1;
            } else {
                bottom = middle + 1;
            }
        }
        return -1;
    }


}
