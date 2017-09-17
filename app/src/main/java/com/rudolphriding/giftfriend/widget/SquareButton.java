package com.rudolphriding.giftfriend;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;

/**
 * Created by 이지혜 on 2017-08-31.
 */
public class SquareButton extends android.support.v7.widget.AppCompatButton
{
    public SquareButton(Context context) {super(context);}

    public SquareButton(Context context, AttributeSet attrs) {super(context, attrs);}

    public SquareButton(Context context, AttributeSet attrs, int defStyleAttr) {super(context, attrs, defStyleAttr);}

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