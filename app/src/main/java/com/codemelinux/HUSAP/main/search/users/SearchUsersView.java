package com.codemelinux.HUSAP.main.search.users;

import com.codemelinux.HUSAP.main.base.BaseFragmentView;
import com.codemelinux.HUSAP.model.Profile;

import java.util.List;

public interface SearchUsersView extends BaseFragmentView {
    void onSearchResultsReady(List<Profile> profiles);

    void showLocalProgress();

    void hideLocalProgress();

    void showEmptyListLayout();

    void updateSelectedItem();
}
