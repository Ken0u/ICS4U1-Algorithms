public class TowerOfHanoi {
    public static void main(String[] args) {
        towerOfHanoi(3, 1, 3);
        System.out.println(countMoves(3, 1, 3));
    }

    public static int countMoves(int height, int from, int to) {
        if (height == 1) {
            return 1; // 1 move to move (from -> to)
        } else {
            int empty = 6 - (from + to);

            return countMoves(height - 1, from, empty) + 1 + countMoves(height - 1, empty, to);

            /*
            int moves = 0;
            moves += countMoves(height - 1, from, empty); // add all moves req. to move height - 1 (from -> empty)
            moves++; // move from (from -> to)
            moves += countMoves(height - 1, empty, to); // add all moves req. to move height - 1 (empty -> to)
            return moves;
             */
        }
    }

    public static void towerOfHanoi(int height, int from, int to) {
        if (height == 1) {
            System.out.printf("Move disk from %d to %d%n", from, to);
        } else {
            int empty = 6 - (from + to);
            towerOfHanoi(height - 1, from, empty);
            System.out.printf("Move disk from %d to %d%n", from, to);
            towerOfHanoi(height - 1, empty, to);
        }
    }
}