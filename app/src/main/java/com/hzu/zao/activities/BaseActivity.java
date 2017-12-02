package com.hzu.zao.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Function:
 * Note:
 * Created by daynearby@hotmail.com on 2017-11-30.
 */

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResId());
        initialized();
    }


    protected abstract void initialized();

    protected abstract int getLayoutResId();

    protected <T extends View> T $(int resId){
        return (T)findViewById(resId);
    }
}
