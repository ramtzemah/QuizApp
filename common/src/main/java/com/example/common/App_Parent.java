package com.example.common;

import android.app.Application;

public abstract class App_Parent extends Application {

    public static String adId = null;

    protected abstract String getAdMobBannerID();

    @Override
    public void onCreate() {
        super.onCreate();
        adId = getAdMobBannerID();

    }

}
