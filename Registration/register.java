package com.example.registration;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    EditText editext1, editext2, editext3;
    RadioGroup radiogroup;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editext1 = findViewById(R.id.ename);
        editext2 = findViewById(R.id.ephone);
        editext3 = findViewById(R.id.eemail);
        radiogroup = findViewById(R.id.genderRadioGroup);
        btn = findViewById(R.id.Button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = editext1.getText().toString().trim();
                String phone = editext2.getText().toString().trim();
                String email = editext3.getText().toString().trim();

                int SelectedGenderId = radiogroup.getCheckedRadioButtonId();

                if (name.isEmpty() || !name.matches("[a-zA-Z ]+")) {
                    editext1.setError("Enter a valid name (letters only)");
                    editext1.requestFocus();
                    return;
                }

                if (phone.isEmpty() || !phone.matches("\\d{10}")) {
                    editext2.setError("Enter a valid 10-digit phone number");
                    editext2.requestFocus();
                    return;
                }


                if (email.isEmpty() || !Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                    editext3.setError("Valid email is required");
                    return;
                }
                if (SelectedGenderId == -1) {
                    Toast.makeText(MainActivity.this, "Please select gender", Toast.LENGTH_SHORT).show();
                    return;
                }

                Toast.makeText(MainActivity.this, "Registration successful!", Toast.LENGTH_SHORT).show();

            }
        });

    }
}
