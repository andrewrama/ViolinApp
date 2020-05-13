package andrewrama.honorsmobileapps.violinapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class TunerActivity extends AppCompatActivity {

    MediaPlayer stringPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuner);
    }

    public void playG(View v) {
        releaseMediaPlayer();
        stringPlayer = MediaPlayer.create(this, R.raw.violinopeng);
        stringPlayer.start();
        stringPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                releaseMediaPlayer();
            }
        });

    }

    public void playD(View v) {
        releaseMediaPlayer();
        stringPlayer = MediaPlayer.create(this, R.raw.violinopend);
        stringPlayer.start();
        stringPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                releaseMediaPlayer();
            }
        });
    }

    public void playA(View v) {
        releaseMediaPlayer();
        stringPlayer = MediaPlayer.create(this, R.raw.violinopena);
        stringPlayer.start();
        stringPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                releaseMediaPlayer();
            }
        });
    }

    public void playE(View v) {
        releaseMediaPlayer();
        stringPlayer = MediaPlayer.create(this, R.raw.violinopene);
        stringPlayer.start();
        stringPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                releaseMediaPlayer();
            }
        });
    }

    public void releaseMediaPlayer() {
        if (stringPlayer != null) {
            stringPlayer.release();
            stringPlayer = null;
        }
    }

    public void backToHome(View v) {
        releaseMediaPlayer();
        finish();
    }
}
