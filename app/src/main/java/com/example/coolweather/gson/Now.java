package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author LiuSaiSai
 * @description:
 * @date :2020/02/21 21:52
 */
public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
