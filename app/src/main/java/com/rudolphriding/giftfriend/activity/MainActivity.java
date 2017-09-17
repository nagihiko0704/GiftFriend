package com.rudolphriding.giftfriend;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;

import java.util.ArrayList;
import java.util.List;

public class Main extends ApplicationBase
{
    private final int HOME_FRAGMENT = 1;
    private final int TREND_FRAGMENT = 2;
    private final int SEARCH_FRAGMENT = 3;

    RelativeLayout container;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //view custom action bar
        customActionbar();

        container = (RelativeLayout) findViewById(R.id.activity_main_container);

        //initialize first view as home
        callFragment(1);
    }

    public void customActionbar()
    {
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        getSupportActionBar().setCustomView(R.layout.item_main_actionbar);
    }


    //update main
    public void MaintoMain(View view)
    {
        callFragment(HOME_FRAGMENT);
    }

    //change activity main to trend
    public void MaintoTrend(View view)
    {
        callFragment(TREND_FRAGMENT);
    }

    //change activity main to search
    public void MaintoSearch(View view)
    {
        callFragment(SEARCH_FRAGMENT);
    }

    private void callFragment(int fragmentNum)
    {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        switch (fragmentNum)
        {
            case 1:
                Home homeFragment = new Home();
                transaction.replace(R.id.activity_main_container, homeFragment);
                transaction.commit();
                break;

            case 2:
                Trend trendFragment = new Trend();
                transaction.replace(R.id.activity_main_container, trendFragment);
                transaction.commit();
                break;

            case 3:
                Search searchFragment = new Search();
                transaction.replace(R.id.activity_main_container, searchFragment);
                transaction.commit();
                break;
        }

    }


}
