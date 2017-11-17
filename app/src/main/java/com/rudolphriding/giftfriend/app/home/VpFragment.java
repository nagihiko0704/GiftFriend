package com.rudolphriding.giftfriend.app.home;

import android.app.Fragment;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.rudolphriding.giftfriend.R;

/**
 * Created by LeeJihye on 2017-11-09.
 */

public class VpFragment extends android.support.v4.app.Fragment
{
    private int image;
    private ViewGroup rootView;
    private ImageView imageView;
    private Bitmap bitmapImg;
    BitmapFactory.Options options;

    public static VpFragment create(int image)
    {
        VpFragment fragment = new VpFragment();
        Bundle args = new Bundle();
        args.putInt("image", image);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        image = getArguments().getInt("image");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        rootView = (ViewGroup) inflater.inflate(R.layout.item_home_viewpager, container, false);
        options = new BitmapFactory.Options();
        options.inSampleSize = 2;
        bitmapImg = BitmapFactory.decodeResource(rootView.getResources(), image, options);

        imageView = (ImageView) rootView.findViewById(R.id.viewPager_ImageView);
        imageView.setImageBitmap(bitmapImg);

        return rootView;
    }
}
