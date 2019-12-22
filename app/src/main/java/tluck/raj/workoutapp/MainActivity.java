package tluck.raj.workoutapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        FragmentManager manager=getSupportFragmentManager();
        workout_detail_frag fragment =(workout_detail_frag) manager.findFragmentById(R.id.detail_frag);

          fragment.setWorkoutID(1);

    }
}
