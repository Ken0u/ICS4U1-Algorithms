import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, n, result;

        System.out.print("Enter X: ");
        x = sc.nextInt();
        System.out.print("Enter N: ");
        n = sc.nextInt();

        result = power(x, n);
        System.out.println(result);

//        System.out.println(power(x, n));
    }

    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }

        return power(x, n - 1) * x;
    }
}
