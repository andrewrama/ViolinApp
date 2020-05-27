package andrewrama.honorsmobileapps.violinapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class ExerciseActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private ExerciseAdapter mAdapter;
    ArrayList<Exercise> exercises;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);

        exercises = new ArrayList<>();
        mRecyclerView = findViewById(R.id.exerciseRecyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(layoutManager);

        exercises.add(new Exercise("Straight Bowing", "Pick an open string and use your whole bow going from frog to tip trying to stay parallel to the bridge."));
        exercises.add(new Exercise("Finger Placement", "Bow a scale, noticing the spacing necessary between finger to meet pitch."));
        exercises.add(new Exercise("String crossing", "Play open strings, trying not to blend notes together when switching strings."));
        exercises.add(new Exercise("Slurring", "Play any note, then a different note in the same stroke, crossing strings if ready."));
        exercises.add(new Exercise("Controlling Notes", "Commonly called staccato, play a short note with little bow, stop, and continue from previous position, attempting a smooth transition."));
        exercises.add(new Exercise("Fourth Finger", "Once basic notes are learned, practice placing your fourth finger after your third to match the pitch of the next open string."));
        exercises.add(new Exercise("Vibrato", "While playing any note of choice, move either arm or wrist away from and towards body to create a ringing note."));


        mAdapter = new ExerciseAdapter(exercises);
        mRecyclerView.setAdapter(mAdapter);
    }
    public void backToHome3(View v){
        finish();
    }
}
