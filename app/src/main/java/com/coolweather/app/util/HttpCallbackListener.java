package com.coolweather.app.util;

/**
 * Created by Administrator on 2016/6/8.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
