package andrewrama.honorsmobileapps.violinapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ExerciseAdapter extends RecyclerView.Adapter<ExerciseViewHolder> {
    private ArrayList<Exercise> mExercises;

    public ExerciseAdapter(ArrayList<Exercise> exercises){
        mExercises = exercises;
    }
    @Override
    public ExerciseViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View rootView = layoutInflater.inflate(R.layout.listitem_layout, parent, false);
        ExerciseViewHolder newViewHolder = new ExerciseViewHolder(rootView);
        return newViewHolder;
    }

    @Override
    public void onBindViewHolder(ExerciseViewHolder currentViewHolder, int position){
        Exercise currentExercise = mExercises.get(position);
        currentViewHolder.bindExercise(currentExercise);
    }

    @Override
    public int getItemCount(){
        return mExercises.size();
    }
}
