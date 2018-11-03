

package com.codemelinux.HUSAP.main.editProfile;

import com.codemelinux.HUSAP.main.pickImageBase.PickImageView;


public interface EditProfileView extends PickImageView {
    void setName(String username);

    void setProfilePhoto(String photoUrl);

    String getNameText();

    void setNameError(String string);
}
