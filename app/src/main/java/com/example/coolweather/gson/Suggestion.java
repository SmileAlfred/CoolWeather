package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author LiuSaiSai
 * @description:
 * @date :2020/02/21 21:55
 */
public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public Carwash carWash;

    @SerializedName("sport")
    public Sport mSport;

    public class Comfort {
        @SerializedName("txt")
        public String info;
    }

    public class Carwash {
        @SerializedName("txt")
        public String info;
    }

    public class Sport {
        @SerializedName("txt")
        public String info;
    }
}
