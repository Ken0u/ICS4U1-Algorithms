public class Boggle {
    public static void main(String[] args) {
        char[][] board = {
                {'A', 'W', 'E', 'R', 'T'},
                {'X', 'S', 'D', 'F', 'G'},
                {'Y', 'Q', 'C', 'V', 'B'},
                {'Z', 'U', 'A', 'B', 'P'},
                {'G', 'H', 'J', 'O', 'L'}
        };
        
        System.out.println(boggle(board, "CAB"));
        System.out.println(boggle(board, "WAXY"));
        System.out.println(boggle(board, "JOB"));
        System.out.println(boggle(board, "BOX"));
        System.out.println(boggle(board, "POP"));
        System.out.println(boggle(board, "BOB"));
    }
    
    public static boolean boggle(char[][] board, String word) {
        boolean found = false;
        for (int i = 0; i < board.length && !found; i++) {
            for (int j = 0; j < board[i].length && !found; j++) {
                found = boggle(board, word, i, j, 0);
            }
        }
        return found;
    }
    
    static int[][] directions = {{0, 1}, {1, 0}, {-1, 0}, {0, -1}};
    
    public static boolean boggle(char[][] board, String word, int row, int col, int index) {
        if (word.charAt(index) != board[row][col]) {
            return false;
        } else if (index == word.length() - 1) {
             return true;
        }
        
        char letter = board[row][col];
        board[row][col] = '-';
        boolean found = false;
        
        for (int i = 0; i < directions.length; i++) {
            int newRow = row + directions[i][0];
            int newCol = col + directions[i][1];
            if (newRow >= 0 && newRow < board.length && newCol >= 0 && newCol < board[0].length && !found 
                    && board[newRow][newCol] != '-') {
                found = boggle(board, word, newRow, newCol, index + 1);
            }
        }
        board[row][col] = letter;
        return found;
    }
}
