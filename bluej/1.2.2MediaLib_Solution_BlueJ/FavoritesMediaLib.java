
/**
 * Write a description of class FavoritesMediaLib here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FavoritesMediaLib
{
    public static void main(){
        String str = MediaFile.readString();
        String[] strs = str.split("\\|");
        
        int w = 0;
        while(w < strs.length){
            System.out.println(strs[w]);
            w += 2;
        }
        
        System.out.println("\n\nMy Favorite Songs");
        System.out.println("-----------------");
        for(int i=0; i<strs.length;i+=2){
            if(Integer.valueOf(strs[i + 1]) > 7){
                System.out.println(strs[i] + " (" + strs[i + 1] + ")");
            }
        }
        MediaFile.saveAndClose();
    }
}
