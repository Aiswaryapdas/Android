package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "LifecycleDemo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: Activity Created");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: Activity Started");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: Activity Resumed");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: Activity Paused");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: Activity Stopped");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: Activity Restarted");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: Activity Destroyed");
    }
}
