
/**
 * Write a description of class LoopingMediaLib here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LoopingMediaLib
{
    public static void main(){
        String str = MediaFile.readString();
        String[] strs = str.split("\n");
        
        for(int i=0;i<strs.length;i++){
            System.out.println(strs[i]);
        }
        
        int w = 0;
        while(w < strs.length){
            System.out.println(strs[w]);
            w++;
        }
        
        for(int i=0;i<strs.length;i++){
            String[] foobar = strs[i].split("\\|");
            System.out.println("Title: " + foobar[0]);
            System.out.println("Rating: " + foobar[1]);
        }
        MediaFile.saveAndClose();
    }
}
