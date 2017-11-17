package com.rudolphriding.giftfriend.app.home;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.view.View;
import com.rudolphriding.giftfriend.R;

/**
 * Created by LeeJihye on 2017-11-08.
 */

public class VpAdapter extends FragmentStatePagerAdapter {


    private int[] sampleImg = new int[] { R.drawable.img_home_cardviewbg_01, R.drawable.img_home_cardviewbg_02 };

    public VpAdapter(FragmentManager fragmentManager)
    {
        super(fragmentManager);
    }

    @Override
    public int getCount() {
        return sampleImg.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Fragment getItem(int position) {
        return VpFragment.create(sampleImg[position]);
    }
}
