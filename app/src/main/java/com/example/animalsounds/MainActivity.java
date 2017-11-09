package com.example.animalsounds;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.media.MediaPlayer;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity
                          implements View.OnClickListener{

    private final ImageView imgArtist[] = new ImageView[4];
    private MediaPlayer mPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgArtist[0] = (ImageView) findViewById(R.id.alessiacara1);
        imgArtist[1] = (ImageView) findViewById(R.id.charlieputh1);
        imgArtist[2] = (ImageView) findViewById(R.id.harrystyles1);
        imgArtist[3] = (ImageView) findViewById(R.id.niallhoran1);
        for (int i = 0; i < imgArtist.length; i++ ){
            imgArtist[i].setOnClickListener(this);
        }
    }

    public void onClick(View v){
        int resId = 0;
        switch (v.getId()){
            case R.id.alessiacara1:
                resId = R.raw.alessiacara1;
                break;
            case R.id.charlieputh1:
                resId = R.raw.charlieputh1;
                break;
            case R.id.harrystyles1:
                resId = R.raw.harrystyles1;
                break;
            case R.id.niallhoran1:
                resId = R.raw.niallhoran1;
                break;
        }

        playSound(resId);
    }

    private void playSound(int id){
        if(mPlayer != null){
            mPlayer.stop();
            mPlayer.release();
        }

        mPlayer = MediaPlayer.create(this ,id);
        mPlayer.start();
    }


}
