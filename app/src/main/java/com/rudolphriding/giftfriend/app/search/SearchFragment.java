package com.rudolphriding.giftfriend.app.search;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rudolphriding.giftfriend.R;

public class SearchFragment extends Fragment
{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View sView = inflater.inflate(R.layout.fragment_search, null);
        return sView;
    }
}