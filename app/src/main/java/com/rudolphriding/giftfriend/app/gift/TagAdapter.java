package com.rudolphriding.giftfriend.app.gift;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.rudolphriding.giftfriend.R;
import com.rudolphriding.giftfriend.model.TagItem;

import java.util.List;

/**
 * Created by LeeJihye on 2017-12-11.
 */

public class TagAdapter extends RecyclerView.Adapter<TagHolder>
{
    private Context context;
    private List<TagItem> items;

    public TagAdapter(Context c, List<TagItem> i) {
        this.context = c;
        this.items = i;
    }

    @Override
    public TagHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_gift_taglist, parent, false);
        TagHolder holder = new TagHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(TagHolder holder, int position)
    {
        final TagItem tagItem = items.get(position);

        holder.textView.setText(tagItem.getTag());

        holder.container.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, tagItem.getTag(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return this.items.size();
    }


}
