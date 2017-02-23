package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by lx on 2017/2/21.
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
