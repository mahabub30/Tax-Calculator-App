package com.mahabub.taxcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginForm extends AppCompatActivity {

    Button buttonlogin,buttonregister;
    EditText edemail,edpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        buttonlogin = findViewById(R.id.buttonlogin);
        buttonregister = findViewById(R.id.buttonregister);
        edemail = findViewById(R.id.edemail);
        edpassword = findViewById(R.id.edpassword);

        buttonlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(edemail.getText().toString().equals("mahabub333@gmail.com") && edpassword.getText().toString().equals("12345")){
                    Toast.makeText(LoginForm.this, "Login Successfully", Toast.LENGTH_SHORT).show();
                    Intent myIntent = new Intent(LoginForm.this,MainActivity.class);
                    startActivity(myIntent);
                }
                else{
                    edemail.setError("Enter email address");
                    edpassword.setError("Enter password");
                }

            }
        });

        buttonregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(LoginForm.this,SignUp.class);
                startActivity(myIntent);
            }
        });
    }
}

