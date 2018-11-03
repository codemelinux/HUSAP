
package com.codemelinux.HUSAP.main.pickImageBase;

import android.net.Uri;

import com.codemelinux.HUSAP.main.base.BaseView;


public interface PickImageView extends BaseView {
    void hideLocalProgress();

    void loadImageToImageView(Uri imageUri);
}
