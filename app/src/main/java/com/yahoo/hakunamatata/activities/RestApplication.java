package com.yahoo.hakunamatata.activities;

import android.app.Application;
import android.content.Context;

import com.yahoo.hakunamatata.models.User;
import com.yahoo.hakunamatata.network.FacebookClient;

/**
 * Created by jonaswu on 2015/8/29.
 */
public class RestApplication extends Application {
    private static Context context;
    private static User me;

    public static User getMe() {
        return me;
    }

    public static void setMe(User me) {
        RestApplication.me = me;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        RestApplication.context = this;
    }

    public static FacebookClient getRestClient() {
        return (FacebookClient) FacebookClient.getInstance(RestApplication.context);
    }
}