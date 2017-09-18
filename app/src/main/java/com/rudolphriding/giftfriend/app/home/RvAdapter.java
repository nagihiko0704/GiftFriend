package com.rudolphriding.giftfriend.app.home;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.rudolphriding.giftfriend.model.HomeItem;

import java.util.List;

/**
 * Created by 이지혜 on 2017-09-14.
 */

public class RvAdapter extends RecyclerView.Adapter<RvHolder>
{
    Context context;
    List<HomeItem> items;
    int itemLayout;

    public RvAdapter(Context context, List<HomeItem> items, int itemLayout)
    {
        this.context = context;
        this.items = items;
        this.itemLayout = itemLayout;
    }

    @Override
    public RvHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View v = LayoutInflater.from(parent.getContext()).inflate(itemLayout, parent, false);
        return new RvHolder(v);
    }

    //@TargetApi(Build.VERSION_CODES.N)
    @Override
    public void onBindViewHolder(RvHolder holder, int position)
    {
        final HomeItem item = items.get(position);

        holder.image.setImageResource(item.getBackground());
        holder.title.setText(item.getTitle());
        holder.subtitle.setText(item.getSubtitle());

        holder.container.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(context, item.getTitle(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount()
    {
        return this.items.size();
    }

}

