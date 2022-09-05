package com.example.basicphrasemegs;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void buttonTapped(View view){

        int id = view.getId();
        String ourid = "";
        ourid = view.getResources().getResourceEntryName(id);

        int resourseid = getResources().getIdentifier(ourid , "raw","com.example.basicphrasemegs");
        MediaPlayer mplayer = MediaPlayer.create(this,resourseid);
        mplayer.start();


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
