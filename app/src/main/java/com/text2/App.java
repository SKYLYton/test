package com.text2;

import android.app.Application;

import com.text2.di.AppComponent;
import com.text2.di.DaggerAppComponent;

public class App extends Application {

    private static App INSTANCE;
    private AppComponent appComponent;

    public static App getInstance() {
        return INSTANCE;
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        INSTANCE = this;
        initDagger();
    }

    private void initDagger() {
        appComponent = DaggerAppComponent.builder().build();
    }
}
