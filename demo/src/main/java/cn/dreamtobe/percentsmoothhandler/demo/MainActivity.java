package cn.dreamtobe.percentsmoothhandler.demo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatSeekBar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.SeekBar;

import cn.dreamtobe.percentsmoothhandler.SmoothHandler;

/**
 * Created by Jacksgong on 2/4/16.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        assignViews();
        smoothPb.setSmoothPercent(0.3f);
        SmoothHandler.NEED_LOG = true;

        increaseDurationSmoothSb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                increaseDurationSmoothBtn.setText(
                        getString(R.string.increase_duration_definite_smoothly, getDuration()));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
    }

    public void onClickNormalIncrease(final View view) {
        smoothPb.setPercent(getIncreasePercent());
    }

    public void onClickSmoothIncrease(final View view) {
        smoothPb.setSmoothPercent(getIncreasePercent());
    }

    public void onClickSmoothDurationIncrease(final View view) {
        smoothPb.setSmoothPercent(getIncreasePercent(), getDuration());
    }

    public void onClickRest(final View view) {
        smoothPb.setPercent(0);
    }

    private int getDuration() {
        return increaseDurationSmoothSb.getProgress()/*10ms*/ * 100;
    }

    private float getIncreasePercent() {
        float targetPercent = smoothPb.getPercent() + 0.1f;
        return Math.min(1, targetPercent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_github:
                openGitHub();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void openGitHub() {
        Uri uri = Uri.parse(getString(R.string.app_github_url));
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    private SmoothProgressBar smoothPb;
    private AppCompatSeekBar increaseDurationSmoothSb;
    private AppCompatButton increaseDurationSmoothBtn;
    private AppCompatButton increaseSmoothlyBtn;
    private AppCompatButton increaseNormalBtn;
    private AppCompatButton resetBtn;

    private void assignViews() {
        smoothPb = (SmoothProgressBar) findViewById(R.id.smooth_pb);
        increaseDurationSmoothSb = (AppCompatSeekBar) findViewById(R.id.increase_duration_smooth_sb);
        increaseDurationSmoothBtn = (AppCompatButton) findViewById(R.id.increase_duration_smooth_btn);
        increaseSmoothlyBtn = (AppCompatButton) findViewById(R.id.increase_smoothly_btn);
        increaseNormalBtn = (AppCompatButton) findViewById(R.id.increase_normal_btn);
        resetBtn = (AppCompatButton) findViewById(R.id.reset_btn);
    }


}
