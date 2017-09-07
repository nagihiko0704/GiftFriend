package com.rudolphriding.giftfriend;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.tsengvn.typekit.Typekit;
import com.tsengvn.typekit.TypekitContextWrapper;

public class Main extends ApplicationBase
{
    Fragment main;
    Fragment trend;
    Fragment search;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //view custom action bar
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        getSupportActionBar().setCustomView(R.layout.main_actionbar);
    }

    //update main
    public void MaintoMain(View view)
    {

    }

    //change activity main to trend
    public void MaintoTrend(View view)
    {
        Intent mtot = new Intent(Main.this, Trend.class);
        startActivity(mtot);
    }

    //change activity main to search
    public void MaintoSearch(View view)
    {
        Intent mtos = new Intent(Main.this, Search.class);
        startActivity(mtos);
    }
}
