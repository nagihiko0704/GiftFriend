package com.rudolphriding.giftfriend;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Created by 이지혜 on 2017-09-10.
 */

public class SquareImageView extends android.support.v7.widget.AppCompatImageView {

    public SquareImageView(Context context) {
        super(context);
    }

    public SquareImageView(Context context, AttributeSet attrs) { super(context, attrs); }

    public SquareImageView(Context context, AttributeSet attrs, int defStyle) { super(context, attrs, defStyle); }

    @Override
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec)
    {
        super.onMeasure(widthMeasureSpec, widthMeasureSpec);
        int width = MeasureSpec.getSize(widthMeasureSpec);
        int height = MeasureSpec.getSize(heightMeasureSpec);
        int size = width > height ? height : width;
        setMeasuredDimension(size, size); // make it square
    }

}