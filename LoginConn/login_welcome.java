package com.example.connectionlogin;

import android.os.Bundle;
import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


public class Activity_welcome extends AppCompatActivity{

    TextView welcomeTextView;
    @Override
    protected void onCreate(Bundle savedInstancesState){
        super.onCreate(savedInstancesState);
        setContentView(R.layout.activity_welcome);

        welcomeTextView = findViewById(R.id.textView);
        SharedPreferences sharedPref = getSharedPreferences("Aiswarya",Context.MODE_PRIVATE);
        String name = sharedPref.getString("name","user");

        welcomeTextView.setText("WELCOME!!!!!\t\t\t\n" + name);
    }
}

