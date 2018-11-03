package com.codemelinux.HUSAP.adapters.holders;

import android.view.View;

import com.codemelinux.HUSAP.main.base.BaseActivity;
import com.codemelinux.HUSAP.managers.listeners.OnPostChangedListener;
import com.codemelinux.HUSAP.model.FollowingPost;
import com.codemelinux.HUSAP.model.Post;
import com.codemelinux.HUSAP.utils.LogUtil;

/**
 * Created by codemelinux
 */
public class FollowPostViewHolder extends PostViewHolder {


    public FollowPostViewHolder(View view, OnClickListener onClickListener, BaseActivity activity) {
        super(view, onClickListener, activity);
    }

    public FollowPostViewHolder(View view, OnClickListener onClickListener, BaseActivity activity, boolean isAuthorNeeded) {
        super(view, onClickListener, activity, isAuthorNeeded);
    }

    public void bindData(FollowingPost followingPost) {
        postManager.getSinglePostValue(followingPost.getPostId(), new OnPostChangedListener() {
            @Override
            public void onObjectChanged(Post obj) {
                bindData(obj);
            }

            @Override
            public void onError(String errorText) {
                LogUtil.logError(TAG, "bindData", new RuntimeException(errorText));
            }
        });
    }

}
