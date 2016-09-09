
/**
 * A song to save to the library
 * 
 * @author ckinnard
 * @version 3/5/16
 */
public class Song
{
    private static int numSongsInLibrary;

    private String title;
    private int rating;
    private boolean favorite;
    private double  price;
    /**
     * Constructor for objects of class Song
     */
    public Song()
    {
        // initialise instance variables
        rating = 0;
        title = "";
        price = 0.0;

        numSongsInLibrary = numSongsInLibrary + 1;
    }

    public Song(String title, double price) {
        this.title = title;
        this.price = price;

        numSongsInLibrary = numSongsInLibrary + 1;
    }

    public Song(String title, double price, int rating) {
        this.title = title;
        this.price = price;
        this.rating = rating;

        numSongsInLibrary = numSongsInLibrary + 1;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double p) {
        price = p;
    }

    public void addToFavorites() {
        favorite = true;
    }
    
    public int getNumSongsInLibrary() {
        return numSongsInLibrary;
    }
}
