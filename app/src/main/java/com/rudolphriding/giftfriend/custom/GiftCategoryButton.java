package com.rudolphriding.giftfriend.custom;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.rudolphriding.giftfriend.R;

/**
 * Created by LeeJihye on 2017-11-06.
 */

public class GiftCategoryButton extends RelativeLayout {

    RelativeLayout layout;
    ImageButton button;
    TextView title;

    private int btnImage;
    private int btnSize;
    private int btnMargin;
    private int textWidth;
    private int textHeight;
    private String text;
    private int textColor;

    public GiftCategoryButton(Context context) {
        super(context);
        initView();
    }

    public GiftCategoryButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView();
        getAttrs(attrs);
    }

    public GiftCategoryButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView();
        getAttrs(attrs, defStyleAttr);
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        super.onLayout(changed, l, t, r, b);
    }

    private void initView() {
        String infService = Context.LAYOUT_INFLATER_SERVICE;
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(infService);
        View view = inflater.inflate(R.layout.custom_home_circlebutton, this, false);
        addView(view);

        layout = (RelativeLayout) findViewById(R.id.giftcategory_layout);
        button = (ImageButton) findViewById(R.id.giftcategory_button);
        title = (TextView) findViewById(R.id.giftcategory_title);
    }

    private void getAttrs(AttributeSet attrs) {
        TypedArray typedArray = getContext().obtainStyledAttributes(attrs, R.styleable.GiftCategoryButton);
        setTypedArray(typedArray);
    }

    private void getAttrs(AttributeSet attrs, int defStyle) {
        TypedArray typedArray = getContext().obtainStyledAttributes(attrs, R.styleable.GiftCategoryButton, defStyle, 0);
        setTypedArray(typedArray);
    }

    private void setTypedArray(TypedArray typedArray)
    {
        btnImage = typedArray.getResourceId(R.styleable.GiftCategoryButton_btnImage, R.drawable.btn_background_round_mint_01);
        btnSize = typedArray.getInteger(R.styleable.GiftCategoryButton_btnSize, 60);
        btnMargin = typedArray.getInteger(R.styleable.GiftCategoryButton_btnMargin, 5);

        textWidth = typedArray.getInteger(R.styleable.GiftCategoryButton_textWidth, 50);
        textHeight = typedArray.getInteger(R.styleable.GiftCategoryButton_textHeight, 20);
        text = typedArray.getString(R.styleable.GiftCategoryButton_text);
        textColor = typedArray.getColor(R.styleable.GiftCategoryButton_textColor, 0xB2B2B2);

        button.setImageResource(btnImage);
        LayoutParams params = (LayoutParams) button.getLayoutParams();
        params.height = btnSize;
        params.width = btnSize;
        params.setMargins(btnMargin, btnMargin, btnMargin, btnMargin);
        button.setLayoutParams(params);

        title.setWidth(textWidth);
        title.setHeight(textHeight);
        title.setText(text);
        title.setTextColor(textColor);

        typedArray.recycle();
    }




    public int getBtnImage() {
        return btnImage;
    }

    public void setBtnImage(int btnImage) {
        this.btnImage = btnImage;
    }

    public int getBtnSize() {
        return btnSize;
    }

    public void setBtnSize(int btnSize) {
        this.btnSize = btnSize;
    }

    public int getBtnMargin() {
        return btnMargin;
    }

    public void setBtnMargin(int btnMargin) {
        this.btnMargin = btnMargin;
    }

    public int getTextWidth() {
        return textWidth;
    }

    public void setTextWidth(int textWidth) {
        this.textWidth = textWidth;
    }

    public int getTextHeight() {
        return textHeight;
    }

    public void setTextHeight(int textHeight) {
        this.textHeight = textHeight;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getTextColor() {
        return textColor;
    }

    public void setTextColor(int textColor) {
        this.textColor = textColor;
    }
}

