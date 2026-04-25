package algorithms;
// BONUS
public class TernaryGenerator {
    public static void main(String[] args) {
        generate(3, 1, "");
    }
    
    public static void generate(int digits, int maxTwos, String soFar) {
        if (digits == 0) {
            System.out.println(soFar);
        } else {
            if (maxTwos > 0) {
                generate(digits - 1, maxTwos - 1, soFar + '2');
            }

            generate(digits - 1, maxTwos, soFar + '0');
            generate(digits - 1, maxTwos, soFar + '1');
        }
    }
}
