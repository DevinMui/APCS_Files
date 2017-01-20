
/**
 * Write a description of class ArrayMistakes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayMistakes
{
    public static void main()

    {
    
        int[] nums = {6, 9, 14, 19};
    
        System.out.print("\nForward");
    
        for (int i = 0; i < nums.length; i++) { 
    
           System.out.print(": " + nums[i]);
    
        }
    
            
    
        System.out.print("\nBackward" );
    
        for (int i = nums.length - 1; i >= 0; i--) { 
    
           System.out.print( ": " + nums[i]);
    
        }
    }
}
