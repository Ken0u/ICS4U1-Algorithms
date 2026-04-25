public class PrintRow {
    public static void main(String[] args) {
        printRow(5);
    }

    /*
    printRow:
    printRow(n) = System.out.print('*') + printRow(n - 1);
    where n > 0
     */
    public static void printRow(int n) {
        if (n > 0) {
            System.out.print('*');
            printRow(n - 1);
        }
    }

    /*
    Alternate Version:
    public static void printRow(int n) {
        if (n == 0) {
            return;
        } else {
            System.out.print('*');
            printRow(n - 1);
        }
    }
    */
}
