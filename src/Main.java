import utils.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("welcome to Suduko puzzle solver :)");
        Scanner scanner =new Scanner(System.in);
        int[][] puzzle=new int[9][9];

        if(args.length>0){
            if(args[0].equalsIgnoreCase("f")){
                if(args.length>1){
                    String filePath = args[1];
                    System.out.println("Readline puzzle from :" +filePath);
                    puzzle = FileReader.readFromFile(filePath);
                }else{
                    System.out.println("Error: Source file path not specified after 'f' !");
                    System.exit(1);
                }
            }else if (args[0].equalsIgnoreCase("m")){
                //Manual mode
                System.out.println("Manual mode selected ");
                puzzle=StandardInput.readFromUser(scanner);
            }else{
                System.out.println("Invalid arguments , use <java Main 'f <filePath>' OR 'm'>");
                System.exit(1);
            }
        }

    }
}