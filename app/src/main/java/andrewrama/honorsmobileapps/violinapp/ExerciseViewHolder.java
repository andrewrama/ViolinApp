package andrewrama.honorsmobileapps.violinapp;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class ExerciseViewHolder extends RecyclerView.ViewHolder {
    private TextView mExerciseName;
    private TextView mExerciseDescription;
    private Exercise mExercise;

    public ExerciseViewHolder(View rootView){
        super(rootView);
        mExerciseName = rootView.findViewById(R.id.sessionTitle);
        mExerciseDescription = rootView.findViewById(R.id.sessionDescription);
    }

    public void bindExercise(Exercise exercise){
        mExercise = exercise;
        mExerciseName.setText(mExercise.getExerciseName());
        mExerciseDescription.setText(mExercise.getExerciseDescription());
    }
}
