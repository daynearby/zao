package com.hzu.zao.fragments;

import com.hzu.zao.R;
import com.hzu.zao.presents.UserManagerFragPresent;
import com.hzu.zao.views.UserManagerFragView;

/**
 * Function:
 * Note:
 * Created by daynearby@hotmail.com on 2017-11-30.
 */

public class UserManagerFragment extends BaseFrament {
    protected static final String TAG = UserManagerFragment.class.getSimpleName();

    public UserManagerFragment() {
    }

    @Override
    protected int getLayoutResource() {
        return R.layout.user_manager_fragment;
    }

    @Override
    protected void initialized() {
        final UserManagerFragView userManagerFragView = new UserManagerFragView(getContext());
        final UserManagerFragPresent userManagerFragPresent = new UserManagerFragPresent(getContext(),userManagerFragView);
    }
}
