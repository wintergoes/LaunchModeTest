package com.zht.car.launchmodetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class SingleTaskActivityA extends BaseActivity {
    private String LOG_TAG = "SingleTaskActivityA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_task_activity);

        mTvInfo = findViewById(R.id.tvInfo);
    }

    public void onButtonAClick(View view) {
        Intent intent = new Intent(this, SingleTaskActivityB.class);
        startActivity(intent);
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.d(LOG_TAG, "onNewIntent");
    }
}
