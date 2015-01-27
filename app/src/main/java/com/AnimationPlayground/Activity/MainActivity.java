package com.AnimationPlayground.Activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.AnimationPlayground.DrawPath.ProgressActivity;
import com.AnimationPlayground.DrawPathSvg.DrawPathSvgActivity;
import com.AnimationPlayground.FragmentAnimation.FragmentAnimationActivity;
import com.sunshaogang.animation.R;

/**
 * Created by Shaogang Sun on 26/01/2015..
 */
public class MainActivity extends Activity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main_activity);
    }

    public void startProgress(View v)
    {
        Intent intent = new Intent(this, ProgressActivity.class);
        startActivity(intent);
    }

    public void startSvg(View v)
    {
        Intent intent = new Intent(this, DrawPathSvgActivity.class);
        startActivity(intent);
    }

    public void startDynamicForm(View v)
    {
        Intent intent = new Intent(this, FragmentAnimationActivity.class);
        startActivity(intent);
    }
}