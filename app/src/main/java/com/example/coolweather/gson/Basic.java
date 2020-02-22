package com.example.coolweather.gson;

import android.net.wifi.aware.PublishConfig;

import com.google.gson.annotations.SerializedName;

/**
 * @author LiuSaiSai
 * @description:
 * @date :2020/02/21 21:47
 */
public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    @SerializedName("update")
    public Update mUpdate;

    public class Update {

        @SerializedName("loc")
        public String updateTime;
    }
}
