package utils;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
    public static int[][] readFromFile(String FPath){
        int [][] puzzle=new int[9][9];
        try(Scanner fileSc =new Scanner(new File(FPath))){
            for(int i=0;i<9;i++){
                for(int j=0;j<9;j++){
                    if(fileSc.hasNextInt()){
                        puzzle[i][j]=fileSc.nextInt();
                    }
                }
            }
        }catch (FileNotFoundException e){
            System.out.println("File path = " + FPath+" is invalid!");
            System.exit(1);
        }
        return puzzle;
    }
}
