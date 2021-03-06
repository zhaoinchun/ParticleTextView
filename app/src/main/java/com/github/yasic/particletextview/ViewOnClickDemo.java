package com.github.yasic.particletextview;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.yasic.library.particletextview.Object.ParticleTextViewConfig;
import com.yasic.library.particletextview.View.ParticleTextView;

public class ViewOnClickDemo extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_on_click_demo);
        final ParticleTextView particleTextView = (ParticleTextView) findViewById(R.id.particleTextView);
        ParticleTextViewConfig config1 = new ParticleTextViewConfig.Builder()
                .setTargetText("Loading")
                .setReleasing(0.4)
                .setParticleRadius(4)
                .setMiniDistance(1)
                .setTextSize(150)
                .setRowStep(9)
                .setColumnStep(9)
                .instance();
        particleTextView.setConfig(config1);

        Button btnStartAnimation = (Button)findViewById(R.id.btn_start_animation);
        assert btnStartAnimation != null;
        btnStartAnimation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                particleTextView.startAnimation();
            }
        });

        Button btnStopAnimation = (Button)findViewById(R.id.btn_stop_animation);
        assert btnStopAnimation != null;
        btnStopAnimation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                particleTextView.stopAnimation();
            }
        });
    }
}
