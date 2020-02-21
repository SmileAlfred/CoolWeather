package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * @author LiuSaiSai
 * @description:
 * @date :2020/02/21 10:56
 */
public class County extends DataSupport {
    private int id;
    private String countryName; //县名
    private int weatherId;
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public int getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(int weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
