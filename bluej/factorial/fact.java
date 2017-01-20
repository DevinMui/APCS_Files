
/**
 * Write a description of class fact here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fact
{
    public int fact(int n){
        if(n == 0 || n == 1){
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }
}
