import java.util.ArrayList;
/**
 * Write a description of class Algorithms here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Algorithms
{
    public static void main(){
        Song[] topTenSongs = {
          new Song("The Twist", 20, 1),
          new Song("Smooth", 20, 2),
          new Song("Mack the Knife", 25, 3),
          new Song("How Do I Live", 30, 4),
          new Song("Party Rock Anthem", 54, 5),
          new Song("I Gotta Feeling", 90, 6),
          new Song("Macarena", 80, 7),
          new Song("Physical", 10, 8),
          new Song("You Light Up My Life", 12, 9),
          new Song("Hey Jude", 13, 10)
        };
        //for(Song song:topTenSongs){
        //    System.out.println(song.getTitle() + " " + String.valueOf(song.getRating()));
        //}
        int high = 0;
        int index = 0;
        for(int i=0;i<topTenSongs.length;i++){
            if(topTenSongs[i].getRating() > high){
                high = topTenSongs[i].getRating();
                index = i;
            }
        }
        //System.out.println(topTenSongs[index].getTitle());
        
        int tied = 0;
        int high2 = 0;
        ArrayList arr = new ArrayList();
        for(Song song:topTenSongs){
            if(song.getRating() == high){
                continue;
            } 
            if(song.getRating() > high2){
                high2 = song.getRating();
                tied = 1;
                arr.clear();
                arr.add(song.getTitle());
            } else if(song.getRating() == high2){
                tied++;
                arr.add(song.getTitle());
            }
        }
        for(int i=0;i<topTenSongs.length;i++){
            if((topTenSongs[i].getTitle()).equals("How Do I Live")){
                index = i;
                topTenSongs[i] = topTenSongs[i + 1];
            } if((i > index) && (i < topTenSongs.length - 1)){
                topTenSongs[i] = topTenSongs[i + 1];
            } else if(i==topTenSongs.length-1){
                topTenSongs[i] = null;
            }
        }
        
        for(Song song:topTenSongs){
            if(song != null)
                System.out.println(song.getTitle());
        }
        
        // insert
        
        topTenSongs[topTenSongs.length - 1] = new Song("Foobar", 20, 10);
    }
}
