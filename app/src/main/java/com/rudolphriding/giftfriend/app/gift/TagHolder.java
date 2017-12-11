package com.rudolphriding.giftfriend.app.gift;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.rudolphriding.giftfriend.R;

/**
 * Created by LeeJihye on 2017-12-11.
 */

public class TagHolder extends RecyclerView.ViewHolder {

    LinearLayout container;
    TextView textView;

    public TagHolder(View itemView) {
        super(itemView);

        container = (LinearLayout) itemView.findViewById(R.id.item_tagContainer_LinearLayout);
        textView = (TextView) itemView.findViewById(R.id.item_tag_textView);
    }
}
