package org.example.pltw.medialib;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

class Greeter {

    public String message = "Welcome to your Media Library";

}

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Movie movie = new Movie();
        movie.setTitle("Harry Potter");
        Book book = new Book();
        book.setTitle("Harry Potter");
        System.out.println(movie.getTitle());
        System.out.println(book.getTitle());

        TextView welcomeText = (TextView) findViewById(R.id.welcomeTextView);
        //welcomeText.setText("Welcome to your Media Library");
        Greeter greeter = new Greeter();

        welcomeText.setText(greeter.message);
    }

    /**
     * This method is called when the Show Contents button is clicked
     **/
    public void showMedia(View v) {
        // omg this is too repetitive pls use arr/loop
        TextView outputText = (TextView) findViewById(R.id.mediaLibText);
        Book book1 = new Book();
        book1.setTitle("harry potter");
        Book book2 = new Book();
        book2.setTitle("harry potter");
        Song song1 = new Song("foobar");
        Song song2 = new Song("foobar");
        Movie movie1 = new Movie();
        movie1.setTitle("harry potter");
        Movie movie2 = new Movie();
        movie2.setTitle("harry potter");
        outputText.append("\n");
        outputText.append("BOOKS: \n");
        outputText.append(book1.getTitle());
        outputText.append("\n");
        outputText.append(book2.getTitle());
        outputText.append("\n");
        outputText.append("SONGS: \n");
        outputText.append(song1.getTitle());
        outputText.append("\n");
        outputText.append(song2.getTitle());
        outputText.append("\n");
        outputText.append("MOVIES: \n");
        outputText.append(movie1.getTitle());
        outputText.append("\n");
        outputText.append(movie2.getTitle());
        outputText.append("\n");
    }
}
