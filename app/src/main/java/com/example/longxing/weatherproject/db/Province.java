package com.example.longxing.weatherproject.db;

import org.litepal.crud.DataSupport;

/**
 * Created by longxing on 2017/11/9.
 */

public class Province extends DataSupport {
    private int id;
    private String provinceName;
    private int provinceCode;

    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getProvinceName(){
        return this.provinceName;
    }

    public void setProvinceName(String provinceName){
        this.provinceName = provinceName;
    }

    public int getProvinceCode(){
        return this.provinceCode;
    }

    public void setProvinceCode(int provinceCode){
        this.provinceCode = provinceCode;
    }
}
