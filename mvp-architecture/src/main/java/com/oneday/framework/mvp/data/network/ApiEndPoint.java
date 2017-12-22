package com.oneday.framework.mvp.data.network;

import com.oneday.framework.mvp.BuildConfig;

/**
 * Created by OneDay on 2017/12/22.
 */

public final class ApiEndPoint {

    private static final String BASE_URL = BuildConfig.BASE_URL;

    public static final String ENDPOINT_GOOGLE_LOGIN = BASE_URL + "/588d14f4100000a9072d2943";

    public static final String ENDPOINT_FACEBOOK_LOGIN = BASE_URL + "/588d15d3100000ae072d2944";

    public static final String ENDPOINT_SERVER_LOGIN = BASE_URL + "/588d15f5100000a8072d2945";

    public static final String ENDPOINT_LOGOUT = BASE_URL + "/588d161c100000a9072d2946";

    public static final String ENDPOINT_BLOG = BASE_URL + "/5926ce9d11000096006ccb30";

    public static final String ENDPOINT_OPEN_SOURCE = BASE_URL + "/5926c34212000035026871cd";

    private ApiEndPoint() {
        //不需要公有的构造方法
    }
}
