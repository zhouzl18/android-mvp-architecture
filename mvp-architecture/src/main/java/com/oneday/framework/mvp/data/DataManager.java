package com.oneday.framework.mvp.data;

/**
 * Created by OneDay on 2017/12/19.
 */

public interface DataManager {


    enum LoggedInMode{
        LOGGED_IN_MODE_LOGGED_OUT(0),
        LOGGED_IN_MODE_GOOGLE(1),
        LOGGED_IN_MODE_FB(2),
        LOGGED_IN_MODE_SERVER(3);

        private final int mType;

        LoggedInMode(int type){
            mType = type;
        }

        public int getType() {
            return mType;
        }
    }
}
