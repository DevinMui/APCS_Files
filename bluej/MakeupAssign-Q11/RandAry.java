
/**
 * Write a description of class RandomArray2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;

public class RandAry
{
    // instance variables - replace the example below with your own
    int[] tstAry; 
    Random rand = new Random();
    
    public RandAry(int testSize){       
        tstAry=new int[testSize];
        for (int i=0;i<tstAry.length;i++){
            tstAry[i]=rand.nextInt(testSize)+1;
        }
    }

    public void printRandAry(){
        for (int i=0;i<tstAry.length;i++){
            System.out.println(tstAry[i]);
            
        } 
    }
    
     public int[] getRandAry(){
        return tstAry;            
        } 
}
   
 
