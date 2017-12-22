package com.oneday.framework.mvp.data.db;

import android.content.Context;

import com.oneday.framework.mvp.data.db.model.DaoMaster;
import com.oneday.framework.mvp.di.ApplicationContext;
import com.oneday.framework.mvp.di.DatabaseInfo;
import com.oneday.framework.mvp.utils.AppLogger;

import org.greenrobot.greendao.database.Database;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by OneDay on 2017/12/22.
 */

@Singleton
public class DbOpenHelper extends DaoMaster.OpenHelper {

    private static final String TAG = "DbOpenHelper";

    @Inject
    public DbOpenHelper(@ApplicationContext Context context, @DatabaseInfo String name) {
        super(context, name);
    }

    @Override
    public void onUpgrade(Database db, int oldVersion, int newVersion) {
        super.onUpgrade(db, oldVersion, newVersion);
        AppLogger.d(TAG, "oldVersion : " + oldVersion + ", newVersion = " + newVersion);
    }
}
