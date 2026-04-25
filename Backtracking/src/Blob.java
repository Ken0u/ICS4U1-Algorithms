import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Blob {

    static char[][] map;
    public static void main(String[] args ){

        try {
            BufferedReader br = new BufferedReader(new FileReader("blob.txt"));
            Scanner sc = new Scanner(System.in);

            int rows = Integer.parseInt(br.readLine());
            int cols = Integer.parseInt(br.readLine());
            map = new char[rows][cols];
            int row, col;
            
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    map[i][j] = (char) br.read();
                }
                br.readLine();
            }
            
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(map[i][j]);
                }
                System.out.println();
            }
            
//            System.out.println("Enter blob erase info");
//            System.out.print("Enter the row to start: ");
//            row = sc.nextInt();
//            System.out.print("Enter column to start: ");
//            col = sc.nextInt();
//            
//            erase(row, col);

            System.out.println("Enter blob count info");
            System.out.print("Enter the row to start: ");
            row = sc.nextInt();
            System.out.print("Enter column to start: ");
            col = sc.nextInt();

            System.out.println(count(row, col));
            
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(map[i][j]);
                }
                System.out.println();
            }

        } catch (IOException e) {
            System.out.println("An error reading the file occurred.");
        }
    }
    
    static int[][] directions = {{-1, 0}, {-1, 1}, {0, 1}, {1, 1}, {1, 0}, {1, -1}, {0, -1}, {-1, -1}};
    public static void erase(int row, int col) {
        map[row][col] = ' ';
        
        for (int i = 0; i < directions.length; i++) {
            int newRow = row + directions[i][0];
            int newCol = col + directions[i][1];
            if (map[newRow][newCol] == '*') {
                erase(newRow, newCol);
            }
        }
    }
    
    public static int count(int row, int col) {
        map[row][col] = '+';
        int count = 1; // visited square adds one to count  
        
        for (int i = 0; i < directions.length; i++) {
            int newRow = row + directions[i][0];
            int newCol = col + directions[i][1];
            if (map[newRow][newCol] == '*') {
                count += count(newRow, newCol);
            }
        }
        
        return count;
    }
    
    /*
    
    cnt = 1, 2
    
     *
    *
    
     */
}
