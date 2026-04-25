public class PalindromeValue {
    public static void main(String[] args ){
        System.out.println(palScore("racecar"));
        System.out.println(palScore("robot"));
        System.out.println(palScore("hello"));
        System.out.println(palScore("banana"));
        
    }
    
    public static int palScore(String s) {
        if (s.length() == 0) {
            return 0;
        } else if (s.length() == 1) {
            return 1;
        }
        
        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            return 2 + palScore(s.substring(1, s.length() - 1));
        }
        return palScore(s.substring(1, s.length() - 1));
    }
}
