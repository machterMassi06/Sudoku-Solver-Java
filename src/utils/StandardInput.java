package utils;
import java.util.Scanner;
public class StandardInput {
    public static int[][] readFromUser(Scanner scanner){
        int [][] puzzle = new int[9][9];
        System.out.println("Enter the 9 lines of the Sudoku puzzle separated by (use 0 for empty boxes):");
        for (int i=0;i<9;i++){
            String [] line=scanner.nextLine().split(" ");
            for(int k=0;k<9;k++){
                puzzle[i][k]=Integer.parseInt(line[k]);
            }
        }
        return puzzle;
    }
}
