package com.hzu.zao.fragments;

import com.hzu.zao.R;
import com.hzu.zao.presents.MainFragPresent;
import com.hzu.zao.views.MainFragView;

/**
 * Function:
 * Note:
 * Created by daynearby@hotmail.com on 2017-11-30.
 */

public class MainFragment extends BaseFrament {
    protected static final String TAG = MainFragment.class.getSimpleName();
    public MainFragment() {
    }

    @Override
    protected int getLayoutResource() {
        return R.layout.main_fragment;
    }

    @Override
    protected void initialized() {
        final MainFragView mainFragView = new MainFragView(getContext());
        final MainFragPresent mainFragPresent =new MainFragPresent(getContext(),mainFragView);
    }
}
