package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by lx on 2017/2/19.
 */

public class Province extends DataSupport {
    private int id;
    //记录省的名字
    private String provinceName;
    //省的代号
    private int provinceCode;

    public void setId(int id) {
        this.id = id;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getId() {
        return id;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public String getProvinceName() {
        return provinceName;
    }


}
