package com.example.di.dagger2.di;

import com.example.di.dagger2.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by sonworks on 2017/10/15.
 */

@Singleton
@Component(modules = {InfraLayerModule.class, AppLayerModule.class, AppModule.class})
public interface AppComponent {
    void inject(MainActivity activity);
}
