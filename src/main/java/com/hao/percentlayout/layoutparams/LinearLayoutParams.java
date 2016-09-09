package com.hao.percentlayout.layoutparams;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import com.hao.percentlayout.R;

/**
 * 百分比线性布局配置文件
 * Created by Hao on 2016/9/8.
 */
public class LinearLayoutParams extends LinearLayout.LayoutParams {
    private float widthPercent;
    private float heightPercent;

    public LinearLayoutParams(Context c, AttributeSet attrs) {
        super(c, attrs);
        TypedArray typedArray = c.obtainStyledAttributes(attrs, R.styleable.HaoPercentLayout);
        widthPercent = typedArray.getFloat(R.styleable.HaoPercentLayout_layout_percentwidth, widthPercent);
        heightPercent = typedArray.getFloat(R.styleable.HaoPercentLayout_layout_percentheight, heightPercent);
    }

    public float getWidthPercent() {
        return widthPercent;
    }

    public void setWidthPercent(float widthPercent) {
        this.widthPercent = widthPercent;
    }

    public float getHeightPercent() {
        return heightPercent;
    }

    public void setHeightPercent(float heightPercent) {
        this.heightPercent = heightPercent;
    }
}
