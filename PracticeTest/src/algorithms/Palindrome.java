package algorithms;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(palValue("racecar"));
        System.out.println(palValue("engine"));
        System.out.println(palValue("dootz"));
    }
    
    public static String palValue(String s) {
        if (s.length() <= 1) {
            return s;
        }
        
        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            return s.charAt(0) + palValue(s.substring(1, s.length() - 1)) + s.charAt(s.length() - 1);
        }
        return palValue(s.substring(1, s.length() - 1));
    }
}
