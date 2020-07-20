package com.zht.car.launchmodetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SingleTopWithMultiTaskActivityA extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_top_with_multi_task_activity);

        mTvInfo = findViewById(R.id.tvInfo);
    }

    public void onButtonAClick(View view) {
        Intent intent = new Intent(this, SingleTopWithMultiTaskActivityB.class);
        startActivity(intent);
    }

}
