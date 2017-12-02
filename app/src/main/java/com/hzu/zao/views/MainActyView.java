package com.hzu.zao.views;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;

import com.hzu.zao.LogUtils;
import com.hzu.zao.R;
import com.hzu.zao.activities.MainActivity;

/**
 * Function:
 * Note:
 * Created by daynearby@hotmail.com on 2017-12-02.
 */

public class MainActyView extends BaseView implements ViewPager.OnPageChangeListener, View.OnClickListener {

    private final  static String TAG = MainActivity.class.getSimpleName();

    private ViewPager viewPager;
    private ImageView mainBtn;
    private ImageView postHistoryBtn;
    private ImageView messagesBtn;
    private ImageView userManagerBtn;

    public MainActyView(Context context) {
        super(context);
    }

    @Override
    protected void initializedViews() {
        viewPager = $(R.id.id_vp_container);
        mainBtn = $(R.id.id_im_main);
        postHistoryBtn = $(R.id.id_im_post_history);
        messagesBtn = $(R.id.id_im_messages);
        userManagerBtn = $(R.id.id_im_user_manager);

        viewPager.addOnPageChangeListener(this);
        //TODO 用于初始化页面
        //viewPager.setCurrentItem(0);
        //onPageSelected(0);
        selectMainBtn();

        mainBtn.setOnClickListener(this);
        postHistoryBtn.setOnClickListener(this);
        messagesBtn.setOnClickListener(this);
        userManagerBtn.setOnClickListener(this);

    }

    public ViewPager getViewPager() {
        return viewPager;
    }

    public ImageView getMainBtn() {
        return mainBtn;
    }

    public ImageView getPostHistoryBtn() {
        return postHistoryBtn;
    }

    public ImageView getMessagesBtn() {
        return messagesBtn;
    }

    public ImageView getUserManagerBtn() {
        return userManagerBtn;
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        LogUtils.d(TAG,"current position = "+position);
        switch (position) {
            case 0:
                selectMainBtn();
                break;
            case 1:
                selectPostHistoryBtn();
                break;
            case 2:
                selectMessagesBtn();
                break;
            case 3:
                selectUserManagerBtn();
                break;
        }
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    @Override
    public void onClick(View view) {
        LogUtils.d(TAG,"click view = "+view);
        switch (view.getId()) {
            case R.id.id_im_main:
                viewPager.setCurrentItem(0);
                selectMainBtn();
                break;
            case R.id.id_im_post_history:
                viewPager.setCurrentItem(1);
                selectPostHistoryBtn();
                break;
            case R.id.id_im_messages:
                viewPager.setCurrentItem(2);
                selectMessagesBtn();
                break;
            case R.id.id_im_user_manager:
                viewPager.setCurrentItem(3);
                selectUserManagerBtn();
                break;
        }
    }

    private void selectMainBtn() {
        mainBtn.setImageResource(R.drawable.id_iv_main_select);
        postHistoryBtn.setImageResource(R.drawable.id_iv_post_history);
        messagesBtn.setImageResource(R.drawable.id_iv_messages);
        userManagerBtn.setImageResource(R.drawable.id_iv_user_manager);
    }

    private void selectPostHistoryBtn() {
        mainBtn.setImageResource(R.drawable.id_iv_main);
        postHistoryBtn.setImageResource(R.drawable.id_iv_post_history_select);
        messagesBtn.setImageResource(R.drawable.id_iv_messages);
        userManagerBtn.setImageResource(R.drawable.id_iv_user_manager);
    }

    private void selectMessagesBtn() {
        mainBtn.setImageResource(R.drawable.id_iv_main);
        postHistoryBtn.setImageResource(R.drawable.id_iv_post_history);
        messagesBtn.setImageResource(R.drawable.id_iv_messages_select);
        userManagerBtn.setImageResource(R.drawable.id_iv_user_manager);
    }

    private void selectUserManagerBtn() {
        mainBtn.setImageResource(R.drawable.id_iv_main);
        postHistoryBtn.setImageResource(R.drawable.id_iv_post_history);
        messagesBtn.setImageResource(R.drawable.id_iv_messages);
        userManagerBtn.setImageResource(R.drawable.id_iv_user_manager_select);
    }
}
