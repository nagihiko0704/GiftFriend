package com.rudolphriding.giftfriend;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Trend extends Fragment
{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View vTrend = inflater.inflate(R.layout.fragment_trend, null);
        return vTrend;
    }
}

