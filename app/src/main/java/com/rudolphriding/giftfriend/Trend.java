package com.rudolphriding.giftfriend;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Trend extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trend);
    }

    //update trend
    public void TrendtoTrend(View view)
    {

    }

    //change activity trend to main
    public void TrendtoMain(View view)
    {
        Intent ttom = new Intent(Trend.this, Main.class);
        startActivity(ttom);
    }

    //change activity trend to search
    public void TrendtoSearch(View view)
    {
        Intent mtos = new Intent(Trend.this, Search.class);
        startActivity(mtos);
    }
}
