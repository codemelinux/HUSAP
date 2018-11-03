
package com.codemelinux.HUSAP.managers.listeners;

import com.codemelinux.HUSAP.model.Post;

public interface OnPostChangedListener {
    public void onObjectChanged(Post obj);

    public void onError(String errorText);
}
