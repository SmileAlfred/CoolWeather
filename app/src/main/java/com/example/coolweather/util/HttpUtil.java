package com.example.coolweather.util;


import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * @author LiuSaiSai
 * @description: 与服务器交互；获取全国省市县的数据
 * @date :2020/02/21 11:08
 */
public class HttpUtil {
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
