package com.AnimationPlayground.DrawPath;

import android.app.Activity;
import android.os.Bundle;

import com.sunshaogang.animation.R;

/**
 * Created by Shaogang Sun on 26/01/2015..
 */
public class ProgressActivity extends Activity {

    private ProgressView progressView;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        progressView = (ProgressView) findViewById(R.id.progress);

        setContentView(R.layout.progress_activity);
    }
}