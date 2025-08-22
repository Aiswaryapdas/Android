package com.example.connectionlogin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.widget.Button;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {
    EditText username,password;
    Button loginbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = findViewById(R.id.editTextTextPersonName2);
        password = findViewById(R.id.editTextTextPassword);
        loginbtn = findViewById(R.id.button1);
        loginbtn.setOnClickListener( v ->{
            String uname = username.getText().toString();
            String pass = password.getText().toString();
            SharedPreferences sharedPref = getSharedPreferences("Aiswarya",Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedPref.edit();
            editor.putString("name",uname);
            editor.putString("email",pass);
            editor.apply();
            Intent intent = new Intent(MainActivity.this,Activity_welcome.class);
            startActivity(intent);
        });
    }
}
