package com.mahabub.taxcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {
    Button buttonSignup;
    EditText signupName,signupEmail,signupPass,signupConfirm,signupEtin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);

        buttonSignup = findViewById(R.id.buttonSignup);
        signupEmail =findViewById(R.id.signupEmail);
        signupPass = findViewById(R.id.signupPass);
        signupName = findViewById(R.id.signupName);
        signupConfirm = findViewById(R.id.signupConfirm);
        signupEtin = findViewById(R.id.signupEtin);




        buttonSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(signupPass.getText().toString().length()!= 0 || signupEmail.getText().toString().length()!= 0 || signupEtin.getText().toString().length()!= 0 || signupPass.getText().toString().length()!= 0 || signupConfirm.getText().toString().length() != 0){

                    Intent myIntent = new Intent(SignUp.this,LoginForm.class);
                    startActivity(myIntent);

                }else{
                    Toast.makeText(SignUp.this, "Please enter the informations", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
