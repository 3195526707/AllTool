package com.haizi.alltool.utils;

import com.squareup.okhttp.Callback;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2016/4/24.
 */
public class OkHttpUtils {

    private static final  String CHARSET_NAME = "UTF-8";
    private OkHttpClient okHttpClient = null;

    private OkHttpUtils() {

    }

    public OkHttpClient getOkHttpClient() {
        if (okHttpClient != null)
            return okHttpClient;

        synchronized (this) {
            if (okHttpClient == null) {
                okHttpClient = new OkHttpClient();
                okHttpClient.setConnectTimeout(30,TimeUnit.SECONDS);
            }
        }
        return okHttpClient;
    }

    public String execute(String url) {
        Request request = new Request.Builder().url(url).build();
        Response response = null;
        try {
            response = getOkHttpClient().newCall(request).execute();
            if (response.isSuccessful()) {
                return response.body().string();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 开启异步线程访问网络
     * @param url
     * @param callback
     */
    public void executeAsync(String url, Callback callback) {
        Request request = new Request.Builder().url(url).build();
        getOkHttpClient().newCall(request).enqueue(callback);
    }

    public String execute(String url, String json) {
        MediaType JsonType = MediaType.parse("application/json; charset=utf-8");
        RequestBody body = RequestBody.create(JsonType, json);
        Request request = new Request.Builder().url(url).post(body).build();

        Response response = null;
        try {
            response = getOkHttpClient().newCall(request).execute();
            if (response.isSuccessful()) {
                return response.body().string();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 开启异步线程访问网络
     * @param url
     * @param callback
     */
    public void executeAsync(String url, String json, Callback callback) {
        MediaType JsonType = MediaType.parse("application/json; charset=utf-8");
        RequestBody body = RequestBody.create(JsonType, json);
        Request request = new Request.Builder().url(url).post(body).build();
        getOkHttpClient().newCall(request).enqueue(callback);
    }

}
