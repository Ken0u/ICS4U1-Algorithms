public class StringRecursion {
    public static void main(String[] args) {
        String s = "askljdf";
        System.out.println(length(s));

        String s1 = "abcd";
        String s2 = "aBcd";
        String s3 = "acde";
        String s4 = "abcjoiwejriower";
        System.out.println(equalsIgnoreCase(s1, s2));
        System.out.println(equalsIgnoreCase(s1, s3));
        System.out.println(equalsIgnoreCase(s1, s4));

        String s5 = "XaaaYaaaZaaaYaaaaY";
        char c = 'Y';

        System.out.println(countChar(s5, c));

        String s6 = "kangaroo";
        String s7 = "kongaroo";
        String s8 = "kaangaro";
        String s9 = "kngr";
        String s10 = "kaangaroor";

        System.out.println(equalsIgnoreVowel(s6, s7));
        System.out.println(equalsIgnoreVowel(s7, s8));
        System.out.println(equalsIgnoreVowel(s8, s9));
        System.out.println(equalsIgnoreVowel(s9, s10));

        System.out.println(moveToEnd("How are you", 'o'));
        System.out.println(reverse("reverse"));

        System.out.println(palindrome("racecar"));
        System.out.println(palindrome("abba"));
        System.out.println(palindrome("hello"));
    }

    public static int length(String s) {
        if (s.equals("")) {
            return 0;
        }

        return 1 + length(s.substring(1));
    }

    final static int CASE_DIFF = 'a' - 'A';
    public static boolean equalsIgnoreCase(String s1, String s2) {
        if (s1.isEmpty() && s2.isEmpty()) { // checks if both lengths are 0
            return true;
        } else if (s1.isEmpty() || s2.isEmpty()) { // checks if either length is 0 but not both 0
            return false;
        }

        return Math.abs(s1.charAt(0) - s2.charAt(0)) == CASE_DIFF || s1.charAt(0) == s2.charAt(0)
                && equalsIgnoreCase(s1.substring(1), s2.substring(1));
    }

    public static int countChar(String s, char c) {
        if (s.isEmpty()) {
            return 0;
        } else if (s.charAt(0) == c) {
            return 1 + countChar(s.substring(1), c);
        } else {
            return countChar(s.substring(1), c);
        }
    }

    public static boolean equalsIgnoreVowel(String s1, String s2) {
        if (s1.isEmpty() && s2.isEmpty()) {
            return true;
        } else if (s1.isEmpty()) { // ONLY s1 is empty
            char c2 = s2.charAt(0);
            // check if remaining letters in s2 is vowel
            if (c2 == 'a' || c2 == 'e' || c2 == 'i' || c2 == 'o' || c2 == 'u') {
                return equalsIgnoreVowel(s1, s2.substring(1));
            }
            return false;
        } else if (s2.isEmpty()) { // ONLY s2 is empty
            char c1 = s1.charAt(0);
            // check if remaining letters in s1 is vowel
            if (c1 == 'a' || c1 == 'e' || c1 == 'i' || c1 == 'o' || c1 == 'u') {
                return equalsIgnoreVowel(s1.substring(1), s2);
            }
            return false;
        }

        char c1 = s1.charAt(0);
        char c2 = s2.charAt(0);

        if (c1 == 'a' || c1 == 'e' || c1 == 'i' || c1 == 'o' || c1 == 'u') {
            // if first character of s1 is vowel skip first character and search rest of s1
            return equalsIgnoreVowel(s1.substring(1), s2);
        } else if (c2 == 'a' || c2 == 'e' || c2 == 'i' || c2 == 'o' || c2 == 'u') {
            // if first character of s2 is vowel skip first character and search rest of s2
            return equalsIgnoreVowel(s1, s2.substring(1));
        } else {
            // if first character of s1 and s2 are both not vowels check if they are equal and search rest of s1 and s2
            return c1 == c2 && equalsIgnoreVowel(s1.substring(1), s2.substring(1));
        }
    }

    public static String moveToEnd(String s, char c){
        if (s.isEmpty()) {
            return s;
        }

        if (s.charAt(0) == c) {
            return moveToEnd(s.substring(1), c) + c;
        } else {
            return s.charAt(0) + moveToEnd(s.substring(1), c);
        }
    }

    public static String reverse(String s) {
        if (s.isEmpty()) {
            return s;
        }

        return reverse(s.substring(1)) + s.charAt(0);
    }

    public static boolean palindrome(String s) {
        if (s.length() <= 1) {
            return true;
        }

        return s.charAt(0) == s.charAt(s.length() - 1) && palindrome(s.substring(1, s.length() - 1));
    }



}
