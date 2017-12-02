package com.hzu.zao.presents;

import android.content.Context;

import com.hzu.zao.views.BaseView;

/**
 * Function:
 * Note:
 * Created by daynearby@hotmail.com on 2017-11-30.
 */

public abstract class BasePresents<T extends BaseView> {

    private T views;
    private Context context;

    public BasePresents(Context context,T views) {
        this.context = context;
        this.views = views;
        initialized();
    }


    protected Context getContext() {
        return context;
    }

    public T getViews() {
        return views;
    }

    protected abstract void initialized();
}
