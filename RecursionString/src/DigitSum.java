public class DigitSum {
    public static void main(String[] args) {
        System.out.println(digitSum(12345));
    }

    public static int digitSum(int i) {
        if (i == 0) {
            return 0;
        }

        return digitSum(i / 10) + i % 10;
    }
}
