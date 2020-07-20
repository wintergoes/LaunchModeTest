package com.zht.car.launchmodetest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class SingleInstanceBActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_instance_b);
    }
}
