package com.ming.weather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

//传地址发起服务器请求
public class HttpUtil {

    public static void sendOkHttpRequest(String address, okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
