package com.rudolphriding.giftfriend;

import android.app.Application;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;

import com.tsengvn.typekit.Typekit;
import com.tsengvn.typekit.TypekitContextWrapper;

/**
 * Created by 이지혜 on 2017-08-31.
 */

public class ApplicationBase extends AppCompatActivity
{
    @Override protected void attachBaseContext(Context newBase)
    {
        super.attachBaseContext(TypekitContextWrapper.wrap(newBase));
    }
}