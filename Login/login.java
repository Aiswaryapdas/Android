package com.example.loginpage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText usernameEditText, passwordEditText;
    Button loginButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usernameEditText=findViewById(R.id.editTextTextPersonName2);
        passwordEditText=findViewById(R.id.editTextTextPassword);
        loginButton=findViewById(R.id.button1);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = usernameEditText.getText().toString().trim();
                String pass = passwordEditText.getText().toString().trim();

                if (user.equals("aa") && pass.equals("bb")) {
                    Toast.makeText(MainActivity.this, "LOGIN SUCCESSFUL", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "LOGIN FAILED", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
