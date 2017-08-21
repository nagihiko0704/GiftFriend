package com.rudolphriding.giftfriend;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
