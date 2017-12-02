package com.hzu.zao.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hzu.zao.LogUtils;

/**
 * Function:
 * Note:
 * Created by daynearby@hotmail.com on 2017-11-30.
 */

public abstract class BaseFrament extends Fragment {
    protected static final String TAG = BaseFrament.class.getSimpleName();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        LogUtils.d(TAG, "onCreateView layout id =" + getLayoutResource());
        return LayoutInflater.from(getContext()).inflate(getLayoutResource(), container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initialized();
    }

    protected abstract int getLayoutResource();

    protected abstract void initialized();
}
