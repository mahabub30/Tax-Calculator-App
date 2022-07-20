package com.mahabub.taxcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout calculator,etin,taxGuidline,spot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etin = findViewById(R.id.etin);
        taxGuidline = findViewById(R.id.taxGuidline);
        calculator = findViewById(R.id.calculator);
        spot = findViewById(R.id.spot);


        etin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this,Etin.class);
                startActivity(myIntent);
            }
        });





        taxGuidline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this,Taxguidline.class);
                startActivity(myIntent);
            }
        });




        spot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this,SpotAssessment.class);
                startActivity(myIntent);
            }
        });






        calculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent(MainActivity.this,TaxCalculator.class);
                startActivity(myIntent);
            }
        });
    }
}
