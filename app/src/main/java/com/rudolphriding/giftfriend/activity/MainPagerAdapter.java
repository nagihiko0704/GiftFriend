package com.rudolphriding.giftfriend.activity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.rudolphriding.giftfriend.app.friend.FriendFragment;
import com.rudolphriding.giftfriend.app.home.HomeFragment;

/**
 * Created by LeeJihye on 2017-11-01.
 */

public class MainPagerAdapter extends FragmentPagerAdapter
{
    private int FRAGMENT_NUM;

    public MainPagerAdapter(FragmentManager fm, int tabCount) {
        super(fm);
        this.FRAGMENT_NUM = tabCount;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                return HomeFragment.newInstance();
            case 1:
                return FriendFragment.newInstance();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return FRAGMENT_NUM;
    }
}
