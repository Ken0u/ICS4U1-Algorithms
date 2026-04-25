public class PrintTriangle {
    public static void main(String[] args) {
        printTriangle(5);
    }

    /*
    N-triangle = printTriangle(n)
               = printTriangle(n - 1) + System.out.println(n asterisks);
               where n >= 1

     */
    public static void printTriangle(int n) {
        if (n >= 1) {
            printTriangle(n - 1);

            for (int i = 0; i < n; i++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

}
