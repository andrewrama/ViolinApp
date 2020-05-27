package andrewrama.honorsmobileapps.violinapp;

public class Exercise {

    private String exerciseName;
    private String exerciseDescription;

    public Exercise(String name, String description){
        exerciseName = name;
        exerciseDescription = description;
    }

    public String getExerciseName(){
        return exerciseName;
    }

    public void setExerciseName(String name){
        exerciseName = name;
    }

    public String getExerciseDescription(){
        return exerciseDescription;
    }

    public void setExerciseDescription(String description){
        exerciseDescription = description;
    }
}
