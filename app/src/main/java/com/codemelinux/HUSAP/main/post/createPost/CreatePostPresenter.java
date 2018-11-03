package com.codemelinux.HUSAP.main.post.createPost;

import android.content.Context;

import com.google.firebase.auth.FirebaseAuth;
import com.codemelinux.HUSAP.R;
import com.codemelinux.HUSAP.main.post.BaseCreatePostPresenter;
import com.codemelinux.HUSAP.model.Post;


public class CreatePostPresenter extends BaseCreatePostPresenter<CreatePostView> {

    public CreatePostPresenter(Context context) {
        super(context);
    }

    @Override
    protected int getSaveFailMessage() {
        return R.string.error_fail_create_post;
    }

    @Override
    protected void savePost(String title, String description) {
        ifViewAttached(view -> {
            view.showProgress(R.string.message_creating_post);
            Post post = new Post();
            post.setTitle(title);
            post.setDescription(description);
            post.setAuthorId(FirebaseAuth.getInstance().getCurrentUser().getUid());
            postManager.createOrUpdatePostWithImage(view.getImageUri(), this, post);
        });
    }

    @Override
    protected boolean isImageRequired() {
        return true;
    }
}
