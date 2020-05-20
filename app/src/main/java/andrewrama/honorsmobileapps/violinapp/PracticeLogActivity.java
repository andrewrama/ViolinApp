package andrewrama.honorsmobileapps.violinapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class PracticeLogActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private SessionAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice_log);

        mRecyclerView = findViewById(R.id.logRecyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(layoutManager);

        ArrayList<Session> sessions = new ArrayList<>();
        sessions.add(new Session("Friday", "4 hours"));
        sessions.add(new Session("Friday", "4 hours"));
        sessions.add(new Session("Friday", "4 hours"));
        sessions.add(new Session("Friday", "4 hours"));
        sessions.add(new Session("Friday", "4 hours"));
        sessions.add(new Session("Friday", "4 hours"));
        sessions.add(new Session("Friday", "4 hours"));
        mAdapter = new SessionAdapter(sessions);
        mRecyclerView.setAdapter(mAdapter);
    }
    public void backToHome2(View v){
        finish();
    }
}
