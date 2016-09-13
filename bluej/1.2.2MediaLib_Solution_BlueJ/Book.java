
/**
 * A book to save to the library
 * 
 * @author ckinnard
 * @version 3/5/16
 */
public class Book
{
    private int rating;
    private String title;

    /**
     * Constructor for objects of class Movie
     */
    public Book()
    {
        // initialise instance variables
        rating = 0;
        title = "";
    }

    public String getTitle() {
        return title;
    }
    
    public void setTitle(String t) {
        title = t;
    }
    
    
    public int getRating() {
        return rating;
    }
    
    public void setRating(int r) {
        rating = r;
    }
}
