package fgecctv.com.dengqichen.splash;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import fgecctv.com.dengqichen.R;

public class SplashActivity extends AppCompatActivity implements SplashContract.View {

    @BindView(R.id.imageVIew_ad)
    ImageView      mImageVIewAd;
    @BindView(R.id.activity_main)
    RelativeLayout mActivityMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        ButterKnife.bind(this);

    }

    @Override
    public void showAd(String url) {
        
    }

    @Override
    public void showProgress() {

    }
}
