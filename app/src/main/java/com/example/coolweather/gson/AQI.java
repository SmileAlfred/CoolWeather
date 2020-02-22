package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author LiuSaiSai
 * @description:
 * @date :2020/02/21 21:50
 */
public class AQI {
    @SerializedName("city")
    public AQICity mCity;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
