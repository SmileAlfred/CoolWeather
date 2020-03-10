package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author LiuSaiSai
 * @description: 用于 GSON 解析；要了解 返回数据的 格式，有些字段不适合 Java命名
 * 通过 @SerializedName() 注解的方式来让 JSON 和Java 字段建立映射关系
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
