package com.rudolphriding.giftfriend.activity;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;


import com.rudolphriding.giftfriend.base.BaseActivity;
import com.rudolphriding.giftfriend.R;


public class MainActivity extends BaseActivity
{
    ViewPager viewPager;
    TabLayout tabLayout;
    DrawerLayout drawerLayout;
    View friendDrawer;
    ImageButton menuButton;
    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //view custom action bar
        //customActionbar();

        //initialize tab
        initTab();

        friendDrawer = (View) findViewById(R.id.drawer);
        drawerLayout = (DrawerLayout) findViewById(R.id.activity_main);
        menuButton = (ImageButton) findViewById(R.id.actionbar_button_menu);
        loginButton = (Button) findViewById(R.id.sideMenu_login_Button);

        //set MainPagerAdapter
        viewPager = (ViewPager) findViewById(R.id.activity_main_veiwpager);
        MainPagerAdapter pagerAdapter = new MainPagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(pagerAdapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

        //drawer open by button on action bar
        draweOpnebyMenuButton();

    }

    /* /////////////////////////////////////////////////
    //                                                //
    //                    About UI                    //
    //                                                //
    ///////////////////////////////////////////////// */

    public void customActionbar()
    {
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        getSupportActionBar().setCustomView(R.layout.item_main_actionbar);
    }

    public void initTab()
    {
        tabLayout = (TabLayout) findViewById(R.id.activity_main_tablayout);
        tabLayout.addTab(tabLayout.newTab().setText("선물스토리"));
        tabLayout.addTab(tabLayout.newTab().setText("친구스토리"));
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

}
