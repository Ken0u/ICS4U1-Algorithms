public class PrimeNumber {
    public static void main(String[] args) {
//        System.out.println(prime(1));
        System.out.println(prime(2));
        System.out.println(prime(3));
        System.out.println(prime(4));
        System.out.println(prime(5));
        System.out.println(prime(6));
        System.out.println(prime(10));
        System.out.println(prime(23));
    }

    public static boolean prime(int n) {
        return prime(n, n - 1);
    }
    public static boolean prime(int n, int d) {
        if (d == 1) {
            return true;
        } else if (n % d == 0) {
            return false;
        } else {
            return prime(n, d - 1);
        }
    }
}
