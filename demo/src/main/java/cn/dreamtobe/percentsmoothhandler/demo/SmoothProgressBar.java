package cn.dreamtobe.percentsmoothhandler.demo;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/**
 * Created by Jacksgong on 2/4/16.
 */
public class SmoothProgressBar extends ProgressBar {

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
}
