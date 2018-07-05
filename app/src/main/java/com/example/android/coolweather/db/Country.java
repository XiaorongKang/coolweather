package com.example.android.coolweather.db;

import org.litepal.crud.DataSupport;

public class Country extends DataSupport{
    private int id;
    private String countryName;
    private int countryCode;
    private String weatherId;//记录县所对应的ID
    private int cityId;//当前县所属的市的Id

    public int getId() {
        return id;
    }

    public String getCountryName() {
        return countryName;
    }

    public int getCountryCode() {
        return countryCode;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setCountryCode(int countryCode) {
        this.countryCode = countryCode;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
