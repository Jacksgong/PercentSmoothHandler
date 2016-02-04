package cn.dreamtobe.percentsmoothhandler.demo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/**
 * Created by Jacksgong on 2/4/16.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        assignViews();
        smoothPb.setSmoothPercent(0.5f);
    }

    public void onClickSmoothIncrease(final View view) {
        float targetPercent = smoothPb.getPercent() + 0.05f;
        smoothPb.setSmoothPercent(Math.min(1, targetPercent));
    }

    public void onClickRest(final View view) {
        smoothPb.setSmoothPercent(0);
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

    private void assignViews() {
        smoothPb = (SmoothProgressBar) findViewById(R.id.smooth_pb);
    }

}
