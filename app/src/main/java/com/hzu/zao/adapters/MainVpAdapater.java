package com.hzu.zao.adapters;

import android.support.v4.view.PagerAdapter;
import android.view.View;

/**
 * Function: unuse
 * Note:
 * Created by daynearby@hotmail.com on 2017-12-02.
 */

public class MainVpAdapater extends PagerAdapter {

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return false;
    }
}
