package xyz.devinmui.synthesizer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class SynthesizerActivity extends AppCompatActivity {
    private static final String TAG = SynthesizerActivity.class.getName();

    private Button button1;

    private String url = "http://04d2ce2c.ngrok.io";

    private Button button2;
    private final int WHOLE_NOTE = 1000;
    private MediaPlayer mpA;
    private MediaPlayer mpB;
    private MediaPlayer mpBb;
    private MediaPlayer mpC;
    private MediaPlayer mpCs;
    private MediaPlayer mpD;
    private MediaPlayer mpDs;
    private MediaPlayer mpE;
    private MediaPlayer mpF;
    private MediaPlayer mpFs;
    private MediaPlayer mpG;
    private MediaPlayer mpGs;
    private MediaPlayer mpHighE;
    private MediaPlayer mpHighF;
    private MediaPlayer mpHighFs;
    private MediaPlayer mpHighG;

    private MediaPlayer array[];
    private MediaPlayer twinkle[];
    private MediaPlayer twinkle2[];

    Map<String, MediaPlayer> map = new HashMap<String, MediaPlayer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_synthesizer);
        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        mpA = MediaPlayer.create(this, R.raw.scalea);
        mpB = MediaPlayer.create(this, R.raw.scaleb);
        mpBb = MediaPlayer.create(this, R.raw.scalebb);
        mpC = MediaPlayer.create(this, R.raw.scalec);
        mpCs = MediaPlayer.create(this, R.raw.scalecs);
        mpD = MediaPlayer.create(this, R.raw.scaled);
        mpDs = MediaPlayer.create(this, R.raw.scaleds);
        mpE = MediaPlayer.create(this, R.raw.scalee);
        mpF = MediaPlayer.create(this, R.raw.scalef);
        mpFs = MediaPlayer.create(this, R.raw.scalefs);
        mpG = MediaPlayer.create(this, R.raw.scaleg);
        mpGs = MediaPlayer.create(this, R.raw.scalegs);
        mpHighE = MediaPlayer.create(this, R.raw.scalehighe);
        mpHighF = MediaPlayer.create(this, R.raw.scalehighf);
        mpHighFs = MediaPlayer.create(this, R.raw.scalehighfs);
        mpHighG = MediaPlayer.create(this, R.raw.scalehighg);
        map.put("a", mpA);
        map.put("b", mpB);
        map.put("bb", mpBb);
        map.put("c", mpC);
        map.put("cs", mpCs);
        map.put("d", mpD);
        map.put("ds", mpDs);
        map.put("e", mpE);
        map.put("f", mpF);
        map.put("fs", mpFs);
        map.put("g", mpG);
        map.put("gs", mpGs);
        map.put("highe", mpHighE);
        map.put("highf", mpHighF);
        map.put("highfs", mpHighFs);
        map.put("highg", mpHighG);

//        array = new MediaPlayer[] {mpA, mpB, mpBb, mpC, mpCs, mpD, mpDs, mpE, mp};
        array = new MediaPlayer[] { mpE, mpFs, mpG, mpA, mpB, mpCs, mpD, mpE };
        twinkle = new MediaPlayer[] { mpA, mpA, mpHighE, mpHighE, mpHighFs, mpHighFs, mpHighE, mpD, mpD, mpCs, mpCs, mpB, mpB, mpA };
        twinkle2 = new MediaPlayer[] {};
    }
    OkHttpClient client = new OkHttpClient();
    public void playOnline(View v) throws IOException {

        Request request = new Request.Builder()
                .url(url)
                .build();

        client.newCall(request).enqueue(new Callback(){

            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
//                String ayy = run("http://localhost:3000/");
                String ayy = response.body().string();
                String[] ayy_split = ayy.split(" ");
                for(int i=0;i<ayy_split.length;i++){
                    map.get(ayy_split[i]).start();
//                    System.out.println(ayy_split[i]);
                    try {
                        delayPlaying(WHOLE_NOTE / 4);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        });

    }

    public void onText(View v){
        EditText editText = (EditText) findViewById(R.id.editText);
        String ayy = editText.getText().toString();
        String[] ayy_split = ayy.split(" ");
        for(int i=0;i<ayy_split.length;i++){
            map.get(ayy_split[i]).start();
//                    System.out.println(ayy_split[i]);
            try {
                delayPlaying(WHOLE_NOTE / 4);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    String run(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();

        Response response = client.newCall(request).execute();
        return response.body().string();
    }

    private void delayPlaying(int delay) throws InterruptedException {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            Log.e("SynthesizerActivity","Audio playback interrupted");
        }
    }

    // 6 & 7
    public void challenge6(View v){
        //A, A, High E, High E, High F Sharp, High F Sharp, High E, D, D, C Sharp, C Sharp, B, B, A
        try {
            for(int i=0;i<twinkle.length;i++){
                twinkle[i].start();
                delayPlaying(WHOLE_NOTE / 4);
            }
        } catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    public void challenge9(View v){
        //High E, High E, D, D, C Sharp, C Sharp, B
        try {
            for(int i=0;i<twinkle.length;i++){
                twinkle[i].start();
                delayPlaying(WHOLE_NOTE / 4);
            }
            for(int i=0;i<twinkle2.length;i++){
                twinkle2[i].start();
                delayPlaying(WHOLE_NOTE / 4);
            }
        } catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    // 1 & 3
    public void challenge3(View v){
        try {
            for(int i=0;i<array.length;i++){
                array[i].start();
                delayPlaying(WHOLE_NOTE / 4);
            }
        } catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    public void onButton1Click(View v){
        mpE.seekTo(0);
        Log.i(TAG, "Button 1 Clicked");
        mpE.start();
    }

    public void onButton2Click(View v){
        mpF.seekTo(0);
        Log.i(TAG, "Button 2 Clicked");
        mpF.start();
    }
}
