package com.zht.car.launchmodetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class BActivity extends AppCompatActivity {
    private Button mButton;
    private String LOG_TAG = "BActivity";

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        String key = "";
        if(getIntent() != null && getIntent().getStringExtra("key") != null){
            key = getIntent().getStringExtra("key");
        }
        mButton.setText("buttonB.newIntent." + key);
        Log.d(LOG_TAG, "onNewIntent." + key);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        mButton = findViewById(R.id.buttonB);
        String key = "";
        if(getIntent() != null && getIntent().getStringExtra("key") != null){
            key = getIntent().getStringExtra("key");
        }

        mButton.setText("buttonB." + key);
    }

    @Override
    protected void onResume() {
        super.onResume();


        Log.d(LOG_TAG, "onResume");
    }

    public void onButtonBClick(View view) {
        Intent intent = new Intent(this, CActivity.class);
        startActivity(intent);
    }
}
