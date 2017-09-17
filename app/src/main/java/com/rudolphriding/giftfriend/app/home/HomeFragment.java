package com.rudolphriding.giftfriend;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 이지혜 on 2017-09-10.
 */

public class Home extends Fragment
{
    private RecyclerView recyclerView;
    private LinearLayoutManager layoutManager;
    private RecyclerAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View hView = inflater.inflate(R.layout.fragment_home, container, false);

        //recyclerview
        recyclerView = (RecyclerView)hView.findViewById(R.id.home_recyclerview);

        initData();

        layoutManager = new LinearLayoutManager(getActivity());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
        recyclerView.scrollToPosition(0);



        return hView;
    }
/*
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        initData();
    }
*/

    private void initData()
    {
        List<RecyclerItem> items = new ArrayList<>();
        this.adapter = new RecyclerAdapter(getActivity(), items, R.layout.item_home_cardview);
        
        items.add(new RecyclerItem(R.drawable.rudingworld_start1, "TEST#1", "SUBTEST#1"));
        items.add(new RecyclerItem(R.drawable.rudingworld_start2, "TEST#2", "SUBTEST#2"));
        this.adapter.notifyDataSetChanged();
    }
}
