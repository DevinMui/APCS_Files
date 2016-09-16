package xyz.devinmui.medialibactivity;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SongListAdapter extends ArrayAdapter<Song> {
    Activity parentActivity;
    public SongListAdapter(Context context, ArrayList<Song> songList){
        super(context, 0, songList);
        parentActivity = (Activity) this.getContext();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = parentActivity.getLayoutInflater()
                    .inflate(R.layout.list_item_song, null);
        }

        Song song = getItem(position);

        TextView nameTextView =
                (TextView)convertView
                        .findViewById(R.id.song_list_item_title);
        nameTextView.setText(song.getTitle());

        return convertView;

    }
}