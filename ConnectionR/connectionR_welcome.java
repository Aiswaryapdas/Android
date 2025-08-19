package com.example.connectionregister;

import android.os.Bundle;
import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


public class WelcomeActivity extends AppCompatActivity{

    TextView welcomeTextView;
    @Override
    protected void onCreate(Bundle savedInstancesState){
        super.onCreate(savedInstancesState);
        setContentView(R.layout.activity_welcome);

        welcomeTextView = findViewById(R.id.textView2);
        SharedPreferences sharedPref = getSharedPreferences("Aiswarya",Context.MODE_PRIVATE);
        String name = sharedPref.getString("name","user");
        String email = sharedPref.getString("email","No Email");

        welcomeTextView.setText("WELCOME!!!!!\t\t\t\n" + name +"\nEmail : " + email);
    }
}
