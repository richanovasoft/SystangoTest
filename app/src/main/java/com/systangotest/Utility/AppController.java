package com.systangotest.Utility;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;

import io.realm.Realm;
import io.realm.RealmConfiguration;


public class AppController extends Application {


    public static final String TAG = AppController.class
            .getSimpleName();

    private static Context context;

    private static AppController mInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
        mInstance = this;
        RealmConfiguration realmConfiguration = new RealmConfiguration.Builder(this)
                .name(Realm.DEFAULT_REALM_NAME)
                .schemaVersion(0)
                .deleteRealmIfMigrationNeeded()
                .build();
        Realm.setDefaultConfiguration(realmConfiguration);

    }

    public static Context getContext() {
        return context;
    }


    public static synchronized AppController getInstance() {
        return mInstance;
    }


    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }


}


