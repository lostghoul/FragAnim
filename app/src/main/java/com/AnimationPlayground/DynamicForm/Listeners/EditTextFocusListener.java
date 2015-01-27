package com.AnimationPlayground.DynamicForm.Listeners;

import android.view.View;

/**
 * Created by Shaogang Sun on 26/01/2015.
 */
public interface EditTextFocusListener {

    public void focusOn(View v, View movableView, boolean animated);

    public void focusOff(View v, View movableView, boolean animated);

}
