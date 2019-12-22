package tluck.raj.workoutapp;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;



/**
 * A simple {@link Fragment} subclass.
 */
public class workout_detail_frag extends Fragment {
    private long workoutID;





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_workout_detail, container, false);
    }


    @Override
    public void onStart() {
        super.onStart();
        View view=getView();

        if(view!=null){

            TextView title =view.findViewById(R.id.textTitle);
            TextView desc =view.findViewById(R.id.textDescription);

            Workout workout =Workout.workouts[(int) workoutID];
            title.setText(workout.getName());
            desc.setText(workout.getDescription());


        }

    }

    public void setWorkoutID(long id){

        this.workoutID=id;
    }

}
