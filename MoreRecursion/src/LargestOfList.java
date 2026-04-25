public class LargestOfList {
    public static void main(String[] args) {
        int[] list = {5, 7, 1, 9, 10, 3, 6};

        System.out.println(largest(list));
    }

    public static int largest(int[] list) {
        return largest(list, 0, list.length - 1);
    }

    public static int largest(int[] list, int start, int end) {
        if (start == end) {
            return list[end];
        }

        int largest = largest(list, start + 1, end);
        if (list[start] > largest) {
            return list[start];
        } else {
            return largest;
        }
    }

    /*
    2 3 1
    largest(list, 0, 2) = 3
    2 > 3 return largest

    largest(list, 1, 2) = 1
    3 > 1 return 3

    largest(list, 2, 2) = 1
    if (1 > 1) return 1
     */
}
