package com.zht.car.launchmodetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class BaseActivity extends AppCompatActivity {
    protected TextView mTvInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
    }

    @Override
    protected void onResume() {
        super.onResume();

        showInfo();;
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        showInfo();
    }

    private void showInfo(){
        if(mTvInfo != null){
            String info = "Name: " + this.getClass().getSimpleName() + "\r\n";
            info += "TaskId: " + getTaskId() + "\r\n";
            info += "Method: " + Thread.currentThread().getStackTrace()[3].getMethodName();
            mTvInfo.setText(info);
        }
    }
}
