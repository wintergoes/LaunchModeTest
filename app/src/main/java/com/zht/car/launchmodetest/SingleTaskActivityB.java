package com.zht.car.launchmodetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class SingleTaskActivityB extends BaseActivity {
    private String LOG_TAG = "SingleTaskActivityB";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_task_b);

        mTvInfo = findViewById(R.id.tvInfo);
    }

    public void onButtonBClick(View view) {
        Intent intent = new Intent(this, SingleTaskActivityC.class);
        startActivity(intent);
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.d(LOG_TAG, "onNewIntent");
    }
}
