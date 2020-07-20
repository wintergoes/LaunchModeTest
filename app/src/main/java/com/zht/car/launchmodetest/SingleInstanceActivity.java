package com.zht.car.launchmodetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class SingleInstanceActivity extends AppCompatActivity {

    private String LOG_TAG = "SingleInstanceActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_instance);

        setTitle("SingleInstance, taskid: " + getTaskId());
    }

    public void onBtnSingleInstanceClick(View view) {
        Intent intent = new Intent(this, SingleInstanceActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.d(LOG_TAG, "onNewIntent");
    }

    public void onBtnSingleInstanceBClick(View view) {
        Intent intent = new Intent(this, SingleInstanceBActivity.class);
        startActivity(intent);
    }
}
