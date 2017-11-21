package com.rudolphriding.giftfriend.app.home;

import android.content.Intent;
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
import android.widget.Button;

import com.rudolphriding.giftfriend.R;
import com.rudolphriding.giftfriend.activity.GiftActivity;
import com.rudolphriding.giftfriend.model.HomeItem;
import com.rudolphriding.giftfriend.widget.SquareButton;

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
    SquareButton squareButton;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View hView = inflater.inflate(R.layout.fragment_home, container, false);

        squareButton = (SquareButton) hView.findViewById(R.id.home_anniv_SquareButton);

        squareButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), GiftActivity.class);
                startActivity(intent);
            }
        });

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
