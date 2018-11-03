

package com.codemelinux.HUSAP.managers.listeners;

import com.codemelinux.HUSAP.model.PostListResult;

public interface OnPostListChangedListener<Post> {

    public void onListChanged(PostListResult result);

    void onCanceled(String message);
}
