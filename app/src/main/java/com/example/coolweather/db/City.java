package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by lx on 2017/2/19.
 */

public class City extends DataSupport {
    private int id;
    private String cityName;
    private int cityCode;
    private int provinceId;
    public String getCityName() {
        return cityName;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public int getCityCode() {
        return cityCode;
    }

    public int getId() {
        return id;
    }


    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public void setId(int id) {
        this.id = id;
    }


}
