package com.rudolphriding.giftfriend;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.tsengvn.typekit.TypekitContextWrapper;


/*
public class Trend extends ApplicationBase
{
    LinearLayout categoryContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trend);

        categoryContainer = (LinearLayout) findViewById(R.id.category_container);

        LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.category, categoryContainer, true);
    }
}
*/


public class Trend extends Fragment
{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View vTrend = inflater.inflate(R.layout.activity_trend, null);
        return vTrend;
    }
}

