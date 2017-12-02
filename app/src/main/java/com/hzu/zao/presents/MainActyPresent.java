package com.hzu.zao.presents;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;

import com.hzu.zao.fragments.BaseFrament;
import com.hzu.zao.fragments.MainFragment;
import com.hzu.zao.fragments.MessagesFragment;
import com.hzu.zao.fragments.PostHistoryFragment;
import com.hzu.zao.fragments.UserManagerFragment;
import com.hzu.zao.views.MainActyView;

import java.util.ArrayList;
import java.util.List;

/**
 * Function:
 * Note:
 * Created by daynearby@hotmail.com on 2017-12-02.
 */

public class MainActyPresent extends BasePresents<MainActyView> {

    public MainActyPresent(Context context, MainActyView views) {
        super(context, views);
    }

    @Override
    protected void initialized() {

        final MainFragment mainFragment = new MainFragment();
        final PostHistoryFragment postHistoryFragment = new PostHistoryFragment();
        final MessagesFragment messagesFragment = new MessagesFragment();
        final UserManagerFragment userManagerFragment = new UserManagerFragment();

        final List<BaseFrament> fragmentList = new ArrayList<>();
        fragmentList.add(mainFragment);
        fragmentList.add(postHistoryFragment);
        fragmentList.add(messagesFragment);
        fragmentList.add(userManagerFragment);

        final ViewPager viewPager = getViews().getViewPager();
        final FragmentManager fragmentManager = ((AppCompatActivity) getContext()).getSupportFragmentManager();

        viewPager.setAdapter(new PagerAdapter() {
            @Override
            public int getCount() {
                return fragmentList.size();
            }

            @Override
            public boolean isViewFromObject(View view, Object object) {
                return view == object;
            }


            @Override
            public Object instantiateItem(ViewGroup container, int position) {
                final Fragment fragment = fragmentList.get(position);

                if (!fragment.isAdded()) { // 如果fragment还没有added
                    FragmentTransaction ft = fragmentManager.beginTransaction();
                    ft.add(fragment, fragment.getClass().getSimpleName());
                    ft.commit();
                    /**
                     * 在用FragmentTransaction.commit()方法提交FragmentTransaction对象后
                     * 会在进程的主线程中，用异步的方式来执行。
                     * 如果想要立即执行这个等待中的操作，就要调用这个方法（只能在主线程中调用）。
                     * 要注意的是，所有的回调和相关的行为都会在这个调用中被执行完成，因此要仔细确认这个方法的调用位置。
                     */
                    fragmentManager.executePendingTransactions();
                }

                if (fragment.getView() != null && fragment.getView().getParent() == null) {
                    container.addView(fragment.getView()); // 为viewpager增加布局
                }

                return fragment.getView();
            }

            @Override
            public void destroyItem(ViewGroup container, int position, Object object) {
                container.removeView(fragmentList.get(position).getView());
            }
        });
    }


}
