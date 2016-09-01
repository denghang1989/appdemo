package fgecctv.com.animation;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.view.View;
import android.widget.TextView;

import fgecctv.com.dengqichen.TransitionActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupWindowTransition();

        TextView textView = (TextView) findViewById(R.id.textView_main);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TransitionActivity.class);
                ActivityOptions option = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this);
                startActivity(intent, option.toBundle());
            }
        });
    }

    private void setupWindowTransition() {
        Transition transition = TransitionInflater.from(this).inflateTransition(R.transition.activity_explode);
        getWindow().setExitTransition(transition);

    }
}
