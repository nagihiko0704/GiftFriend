package com.rudolphriding.giftfriend;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Search extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
    }

    //update search
    public void SearchtoSearch(View view)
    {

    }

    //change activity search to main
    public void SearchtoMain(View view)
    {
        Intent stom = new Intent(Search.this, Main.class);
        startActivity(stom);
    }

    //change activity search to trend
    public void SearchtoTrend(View view)
    {
        Intent stot = new Intent(Search.this, Trend.class);
        startActivity(stot);
    }
}
