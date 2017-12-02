package com.hzu.zao.fragments;

import com.hzu.zao.R;
import com.hzu.zao.presents.MessagesFragPresent;
import com.hzu.zao.views.MessagesFragView;

/**
 * Function:
 * Note:
 * Created by daynearby@hotmail.com on 2017-11-30.
 */

public class MessagesFragment extends BaseFrament {
    protected static final String TAG = MessagesFragment.class.getSimpleName();
    public MessagesFragment() {

    }

    @Override
    protected int getLayoutResource() {
        return R.layout.messages_fragment;
    }

    @Override
    protected void initialized() {
        final MessagesFragView messagesFragView = new MessagesFragView(getContext());
        final MessagesFragPresent messagesFragPresent = new MessagesFragPresent(getContext(),messagesFragView);
    }
}
