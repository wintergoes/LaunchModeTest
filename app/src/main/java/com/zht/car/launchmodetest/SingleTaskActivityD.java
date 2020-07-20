package com.zht.car.launchmodetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SingleTaskActivityD extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_d);

        mTvInfo = findViewById(R.id.tvInfo);
    }

    public void onButtonDClick(View view) {
        Intent intent = new Intent(this, SingleTaskActivityB.class);
//        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK );
        startActivity(intent);
    }
}
