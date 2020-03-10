package com.example.coolweather.db;

import org.litepal.crud.LitePalSupport;

/**
 * @author LiuSaiSai
 * @description:
 * @date :2020/02/21 10:52
 */
public class Province extends LitePalSupport {

    /**
     * id 是每一个实体类都应该有的字段
     */
    private int id;

    private String provinceName;

    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
