package com.hzu.zao.fragments;

import com.hzu.zao.R;
import com.hzu.zao.presents.PostHistoryPresent;
import com.hzu.zao.views.PostHistoryFragView;

/**
 * Function:
 * Note:
 * Created by daynearby@hotmail.com on 2017-11-30.
 */

public class PostHistoryFragment extends BaseFrament {
    protected static final String TAG = PostHistoryFragment.class.getSimpleName();
    public PostHistoryFragment() {
    }

    @Override
    protected int getLayoutResource() {
        return R.layout.post_history_fragment;
    }

    @Override
    protected void initialized() {
        final PostHistoryFragView postHistoryFragView = new PostHistoryFragView(getContext());
        final PostHistoryPresent postHistoryPresent = new PostHistoryPresent(getContext(),postHistoryFragView);
    }
}
