
/**
 * A movie to save to the library
 * 
 * @author ckinnard
 * @version 3/5/16
 */
public class Movie
{
    private int rating;
    private String title;
    private int duration;

    /**
     * Constructor for objects of class Movie
     */
    public Movie()
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

    public int getDuration() {
        return duration;
    }

    public void setDuration(int d) {
        duration = d;
    }

    public void showHoursMinutes() {
        int hours;
        int minutes;
        
        hours = duration / 60;
        minutes = duration % 60;
        
        System.out.print("Duration of your movie: ");
        System.out.print(hours);      
        System.out.print(" hours and ");
        System.out.print(minutes);
        System.out.println(" minutes.");

    }
}