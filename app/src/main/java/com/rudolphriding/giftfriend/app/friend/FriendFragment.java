package com.rudolphriding.giftfriend.app.friend;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rudolphriding.giftfriend.R;

/**
 * Created by 이지혜 on 2017-09-22.
 */

public class FriendFragment extends Fragment
{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View fView = inflater.inflate(R.layout.fragment_friend, null);
        return fView;
    }

    public static FriendFragment newInstance()
    {
        Bundle args = new Bundle();

        FriendFragment fragment = new FriendFragment();
        fragment.setArguments(args);
        return fragment;
    }
}
