public class Reverse {
    public static void main(String[] args) {
        String s = "abcde";
        s = reverse(s);
        System.out.println(s);
    }

    public static String reverse(String s) {
        if (s.length() == 0) {
            return s;
        }

        return reverse(s.substring(1)) + s.charAt(0);
    }
}
