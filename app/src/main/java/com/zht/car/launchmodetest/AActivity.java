package com.zht.car.launchmodetest;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;

public class AActivity extends AppCompatActivity {

    public static final int MSG_NEWACTIVITY = 1;
    public static final int MSG_NEW_SINGLE_INST_ACTIVITY = 2;
    private static final String LOG_TAG = "MainActivity";

    private MyHandler myHandler = new MyHandler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
    }

    public void onButton1Click(View view) {
        Intent intent = new Intent(this, BActivity.class);
        intent.putExtra("key", "1");
//        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK );
        startActivity(intent);
//
//        myHandler.sendEmptyMessageDelayed(MSG_NEWACTIVITY, 5000);
    }

    public void onBtnSingleInstanceClick(View view) {
        Intent intent = new Intent(this, SingleInstanceActivity.class);
        startActivity(intent);

        myHandler.sendEmptyMessageDelayed(MSG_NEW_SINGLE_INST_ACTIVITY, 5000);
    }

    class MyHandler extends Handler {

        @Override
        public void handleMessage(@NonNull Message msg) {
            super.handleMessage(msg);
            switch (msg.what){
                case MSG_NEWACTIVITY:
                    Intent intent = new Intent(AActivity.this, BActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    intent.putExtra("key", "2");
                    Log.d(LOG_TAG, "start BActivity in handler");
                    startActivity(intent);
                    break;
                case MSG_NEW_SINGLE_INST_ACTIVITY:
                    Intent intent1 = new Intent(AActivity.this, SingleInstanceActivity.class);
                    startActivity(intent1);
                    break;
            }
        }
    }
}
