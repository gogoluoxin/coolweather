package com.example.coolweather.gson;

/**
 * Created by lx on 2017/2/21.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
