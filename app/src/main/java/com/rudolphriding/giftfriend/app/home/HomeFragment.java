package com.rudolphriding.giftfriend.app.home;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rudolphriding.giftfriend.R;
import com.rudolphriding.giftfriend.model.HomeItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 이지혜 on 2017-09-10.
 */

public class HomeFragment extends Fragment
{
    ViewPager viewPager;
    VpAdapter adapter;
    TabLayout tabLayout;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View hView = inflater.inflate(R.layout.fragment_home, container, false);

        viewPager = (ViewPager) hView.findViewById(R.id.home_viewPager);
        adapter = new VpAdapter(getChildFragmentManager());
        viewPager.setAdapter(adapter);

        tabLayout = (TabLayout) hView.findViewById(R.id.home_dotNavi_tabLayout);
        tabLayout.setupWithViewPager(viewPager, true);

        return hView;
    }

    public static HomeFragment newInstance()
    {
        Bundle args = new Bundle();

        HomeFragment fragment = new HomeFragment();
        fragment.setArguments(args);
        return fragment;
    }

}
