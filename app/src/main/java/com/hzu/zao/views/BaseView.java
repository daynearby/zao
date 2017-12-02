package com.hzu.zao.views;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Function:
 * Note:
 * Created by daynearby@hotmail.com on 2017-11-30.
 */

public abstract class BaseView {
    private Context context;
    private View view;

    public BaseView(Context context){
        this.context = context;
        initializedViews();
    }

    protected abstract void initializedViews();

    protected <T extends View> T $(int resId){

        return (T)((AppCompatActivity)context).findViewById(resId);
    }
}
