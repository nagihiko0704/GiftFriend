package com.rudolphriding.giftfriend.app.home;

import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.rudolphriding.giftfriend.R;

/**
 * Created by 이지혜 on 2017-09-17.
 */
public class RvHolder extends RecyclerView.ViewHolder
{
    ImageView image;
    TextView title;
    TextView subtitle;
    ConstraintLayout container;

    public RvHolder(View itemView)
    {
        super(itemView);

        image = (ImageView) itemView.findViewById(R.id.cardview_image_title);
        title = (TextView) itemView.findViewById(R.id.cardview_text_title);
        subtitle = (TextView) itemView.findViewById(R.id.cardview_text_subtitle);
        container = (ConstraintLayout) itemView.findViewById(R.id.container);
    }
}
