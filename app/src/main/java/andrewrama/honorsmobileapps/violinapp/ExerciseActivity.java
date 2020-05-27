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

        mAdapter = new ExerciseAdapter(exercises);
        mRecyclerView.setAdapter(mAdapter);
    }
    public void backToHome3(View v){
        finish();
    }
}
