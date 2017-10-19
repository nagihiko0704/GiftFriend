package com.rudolphriding.giftfriend.activity;

import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

import com.rudolphriding.giftfriend.app.friend.FriendFragment;
import com.rudolphriding.giftfriend.base.BaseActivity;
import com.rudolphriding.giftfriend.app.home.HomeFragment;
import com.rudolphriding.giftfriend.R;
import com.rudolphriding.giftfriend.app.search.SearchFragment;
import com.rudolphriding.giftfriend.app.trend.TrendFragment;

public class MainActivity extends BaseActivity
{
    private final int HOME_FRAGMENT = 1;
    private final int TREND_FRAGMENT = 2;
    private final int SEARCH_FRAGMENT = 3;

    DrawerLayout drawerLayout;
    RelativeLayout container;
    View friendDrawer;
    ImageButton menuButton;
    ImageButton slidMenuBackButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //view custom action bar
        customActionbar();

        friendDrawer = (View) findViewById(R.id.drawer);
        drawerLayout = (DrawerLayout) findViewById(R.id.activity_main);
        container = (RelativeLayout) findViewById(R.id.activity_main_container);
        menuButton = (ImageButton) findViewById(R.id.actionbar_button_menu);
        slidMenuBackButton = (ImageButton) findViewById(R.id.sidemenu_button_close);

        //drawer open by button on action bar
        draweOpnebyMenuButton();

        //drawer close by button on slide menu
        drawerClosebyBackButton();

        //initialize first view as home
        callFragment(1);
    }

    public void customActionbar()
    {
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        getSupportActionBar().setCustomView(R.layout.item_main_actionbar);
    }

    /* /////////////////////////////////////////////////
    //                                                //
    //                  About drawer                  //
    //                                                //
    ///////////////////////////////////////////////// */

    public void draweOpnebyMenuButton()
    {
        menuButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                drawerLayout.openDrawer(friendDrawer);
            }
        });
    }

    public void drawerClosebyBackButton()
    {
        slidMenuBackButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                drawerLayout.closeDrawer(friendDrawer);
            }
        });
    }

    /* /////////////////////////////////////////////////
    //                                                //
    //              About window switch               //
    //                                                //
    ///////////////////////////////////////////////// */

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
                HomeFragment homeFragment = new HomeFragment();
                transaction.replace(R.id.activity_main_container, homeFragment);
                transaction.commit();
                break;

            case 2:
                TrendFragment trendFragment = new TrendFragment();
                transaction.replace(R.id.activity_main_container, trendFragment);
                transaction.commit();
                break;

            case 3:
                //SearchFragment searchFragment = new SearchFragment();
                //transaction.replace(R.id.activity_main_container, searchFragment);
                FriendFragment friendFragment = new FriendFragment();
                transaction.replace(R.id.activity_main_container, friendFragment);
                transaction.commit();
                break;
        }

    }


}
