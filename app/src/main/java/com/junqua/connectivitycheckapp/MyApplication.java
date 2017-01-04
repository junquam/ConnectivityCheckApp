package com.junqua.connectivitycheckapp;

import android.app.Application;

public class MyApplication extends Application {

    private static MyApplication mInstance;

    //Create a singleton
    @Override
    public void onCreate() {
        super.onCreate();

        mInstance = this;
    }

    public static synchronized MyApplication getInstance() {
        return mInstance;
    }

    //get status network to send data when connectivity restored
    public void setConnectivityListener(ConnectivityMonitor.ConnectivityReceiverListener listener) {
        ConnectivityMonitor.connectivityReceiverListener = listener;
    }
}
