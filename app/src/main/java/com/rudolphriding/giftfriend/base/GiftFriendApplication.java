package com.rudolphriding.giftfriend.base;

import android.app.Application;

import com.tsengvn.typekit.Typekit;

/**
 * Created by 이지혜 on 2017-09-06.
 */

public class GiftFriendApplication extends Application
{
    @Override
    public void onCreate()
    {
        super.onCreate();

        Typekit.getInstance()
                .addNormal(Typekit.createFromAsset(this, "Spoqa Han Sans Light.ttf"))
                .addBold(Typekit.createFromAsset(this, "Spoqa Han Sans Regular.ttf"))
                .add("action_bar_font",Typekit.createFromAsset(this, "Yanoljaya-Bold.ttf"));
    }
}
