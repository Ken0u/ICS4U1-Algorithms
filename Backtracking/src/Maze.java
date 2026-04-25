  /** 
   File Name: Maze.java
   Name: I. Lam
   Class: ICS4U1
   Date: October 19, 2022
   Description: This program find an exit of a maze, given the initial position.
   It makes use a recursive solution to find the path.  
*/
   import java.io.*;
   import java.util.*;
   
   public class Maze {
      private static final char WALL = 'W';
      private static final char EXIT = 'X';
      private static final char OPEN = '.';
      private static final char TRIED = '-';
      private static final char GOOD_PATH = '+';
      private static char[][] map;
   
      public static void main (String[] args) {
      	try {
            // Reading map from text file
      		BufferedReader in = new BufferedReader (new FileReader("data.txt"));
            int row = Integer.parseInt(in.readLine());
      		int col = Integer.parseInt(in.readLine());
      		map = new char[row][col];
      		for (int i = 0; i < row; i++) {
      			for (int j = 0; j < col; j++) {
      				map[i][j] = (char)(in.read());
      			}
      			in.readLine();
      		}
      		
            // Getting the starting position from user
      		Scanner sc = new Scanner(System.in);
            System.out.println("Starting position");
      		System.out.print("Enter row:  ");
      		int rowIn = sc.nextInt();
      		System.out.print("Enter column:  ");
      		int colIn = sc.nextInt();
      		System.out.println(findExitFrom3(rowIn, colIn));
      		
            // Printing the map after the recursive call
      		for (int i = 0; i < row; i++) {
      			for (int j = 0; j < col; j++) {
      				System.out.print(map[i][j]);
      			}
      			System.out.println();
      		}
      		
      	} catch (IOException iox) {
      		System.out.println("Problem reading file.");
      	}
      }

       /**
        * The recursive method that find the exit of the maze given the current location
        *
        * @param  row    the row # of the current location
        * @param  col    the column # of the current location
        * @return        true if exit can be found, false otherwise
        */
       public static boolean findExitFrom (int row, int col) {
           boolean successful = false;

           if (map[row][col] == Maze.EXIT) {
               // base case: found the exit
               map[row][col] = Maze.GOOD_PATH;
               successful = true;
           } else {
               map[row][col] = Maze.TRIED;
               // try moving south
               if (map[row+1][col] == Maze.OPEN || map[row+1][col] == Maze.EXIT) {
                   successful = findExitFrom(row+1, col);
               }
               if (!successful){
                   // try moving east
                   if (map[row][col+1] == Maze.OPEN || map[row][col+1] == Maze.EXIT) {
                       successful = findExitFrom(row, col+1);
                   }
               }
               if (!successful){
                   // try moving north
                   if (map[row-1][col] == Maze.OPEN || map[row-1][col] == Maze.EXIT) {
                       successful = findExitFrom(row-1, col);
                   }
               }
               if (!successful){
                   // try moving west
                   if (map[row][col-1] == Maze.OPEN || map[row][col-1] == Maze.EXIT) {
                       successful = findExitFrom(row, col-1);
                   }
               }
               if (successful) {
                   // mark this as part of a good path
                   map[row][col] = Maze.GOOD_PATH;
               }
           }
           return successful;
       }
       public static boolean findExitFrom2 (int row, int col) {
           boolean successful = false;

           if (map[row][col] == Maze.EXIT) {
               successful = true;
               map[row][col] = Maze.GOOD_PATH;
           } else {
               map[row][col] = Maze.TRIED;

               if (map[row][col - 1] == Maze.OPEN || map[row][col - 1] == Maze.EXIT) {
                   successful = findExitFrom2(row, col - 1);
               }
               if ((map[row][col + 1] == Maze.OPEN || map[row][col + 1] == Maze.EXIT) && !successful) {
                   successful = findExitFrom2(row, col + 1);
               }
               if ((map[row - 1][col] == Maze.OPEN || map[row - 1][col] == Maze.EXIT) && !successful) {
                   successful = findExitFrom2(row - 1, col);
               }
               if ((map[row + 1][col] == Maze.OPEN || map[row + 1][col] == Maze.EXIT) && !successful) {
                   successful = findExitFrom2(row + 1, col);
               }

               if (successful) {
                   map[row][col] = Maze.GOOD_PATH;
               }
           }

           return successful;
       }
       static int[][] directions = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}}; // N, E, S, W
       public static boolean findExitFrom3 (int row, int col) {
           boolean successful = false;

           if (map[row][col] == Maze.EXIT) {
               successful = true;
               map[row][col] = Maze.GOOD_PATH;
           } else {
               map[row][col] = Maze.TRIED;

               for (int i = 0; i < directions.length; i++) {
                   int newRow = row + directions[i][0];
                   int newCol = col + directions[i][1];
                   if ((map[newRow][newCol] == Maze.OPEN || map[newRow][newCol] == Maze.EXIT) && !successful) {
                       successful = findExitFrom3(newRow, newCol);
                   }
               }

               if (successful) {
                   map[row][col] = Maze.GOOD_PATH;
               }
           }

           return successful;
       }

}