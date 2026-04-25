import java.util.Scanner;

public class Golf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int holeLength, clubs;
        int[] clubLengths;


        System.out.print("Enter hole length: ");
        holeLength = sc.nextInt();
        System.out.print("Enter number of clubs: ");
        clubs = sc.nextInt();
        clubLengths = new int[clubs];

        System.out.println("Enter the club lengths one per line: ");
        for (int i = 0; i < clubs; i++) {
            clubLengths[i] = sc.nextInt();
        }

        int leastShots = golf(holeLength, clubLengths);
        if (leastShots != -1) {
            System.out.println("The least number of shots is: " + leastShots);
        } else {
            System.out.println("It is impossible to get into the hole.");
        }
    }

    // min = 2
    // 3 {2, 1} -> 2
    public static int golf(int distance, int[] clubs) {
        if (distance == 0) {
            return 0;
        } else if (distance < 0) {
            return -1;
        }

        int minShots = -1;
        for (int i = 0; i < clubs.length; i++) { // impossible is true if all shots return -1
            int shotsFromCurrent = golf(distance - clubs[i], clubs);
            if (shotsFromCurrent != -1 && (shotsFromCurrent < minShots || minShots == -1)) {
                // basically adding later so we don't add when its -1
                minShots = shotsFromCurrent + 1;
            }
        }
        
        return minShots;
    }
}
