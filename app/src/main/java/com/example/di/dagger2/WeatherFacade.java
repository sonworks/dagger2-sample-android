package com.example.di.dagger2;

import android.content.Context;
import android.util.Log;

import javax.inject.Inject;

/**
 * Created by sonworks on 2017/10/15.
 */

public class WeatherFacade {

    private WeatherRepository repository;

    @Inject
    public WeatherFacade(WeatherRepository repository) {
        this.repository = repository;
    }

    public void fetchWeather(String cityCode) {
        // TODO type some logic with WeatherRepository Class
        Log.d("=====", "cityCode: " + cityCode);
    }
}
