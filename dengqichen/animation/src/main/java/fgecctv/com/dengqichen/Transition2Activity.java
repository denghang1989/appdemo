package fgecctv.com.dengqichen;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.transition.Explode;
import android.view.animation.BounceInterpolator;
import android.widget.TextView;

import fgecctv.com.animation.R;


public class Transition2Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transition2);
        setupWindowTransition();

        TextView textView = (TextView) findViewById(R.id.textview_2);
        textView.setText(this.getClass().getSimpleName());
    }

    private void setupWindowTransition() {
        Explode explode = new Explode();
        explode.setDuration(1000);
        explode.setInterpolator(new BounceInterpolator());
        getWindow().setEnterTransition(explode);
    }

}
