package com.hao.percentlayout.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.hao.percentlayout.layoutparams.LinearLayoutParams;

/**
 * 百分比线性布局
 * Created by Hao on 2016/9/8.
 */
public class PercentLinearLayout extends LinearLayout {
    public PercentLinearLayout(Context context) {
        super(context);
    }

    public PercentLinearLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public PercentLinearLayout(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int widthnum = MeasureSpec.getSize(widthMeasureSpec);
        int heightnum = MeasureSpec.getSize(heightMeasureSpec);
        for (int i = 0; i < getChildCount(); i++) {
            View child = getChildAt(i);
            float widtChild = 0;
            float heightChild = 0;
            ViewGroup.LayoutParams params = child.getLayoutParams();
            if (params instanceof LinearLayoutParams) {
                widtChild = ((LinearLayoutParams) params).getWidthPercent();
                heightChild = ((LinearLayoutParams) params).getHeightPercent();
            }
            if (widtChild == 0 && heightChild == 0) {
                continue;
            }
            if (widtChild == 0 && heightChild != 0) {
                params.height = (int) (heightChild * heightnum);
                continue;
            }
            if (widtChild != 0 && heightChild == 0) {
                params.width = (int) (widtChild * widthnum);
                continue;
            }
            params.width = (int) (widtChild * widthnum);
            params.height = (int) (heightChild * heightnum);
        }
    }

    @Override
    public LayoutParams generateLayoutParams(AttributeSet attrs) {
        return new LinearLayoutParams(getContext(), attrs);
    }
}
