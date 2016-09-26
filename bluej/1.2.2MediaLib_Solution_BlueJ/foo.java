
/**
 * Write a description of class foo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class foo
{
    public static void main(){
        Movie movie = new Movie();
        movie.setTitle("foobar");
        movie.setDuration(127);
        System.out.println(movie.getUserFriendlyDuration());
    }
}
