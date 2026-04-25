package algorithms;
// BONUS
public class MineSweeper {
    
    final static char BLANK = '.';
    final static char NUMBER = 'n';
    final static char NUM_REVEALED = 'N';
    final static char BLA_REVEALED = '-';
    static char[][] board = {
            { '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', 'n', 'n', 'n', '.' },
            { '.', '.', '.', 'n', 'n', 'n', 'n', 'n', 'n', '.', 'n', '.', '.', '.', },
            { '.', '.', '.', 'n', '.', '.', '.', '.', 'n', 'n', 'n', '.', '.', '.', },
            { '.', '.', '.', 'n', 'n', '.', '.', '.', '.', '.', '.', '.', '.', '.', },
            { '.', '.', '.', '.', 'n', 'n', '.', '.', '.', '.', '.', '.', 'n', 'n' },
            { '.', '.', '.', '.', '.', 'n', 'n', '.', '.', '.', '.', '.', 'n', '.' }
    };
    /*
    ............n.
    ..nnnnnnn.nn..
    ...n....nnn...
    ...nn.........
    ....n.......nn
    ....nn......n.
     */
    public static void main(String[] args) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
        
        revealBoard(3, 8);
        System.out.println();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
    static int[][] directions = {
            { 1, 0 },   // Right
            { -1, 0 },  // Left
            { 0, 1 },   // Down
            { 0, -1 },  // Up
            { 1, 1 },   // Diagonal Down-Right
            { -1, 1 },  // Diagonal Down-Left
            { 1, -1 },  // Diagonal Up-Right
            { -1, -1 }  // Diagonal Up-Left
    };
    public static void revealBoard(int row, int col) {
        if (board[row][col] == NUMBER) {
            board[row][col] = NUM_REVEALED;
            return;
        } 
        
        board[row][col] = BLA_REVEALED;
        for (int i = 0; i < directions.length; i++) {
            int newRow = row + directions[i][0];
            int newCol = col + directions[i][1];
            if (newRow >= 0 && newRow < board.length && newCol >= 0 && newCol < board[0].length
            && board[newRow][newCol] != NUM_REVEALED && board[newRow][newCol] != BLA_REVEALED) {
                revealBoard(newRow, newCol);
            }
        }
    }
}
