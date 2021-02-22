package com.example.jimmyle.pacmanandroid;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class FailedLevelActivity extends Activity {



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.failed_layout);
        MainActivity.getPlayer().start();

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(R.string.gameOver).setNeutralButton(R.string.ok, new AlertDialog.OnClickListener(){
            public void onClick(DialogInterface dialog, int which){
                Intent failedIntent = new Intent(PlayActivity.getInstance(), MainActivity.class);
                PlayActivity.getInstance().startActivity(failedIntent);

            }
        });
        AlertDialog dialog = builder.create();
        dialog.show();
    }


    // Method to start activity for Help button
    public void showHelpScreen(View view) {
        Intent helpIntent = new Intent(this, HelpActivity.class);
        startActivity(helpIntent);
    }

    // Method to start activity for Play button
    public void showPlayScreen(View view) {
        Intent playIntent = new Intent(this, PlayActivity.class);
        startActivity(playIntent);
        PlayActivity.getInstance().finish();
        this.finish();
    }
}
