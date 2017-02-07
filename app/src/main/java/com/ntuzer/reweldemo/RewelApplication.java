package com.ntuzer.reweldemo;

import android.app.Application;

import com.ntuzer.reweldemo.util.UtilLog;

/**
 * Created by ntuzer on 2/6/2017.
 */
public class RewelApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        UtilLog.setDebug(true);//RGJR set true/false find log
    }

}