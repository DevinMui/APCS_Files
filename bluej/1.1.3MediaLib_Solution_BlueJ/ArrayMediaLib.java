
/**
 * Write a description of class ArrayMediaLib here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayMediaLib
{
    public static void main(){
        String[] sharingFriends = {"foo", "bar", "m8", "r8", "me", "8/8"};
        for(String friend : sharingFriends){
            System.out.println(friend);
        }
        int[] daysBtwnPurchase = {2, 5, 1, 2, 4, 2, 1, 3};
        int total = 0;
        for(int day : daysBtwnPurchase){
            total += day;
        }
        System.out.println((double) total / daysBtwnPurchase.length);
        
        Song[] topTenSongs = {

                      new Song("The Twist"),

                      new Song("Smooth"),
                      new Song("Mack the Knife"),
                      new Song("How Do I Live"),
                      new Song("Party Rock Anthem"),
                      new Song("I Gotta Feeling"),
                      new Song("Macarena"),
                      new Song("Physical"),
                      new Song("You Light Up My Life"),
                      new Song("Hey Jude")
                      };
        for(Song song : topTenSongs){
            System.out.println(song.getTitle());
        }
        
        // change the array

        System.out.println("—BEFORE--");

        for (Song changeSong : topTenSongs) { 

            changeSong = new Song("test");

            System.out.println(changeSong.getTitle());

        }

        // show the array

        System.out.println("—AFTER--");

        for (Song showSong : topTenSongs) {

            System.out.println(showSong.getTitle());

        }
        int i = 1;
        for(Song song: topTenSongs){
            if(i % 3 == 0){
                song.setPrice(0.99);
            } else {
                song.setPrice(1.29);
            }
            i++;
        }
        
        for(Song song: topTenSongs){
            System.out.print(song.getTitle());
            System.out.print(song.getPrice());
            System.out.println();
        }
    }
       
    
}
