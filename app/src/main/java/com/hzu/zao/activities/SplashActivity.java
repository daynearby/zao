package com.hzu.zao.activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.hzu.zao.MainActivity;

import cn.bmob.v3.Bmob;

/**
 * note:欢迎界面
 * Created by daynearby@hotmail.com on 17/9/18.
 */
public class SplashActivity extends AppCompatActivity {

    final long DELAY = 2000L;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashActivity.this, MainActivity.class));
                SplashActivity.this.finish();
            }
        },DELAY);
        //
        Bmob.initialize(this, getBmobApplication());

    }

    public native String  getBmobApplication();

    static {
        System.loadLibrary("configLoader");
    }

}
