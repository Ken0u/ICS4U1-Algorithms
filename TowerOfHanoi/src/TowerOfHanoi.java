public class TowerOfHanoi {
    public static void main(String[] args) {
        move(10, 1, 3);
    }

    public static void move(int height, int from, int to) {

        if (height == 1) {
            System.out.printf("Move from %d to %d%n", from, to);
        } else {
            int empty = 6 - (from + to);
            move(height - 1, from, empty);
            System.out.printf("Move from %d to %d%n", from, to);
            move(height - 1, 6 - empty, to);
        }
    }
}