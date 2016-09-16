package xyz.devinmui.medialibactivity;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends ListActivity {
    private Song[] songs;

    private ListView songListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
        String songs = "";
        for(int i=0; i<topTenSongs.length;i++){
            songs += topTenSongs[i].getTitle() + "|";
        }

        MediaFile.writeString(songs);
        MediaFile.saveAndClose();
        String str = MediaFile.readString();

        ArrayList songLibrary = new ArrayList();
        assert str != null;
        //String[] foos = str.split("\\|");


        for(Song foo : topTenSongs){
            songLibrary.add(foo);
        }

        SongListAdapter adapter = new SongListAdapter(this, songLibrary);

        setListAdapter(adapter);

        MediaFile.saveAndClose();
    }
}
