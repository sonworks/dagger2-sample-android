package com.example.di.dagger2.di;

import android.content.Context;

import com.example.di.dagger2.WeatherRepository;

import dagger.Module;
import dagger.Provides;

/**
 * Created by sonworks on 2017/10/15.
 */

@Module
public class InfraLayerModule {

    @Provides
    public WeatherRepository provideWeatherRepository(Context context) {
        return new WeatherRepository(context);
    }
}
