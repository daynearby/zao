package com.hzu.zao.activities;

import com.hzu.zao.R;
import com.hzu.zao.presents.MainActyPresent;
import com.hzu.zao.views.MainActyView;

/**
 * 主界面，显示4个tab
 */
public class MainActivity extends BaseActivity {

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initialized() {
        final MainActyView mainActyViews = new MainActyView(this);
        final MainActyPresent mainActyPresent = new MainActyPresent(this,mainActyViews);

    }
}
