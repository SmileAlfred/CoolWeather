package com.example.coolweather.gson;

import android.net.wifi.aware.PublishConfig;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author LiuSaiSai
 * @description:
 * @date :2020/02/21 22:01
 */
public class Weather {

    public String status;

    @SerializedName("basic")
    public Basic mBasic;

    @SerializedName("aqi")
    public AQI mAQI;

    @SerializedName("now")
    public Now mNow;

    @SerializedName("suggestion")
    public Suggestion mSuggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> mForecastList;
}
