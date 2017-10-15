package com.example.di.dagger2.di;

import com.example.di.dagger2.WeatherFacade;
import com.example.di.dagger2.WeatherRepository;

import dagger.Module;
import dagger.Provides;

/**
 * Created by sonworks on 2017/10/15.
 */

@Module
public class AppLayerModule {

    @Provides
    public WeatherFacade provideWeatherFacade(WeatherRepository repository) {
        return new WeatherFacade(repository);
    }
}
