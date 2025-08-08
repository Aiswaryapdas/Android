package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText1, editText2;
    TextView editText3;
    Button bT1,bT2,bT3,bT4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.Number1);
        editText2 = findViewById(R.id.Number2);
        editText3 = findViewById(R.id.Number3);
        bT1 = findViewById(R.id.button);
        bT2 = findViewById(R.id.button2);
        bT3 = findViewById(R.id.button3);
        bT4 = findViewById(R.id.button4);

        bT1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(editText1.getText().toString());
                double num2 = Double.parseDouble(editText2.getText().toString());
                double result = num1 + num2;
                editText3.setText(String.valueOf(result));
            }
        });
        bT2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(editText1.getText().toString());
                double num2 = Double.parseDouble(editText2.getText().toString());
                double result = num1 - num2;
                editText3.setText(String.valueOf(result));
            }
        });
        bT3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(editText1.getText().toString());
                double num2 = Double.parseDouble(editText2.getText().toString());
                double result = num1 * num2;
                editText3.setText(String.valueOf(result));
            }
        });
        bT4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(editText1.getText().toString());
                double num2 = Double.parseDouble(editText2.getText().toString());
                double result = num1 / num2;
                editText3.setText(String.valueOf(result));
            }
        });
    }
}
