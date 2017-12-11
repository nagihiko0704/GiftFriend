package com.rudolphriding.giftfriend.activity;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ListView;

import com.rudolphriding.giftfriend.R;
import com.rudolphriding.giftfriend.app.gift.TagAdapter;
import com.rudolphriding.giftfriend.base.BaseActivity;
import com.rudolphriding.giftfriend.model.TagItem;

import java.util.ArrayList;
import java.util.List;

public class GiftActivity extends BaseActivity {

    Context context;

    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;
    private TagAdapter tadapter;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gift);

        context = getApplicationContext();

        recyclerView = (RecyclerView) findViewById(R.id.gift_tag_RecyclerView);

        initData();

        linearLayoutManager = new LinearLayoutManager(context)
        {
            @Override
            public boolean canScrollVertically()
            {
                return false;
            }
        };
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);


        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(tadapter);

    }

    private void initData()
    {
        List<TagItem> items = new ArrayList<>();
        this.tadapter = new TagAdapter(context, items);

        items.add(new TagItem("#태그1"));
        items.add(new TagItem("#긴태그"));
        items.add(new TagItem("#엄청기이인태그"));
        items.add(new TagItem("#태그2"));
        items.add(new TagItem("#기이이이이이이이이이인태그"));

        this.tadapter.notifyDataSetChanged();
    }
}
