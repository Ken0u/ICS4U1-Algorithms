public class PatternGenerator {
    public static void main(String[] args) {
        generate(4, 2);
    }


    public static void generate(int n, int k) {
        generate(4, 2, "");
    }

    public static void generate(int n, int k, String soFar) {
        if (n == 0) {
            System.out.println(soFar);
            return;
        }

        if (k > 0) { // only add one if there are ones remaining
            generate(n - 1, k - 1, soFar + "1");
        }
        if (n - k > 0) { // only add zero if there are zeros remaining (zeros = n - k)
            generate(n - 1, k, soFar + "0");
        }
    }
}