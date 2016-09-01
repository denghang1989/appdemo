package fgecctv.com.dengqichen;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.widget.TextView;

import fgecctv.com.animation.R;


public class Transition4Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transition);
        setupWindowTransition();

        TextView textView = (TextView) findViewById(R.id.textview_2);
        textView.setText(this.getClass().getSimpleName());
    }

    private void setupWindowTransition() {
        Transition transition = TransitionInflater.from(this).inflateTransition(R.transition.activity_explode);
        getWindow().setEnterTransition(transition);
    }

}
