public class StringPermutation {
    public static void main(String[] args) {
        permute("abcdd");
    }

    public static void permute(String s) {
        permute(s, "");
    }

    public static void permute(String remaining, String soFar) {
        if (remaining.isEmpty()) {
            System.out.println(soFar);
        } else {
            for (int i = 0; i < remaining.length(); i++) {
                // pass in everything but the character as remaining and add character to so far
                permute(remaining.substring(0, i) + remaining.substring(i + 1),
                        soFar + remaining.charAt(i));
            }
        }
    }
}
