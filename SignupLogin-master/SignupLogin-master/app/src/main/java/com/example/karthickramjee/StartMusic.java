package com.example.karthickramjee.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by karthickramjee on 24/07/16.
 */
public class StartMusic extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_music);
    }
    public void playAudio(View view) {
        Intent objIntent = new Intent(this, PlayMusic.class);
        startService(objIntent);
    }

    public void stopAudio(View view) {
        Intent objIntent = new Intent(this, PlayMusic.class);
        stopService(objIntent);
    }
    public void startToast(View view)
    {
        Intent objIntent = new Intent(this, StartToast.class);
        startService(objIntent);
    }
}
