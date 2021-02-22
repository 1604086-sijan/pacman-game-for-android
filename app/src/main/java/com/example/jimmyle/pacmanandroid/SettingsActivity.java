package com.example.jimmyle.pacmanandroid;

import android.app.Activity;
import android.os.Bundle;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import java.io.IOException;




public class SettingsActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_layout);
        MainActivity.getPlayer().start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        MainActivity.getPlayer().pause();
    }

    private static final String TAG = "SettingsActivity";

    public void playMusic(View view) {
        if (MainActivity.getPlayer().isPlaying()) {
            MainActivity.getPlayer().pause();
        } else {
            MainActivity.getPlayer().start();

        }
    }

    public void changeToEasyDifficulty(View view) {
        Globals g = Globals.getInstance();
        g.setLevelSelector(0);
        clearColor(view);
        changeColor(view);

    }

    public void changeToMediumDifficulty(View view) {
        Globals g = Globals.getInstance();
        g.setLevelSelector(1);
        clearColor(view);
        changeColor(view);
    }

    public void changeToHardDifficulty(View view) {
        Globals g = Globals.getInstance();
        g.setLevelSelector(2);
        clearColor(view);
        changeColor(view);

    }

    public void changeToExpertDifficulty(View view) {
        Globals g = Globals.getInstance();
        g.setLevelSelector(3);
        clearColor(view);
        changeColor(view);
    }

    public void changeColor(View view) {
        android.widget.Button B = null;
        int id = view.getId();
        if (id == R.id.button2) {
            B = (android.widget.Button) findViewById(R.id.button2);
            clearColor(view);
            B.getBackground().setColorFilter(0xFF35B5E5, android.graphics.PorterDuff.Mode.MULTIPLY);
        } else if (id == R.id.button3) {
            B = (android.widget.Button) findViewById(R.id.button3);
            clearColor(view);
            B.getBackground().setColorFilter(0xFF35B5E5, android.graphics.PorterDuff.Mode.MULTIPLY);
        } else if (id == R.id.button4) {
            B = (android.widget.Button) findViewById(R.id.button4);
            clearColor(view);
            B.getBackground().setColorFilter(0xFF35B5E5, android.graphics.PorterDuff.Mode.MULTIPLY);
        } else if (id == R.id.button5) {
            B = (android.widget.Button) findViewById(R.id.button5);
            clearColor(view);
            B.getBackground().setColorFilter(0xFF35B5E5, android.graphics.PorterDuff.Mode.MULTIPLY);
        }
    }

    public void clearColor(View view) {
        android.widget.Button B2 = (android.widget.Button) findViewById(R.id.button2);
        android.widget.Button B3 = (android.widget.Button) findViewById(R.id.button3);
        android.widget.Button B4 = (android.widget.Button) findViewById(R.id.button4);
        android.widget.Button B5 = (android.widget.Button) findViewById(R.id.button5);
        B2.getBackground().clearColorFilter();
        B3.getBackground().clearColorFilter();
        B4.getBackground().clearColorFilter();
        B5.getBackground().clearColorFilter();
    }
}
