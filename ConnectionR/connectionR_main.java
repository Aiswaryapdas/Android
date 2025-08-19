package com.example.connectionregister;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.widget.Button;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {
    EditText edittext1,edittext2;
    Button btnregister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edittext1 = findViewById(R.id.ename);
        edittext2 = findViewById(R.id.eemail);
        btnregister = findViewById(R.id.Button);
        btnregister.setOnClickListener( v ->{
            String name = edittext1.getText().toString();
            String email = edittext2.getText().toString();
            SharedPreferences sharedPref = getSharedPreferences("Aiswarya",Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedPref.edit();
            editor.putString("name",name);
            editor.putString("email",email);
            editor.apply();
            Intent intent = new Intent(MainActivity.this,WelcomeActivity.class);
            startActivity(intent);
        });
    }
}
