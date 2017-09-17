package com.rudolphriding.giftfriend.app.home;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.rudolphriding.giftfriend.R;
import com.rudolphriding.giftfriend.model.HomeItem;

import java.util.List;

/**
 * Created by 이지혜 on 2017-09-14.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder>
{
    Context context;
    List<HomeItem> items;
    int itemLayout;

    public RecyclerAdapter(Context context, List<HomeItem> items, int itemLayout)
    {
        this.context = context;
        this.items = items;
        this.itemLayout = itemLayout;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View v= LayoutInflater.from(parent.getContext()).inflate(itemLayout, parent, false);
        return new ViewHolder(v);
    }

    //@TargetApi(Build.VERSION_CODES.N)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position)
    {
        final HomeItem item = items.get(position);

        holder.image.setImageResource(item.getBackground());
        holder.title.setText(item.getTitle());
        holder.subtitle.setText(item.getSubtitle());

        holder.cardview.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                    Toast.makeText(context,item.getTitle(),Toast.LENGTH_SHORT).show();
                    }
                }
                );
    }

    @Override
    public int getItemCount() { return this.items.size(); }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView title;
        TextView subtitle;
        CardView cardview;

        public ViewHolder(View itemView) {
            super(itemView);

            image = (ImageView)itemView.findViewById(R.id.cardview_image_title);
            title = (TextView)itemView.findViewById(R.id.cardview_text_title);
            subtitle = (TextView)itemView.findViewById(R.id.cardview_text_subtitle) ;
            cardview = (CardView)itemView.findViewById(R.id.cardview);
        }
    }
}

