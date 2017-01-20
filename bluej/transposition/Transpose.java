import java.util.Scanner;
/**
 * Write a description of class Transpose here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Transpose
{
    public static void main(){
        Scanner in = new Scanner(System.in);
        while(true){
            System.out.print("> ");
            String line = new String(in.nextLine().toUpperCase());
            if(line.equals(":Q")){
                break;
            }
            line = line.replace("CAN I", "WHAT IF YOU DO NOT").replace("MY", "YOUR");
            System.out.println(line);
        }
    }
}
