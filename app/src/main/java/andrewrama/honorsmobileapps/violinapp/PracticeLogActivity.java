package andrewrama.honorsmobileapps.violinapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class PracticeLogActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private SessionAdapter mAdapter;
    ArrayList<Session> sessions;
    private final Context context=this;
    String FILENAME = "sessions_file";
    private static final String KEY_SESSIONS = "sessions";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice_log);
        sessions = new ArrayList<>();
        try{
            FileInputStream fis = openFileInput(FILENAME);
            ObjectInputStream ois = new ObjectInputStream(fis);
            sessions = (ArrayList<Session>) ois.readObject();
            ois.close();
            fis.close();
        } catch (Exception e){
            e.printStackTrace();
        }





        mRecyclerView = findViewById(R.id.logRecyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(layoutManager);


        mAdapter = new SessionAdapter(sessions);
        mRecyclerView.setAdapter(mAdapter);
    }
    public void addNewSession(View v){
        LayoutInflater li = LayoutInflater.from(PracticeLogActivity.this);
        View promptView = li.inflate(R.layout.new_session, null);
        AlertDialog.Builder builder = new AlertDialog.Builder(PracticeLogActivity.this);
        builder.setView(promptView);
        final EditText sessionTitle = (EditText) promptView.findViewById(R.id.titleEditText);
        final EditText sessionDescription = (EditText) promptView.findViewById(R.id.notesEditText);
        builder.setTitle("Create New Session");
        builder.setPositiveButton("Create", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                if(!sessionTitle.getText().toString().equals("")) {
                    addToRecyclerView(sessionTitle.getText().toString(), sessionDescription.getText().toString());
                    dialog.dismiss();
                }
                else {
                    Toast.makeText(context, "Title Required!", Toast.LENGTH_SHORT).show();
                }
            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        AlertDialog dialog = builder.create();
        dialog.show();
    }
    public void addToRecyclerView(String title, String description){
        sessions.add(new Session(title, description));
        mAdapter.notifyDataSetChanged();
    }
    public void backToHome2(View v){
        finish();
    }
    @Override
    public void onStop(){
        super.onStop();

        try{
            FileOutputStream fos = openFileOutput(FILENAME, Context.MODE_PRIVATE);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(sessions);
            oos.close();
            fos.close();
        } catch(Exception e){
            Log.e("ERROR", e.toString());
        }
    }
    public ArrayList<Session> getSessionsList(){
        return sessions;
    }

}
