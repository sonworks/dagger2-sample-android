package com.example.di.dagger2;

import android.content.Context;
import android.util.Log;

/**
 * Created by sonworks on 2017/10/15.
 */

public class WeatherFacade {

    private WeatherRepository repository;

    private Context context;

    public WeatherFacade(Context context) {
        this.context = context;
    }

    public void fetchWeather(String cityCode) {
        repository = new WeatherRepository(context);
        Log.d("=====", "cityCode: " + cityCode);
    }
}
