package com.lukebiubiubiu.lukesplash;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.lukebiubiubiu.splashview.SplashView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SplashView mSplashView= (SplashView) findViewById(R.id.mSplashView);
        mSplashView.startAnim();
        mSplashView.setOnParticleAnimListener(new SplashView.ParticleAnimListener() {
            @Override
            public void onAnimationEnd() {
                Toast.makeText(MainActivity.this, "Animation is End", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
