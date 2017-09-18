package com.rudolphriding.giftfriend.app.trend;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rudolphriding.giftfriend.R;

public class TrendFragment extends Fragment
{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View vTrend = inflater.inflate(R.layout.fragment_trend, null);
        return vTrend;
    }
}

