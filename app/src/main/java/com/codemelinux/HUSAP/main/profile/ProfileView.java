package com.codemelinux.HUSAP.main.profile;

import android.text.Spannable;
import android.view.View;

import com.codemelinux.HUSAP.enums.FollowState;
import com.codemelinux.HUSAP.main.base.BaseView;
import com.codemelinux.HUSAP.model.Post;
import com.codemelinux.HUSAP.model.Profile;

public interface ProfileView extends BaseView {

    void showUnfollowConfirmation(Profile profile);

    void updateFollowButtonState(FollowState followState);

    void updateFollowersCount(int count);

    void updateFollowingsCount(int count);

    void setFollowStateChangeResultOk();

    void openPostDetailsActivity(Post post, View postItemView);

    void startEditProfileActivity();

    void openCreatePostActivity();

    void setProfileName(String username);

    void setProfilePhoto(String photoUrl);

    void setDefaultProfilePhoto();

    void updateLikesCounter(Spannable text);

    void hideLoadingPostsProgress();

    void showLikeCounter(boolean show);

    void updatePostsCounter(Spannable text);

    void showPostCounter(boolean show);

    void onPostRemoved();

    void onPostUpdated();

}
