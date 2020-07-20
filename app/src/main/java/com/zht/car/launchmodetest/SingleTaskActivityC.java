package com.zht.car.launchmodetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SingleTaskActivityC extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_task_c);

        mTvInfo = findViewById(R.id.tvInfo);
    }

    public void onButtonCClick(View view) {
        Intent intent = new Intent(this, SingleTaskActivityD.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}
