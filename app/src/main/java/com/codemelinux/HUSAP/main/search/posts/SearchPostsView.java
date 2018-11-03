
package com.codemelinux.HUSAP.main.search.posts;

import com.codemelinux.HUSAP.main.base.BaseFragmentView;
import com.codemelinux.HUSAP.model.Post;

import java.util.List;

public interface SearchPostsView extends BaseFragmentView {
    void onSearchResultsReady(List<Post> posts);
    void showLocalProgress();
    void hideLocalProgress();
    void showEmptyListLayout();
}
