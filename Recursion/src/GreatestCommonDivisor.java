public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(gcd(21, 15));
    }

    public static int gcd(int m, int n) {
        if (m == n) {
            return m;
        } else if (m > n) {
            return gcd(n, m - n);
        } else {
            return gcd(n, m);
        }
    }
}