public class DecimalToBinary {
    public static void main(String[] args) {
        System.out.println(decimalToBinary(4));
        System.out.println(decimalToBinary(0));
        System.out.println(decimalToBinary(1));
        System.out.println(decimalToBinary(12));
    }

    public static String decimalToBinary(int i) {
        if (i == 0) {
            return "0";
        }

        if (i % 2 == 0) {
            return decimalToBinary(i / 2) + "0";
        } else {
            return decimalToBinary(i / 2) + "1";
        }
    }
}
