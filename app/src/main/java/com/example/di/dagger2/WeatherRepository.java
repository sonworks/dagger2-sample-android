package com.example.di.dagger2;

import android.content.Context;

import javax.inject.Inject;

/**
 * Created by sonworks on 2017/10/15.
 */

public class WeatherRepository {

    private Context mContext;

    @Inject
    public WeatherRepository(Context context) {
        mContext = context;
    }
}
