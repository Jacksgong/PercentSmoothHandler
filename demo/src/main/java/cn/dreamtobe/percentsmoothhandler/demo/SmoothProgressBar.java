package cn.dreamtobe.percentsmoothhandler.demo;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ProgressBar;

import java.lang.ref.WeakReference;

import cn.dreamtobe.percentsmoothhandler.ISmoothTarget;
import cn.dreamtobe.percentsmoothhandler.SmoothHandler;

/**
 * Created by Jacksgong on 2/4/16.
 */
public class SmoothProgressBar extends ProgressBar implements ISmoothTarget {

    public SmoothProgressBar(Context context) {
        super(context);
    }

    public SmoothProgressBar(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SmoothProgressBar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public SmoothProgressBar(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    public float getPercent() {
        return getProgress() / (float) getMax();
    }

    @Override
    public void setPercent(float percent) {
        setProgress((int) Math.ceil(percent * getMax()));
    }

    private SmoothHandler smoothHandler;

    @Override
    public void setSmoothPercent(float percent) {
        if (smoothHandler == null) {
            smoothHandler = new SmoothHandler(new WeakReference<ISmoothTarget>(this));
        }

        smoothHandler.loopSmooth(percent);
    }
}
