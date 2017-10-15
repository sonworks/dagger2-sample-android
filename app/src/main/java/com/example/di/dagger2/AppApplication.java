package com.example.di.dagger2;

import android.app.Application;

import com.example.di.dagger2.di.AppComponent;
import com.example.di.dagger2.di.AppModule;
import com.example.di.dagger2.di.DaggerAppComponent;

/**
 * Created by sonworks on 2017/10/15.
 */

public class AppApplication extends Application {

    private AppComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        initializeInjector();
    }

    private void initializeInjector() {
        applicationComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }

    public AppComponent getApplicationComponent() {
        return applicationComponent;
    }
}
