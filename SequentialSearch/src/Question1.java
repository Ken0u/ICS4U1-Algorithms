public class Question1 {
    public static void main(String[] args) {
        String[] list = {"happy", "sad", "bored", "tired"};

        System.out.println(sequentialSearch(list, "sad"));
        System.out.println(sequentialSearch(list, "tired"));
        System.out.println(sequentialSearch(list, "a"));
    }

    static int sequentialSearch(String[] list, String item) {
        for (int i = 0; i < list.length; i++) {
            if (list[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }
}