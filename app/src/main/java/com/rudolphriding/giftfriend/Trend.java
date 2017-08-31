package com.rudolphriding.giftfriend;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

public class Trend extends AppCompatActivity
{
    LinearLayout categoryContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trend);

        categoryContainer = (LinearLayout) findViewById(R.id.category_container);

        LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.category, categoryContainer, true);
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
