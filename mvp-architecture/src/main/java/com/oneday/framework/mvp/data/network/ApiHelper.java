package com.oneday.framework.mvp.data.network;

import com.oneday.framework.mvp.data.network.model.BlogResponse;
import com.oneday.framework.mvp.data.network.model.LoginRequest;
import com.oneday.framework.mvp.data.network.model.LoginResponse;
import com.oneday.framework.mvp.data.network.model.LogoutResponse;
import com.oneday.framework.mvp.data.network.model.OpenSourceResponse;

import io.reactivex.Observable;

/**
 * Created by OneDay on 2017/12/22.
 */

public interface ApiHelper {

    ApiHeader getApiHeader();

    Observable<LoginResponse> doGoogleLoginApiCall(LoginRequest.GoogleLoginRequest request);

    Observable<LoginResponse> doFacebookLoginApiCall(LoginRequest.FacebookLoginRequest request);

    Observable<LoginResponse> doServerLoginApiCall(LoginRequest.ServerLoginRequest request);

    Observable<LogoutResponse> doLogoutApiCall();

    Observable<BlogResponse> getBlogApiCall();

    Observable<OpenSourceResponse> getOpenSourceApiCall();
}
