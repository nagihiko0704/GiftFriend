package com.rudolphriding.giftfriend;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by 이지혜 on 2017-09-10.
 */

public class GiftView extends Fragment
{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View gView = inflater.inflate(R.layout.gift_view, null);
        return gView;
    }
}
