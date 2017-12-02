package com.hzu.zao;

import android.util.Log;

/**
 * Function: 开发过程中使用的log
 * Note:
 * Created by daynearby@hotmail.com on 2017-12-02.
 */

public class LogUtils {
    private static final String tag = "zao_log";

    public static void e(String TAG,String message){
        if (BuildConfig.DEBUG){
            Log.e(TAG,message);
        }

    }

    public static void d(String TAG,String message){
        if (BuildConfig.DEBUG){
            Log.d(TAG,message);
        }
    }
}
