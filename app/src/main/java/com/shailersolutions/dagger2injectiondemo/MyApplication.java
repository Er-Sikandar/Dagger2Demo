package com.shailersolutions.dagger2injectiondemo;

import android.app.Application;
import android.util.Log;

import com.shailersolutions.dagger2injectiondemo.interfaces.ApplicationComponent;
import com.shailersolutions.dagger2injectiondemo.interfaces.DaggerApplicationComponent;


public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Log.e("Application ","Application");
    }

    ApplicationComponent appComponent = DaggerApplicationComponent.create();

}
