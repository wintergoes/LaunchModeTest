package com.zht.car.launchmodetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

public class MainActivity extends BaseActivity {
    private static final String LOG_TAG = "MainActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTvInfo = findViewById(R.id.tvInfo);
    }

    public void onbuttonSingleTopWithMultiTaskClick(View view) {
        Intent intent = new Intent(this, SingleTopWithMultiTaskActivityA.class);
        startActivity(intent);
    }

    public void onBtnSingleTaskTestClick(View view) {
        Intent intent = new Intent(this, SingleTaskActivityA.class);
//        Intent.FLAG_ACTIVITY_CLEAR_TASK
//        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, SingleTaskActivityA.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        }, 5000);
    }
}
