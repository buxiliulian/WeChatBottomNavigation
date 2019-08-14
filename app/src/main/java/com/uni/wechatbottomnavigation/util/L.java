package com.uni.wechatbottomnavigation.util;

import android.util.Log;

import com.uni.wechatbottomnavigation.BuildConfig;


public class L {
    private static final String TAG = "UMX";

    private static final boolean DEBUG = BuildConfig.DEBUG;

    public static void d(String msg) {
        if (DEBUG) {
            Log.d(TAG, msg);
        }
    }
}
