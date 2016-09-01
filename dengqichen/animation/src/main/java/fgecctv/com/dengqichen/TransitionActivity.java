package fgecctv.com.dengqichen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.view.View;
import android.widget.Button;

import fgecctv.com.animation.R;


public class TransitionActivity extends AppCompatActivity implements View.OnClickListener{

    private Button mExplode_code;
    private Button mExplode_xml;
    private Button mSlide_code;
    private Button mSlide_xml;
    private Button mFade_code;
    private Button mFade_xml;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transition);
        setupWindowTransition();

        mExplode_code = (Button) findViewById(R.id.explode_code);
        mExplode_xml = (Button) findViewById(R.id.explode_xml);
        mSlide_code = (Button) findViewById(R.id.slide_code);
        mSlide_xml = (Button) findViewById(R.id.slide_xml);
        mFade_code = (Button) findViewById(R.id.fade_code);
        mFade_xml = (Button) findViewById(R.id.fade_xml);

        mExplode_code.setOnClickListener(this);
        mExplode_xml.setOnClickListener(this);
        mSlide_code.setOnClickListener(this);
        mSlide_xml.setOnClickListener(this);
        mFade_code.setOnClickListener(this);
        mFade_xml.setOnClickListener(this);
    }

    private void setupWindowTransition() {
        Transition transition = TransitionInflater.from(this).inflateTransition(R.transition.activity_explode);
        getWindow().setEnterTransition(transition);
    }

    @Override
    public void onClick(View v) {
        String tag = (String) v.getTag();
        try {
            Class clazz = Class.forName(tag);
            MyStartActivity(clazz);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void MyStartActivity(Class clazz){
        Intent intent = new Intent(this,clazz);
        ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(this);
        startActivity(intent,options.toBundle());
    }
}
