package com.aminography.primecalendar.sample;

import android.app.Application;
import android.support.v7.app.AppCompatDelegate;

/**
 * Created by aminography on 7/14/2018.
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    }

}
