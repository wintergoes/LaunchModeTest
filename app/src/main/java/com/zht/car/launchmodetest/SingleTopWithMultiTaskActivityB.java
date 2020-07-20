package com.zht.car.launchmodetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SingleTopWithMultiTaskActivityB extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_top_with_multi_task_b);

        mTvInfo = findViewById(R.id.tvInfo);
    }

    public void onButtonBClick(View view) {
        Intent intent = new Intent(this, SingleTopWithMultiTaskActivityC.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}
