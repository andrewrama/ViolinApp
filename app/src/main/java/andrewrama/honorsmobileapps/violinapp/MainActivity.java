package andrewrama.honorsmobileapps.violinapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toTuner(View v){
        Intent i = new Intent(this, TunerActivity.class);
        startActivity(i);
    }
    public void practiceLog(View v){
        Intent i = new Intent(this, PracticeLogActivity.class);
        startActivity(i);
    }
    public void exercise(View v){
        Intent i = new Intent(this, ExerciseActivity.class);
        startActivity(i);
    }
    public void recording(View v){
        Intent i = new Intent(this, RecordingActivity.class);
        startActivity(i);
    }
}
