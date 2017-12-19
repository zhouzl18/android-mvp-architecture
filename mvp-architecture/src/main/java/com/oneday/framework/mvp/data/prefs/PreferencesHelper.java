package com.oneday.framework.mvp.data.prefs;

import com.oneday.framework.mvp.data.DataManager;

/**
 * Created by OneDay on 2017/12/6.
 */

public interface PreferencesHelper {

    int getCurrentUserLoggedInMode();

    void setCurrentUserLoggedInMode(DataManager.LoggedInMode mode);

    Long getCurrentUserId();

    void setCurrentUserId(Long userId);

    String getCurrentUserName();

    void setCurrentUserName(String userName);

    String getCurrentUserEmail();

    void setCurrentUserEmail(String email);

    String getCurrentUserProfilePicUrl();

    void setCurrentUserProfilePicUrl(String profilePicUrl);

    String getAccessToken();

    void setAccessToken(String accessToken);

}
