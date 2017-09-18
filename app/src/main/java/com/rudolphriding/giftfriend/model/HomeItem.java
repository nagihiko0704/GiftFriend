package com.rudolphriding.giftfriend.model;

import android.widget.Button;

/**
 * Created by 이지혜 on 2017-09-14.
 */

public class HomeItem
{
    int background;
    String title;
    String subtitle;


    public int getBackground() { return this.background; }

    public String getTitle() { return title; }

    public String getSubtitle() { return subtitle; }



    public HomeItem(int background, String title, String subtitle)
    {
        this.background = background;
        this.title = title;
        this.subtitle = subtitle;
    }
}
