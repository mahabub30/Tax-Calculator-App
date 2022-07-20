package com.mahabub.taxcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TaxCalculator extends AppCompatActivity {
    EditText edBasicpay,edMedical,edBonus,edOthersource,edDeduction;
    Button buttonCal;
    TextView grossResult,taxableResult,taxResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tax_calculator);

        edBasicpay = findViewById(R.id.edBasicpay);
        edMedical = findViewById(R.id.edMedical);
        edBonus = findViewById(R.id.edBonus);
        edOthersource = findViewById(R.id.edOthersource);
        edDeduction = findViewById(R.id.edDeduction);
        buttonCal = findViewById(R.id.buttonCal);
        grossResult = findViewById(R.id.grossResult);
        taxableResult = findViewById(R.id.taxableResult);
        taxResult = findViewById(R.id.taxResult);




                    buttonCal.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {


                            String ss_basic = edBasicpay.getText().toString();
                            String ss_medical = edMedical.getText().toString();
                            String ss_bonus = edBonus.getText().toString();
                            String ss_other = edOthersource.getText().toString();
                            String ss_deduction = edDeduction.getText().toString();

                            if(ss_basic.length()>0 && ss_medical.length()>0 && ss_bonus.length()>0 && ss_other.length()>0 && ss_deduction.length()>0) {

                                float basicpay = Float.parseFloat(ss_basic);
                                float medical = Float.parseFloat(ss_medical);
                                float bonus = Float.parseFloat(ss_bonus);
                                float othersource = Float.parseFloat(ss_other);
                                float deduction = Float.parseFloat(ss_deduction);

                                float grossIncome = basicpay + medical + bonus + othersource;
                                float taxableIncome = grossIncome - deduction;


                                grossResult.setText("" + grossIncome + "  BDT");
                                taxableResult.setText("" + taxableIncome + "  BDT");

                                float tax = 0;


                                if (taxableIncome > 0 && taxableIncome <= 300000) {

                                    tax = 0;
                                } else if (taxableIncome > 300000 && taxableIncome <= 400000) {
                                    tax = (float) ((taxableIncome - 300000) * 0.5);

                                } else if (taxableIncome > 400000 && taxableIncome <= 700000) {
                                    tax = (float) (((400000 - 300000) * 0.5) + ((taxableIncome - 400000) * 0.10));
                                } else if (taxableIncome > 700000 && taxableIncome <= 1100000) {

                                    tax = (float) (((400000 - 300000) * 0.5) + ((700000 - 400000) * 0.1) + ((taxableIncome-700000)*0.15));
                                } else if(taxableIncome > 1100000 && taxableIncome <= 1600000){
                                    tax = (float) (((400000 - 300000) * 0.5) + ((700000 - 400000) * 0.1) + ((1100000 - 700000) * 0.15) + ((taxableIncome-1100000)*0.20));
                                }else{
                                    tax = (float) (((400000 - 300000) * 0.5) + ((700000 - 400000) * 0.1) + ((1100000 - 700000) * 0.15) + ((1600000-1100000)*0.20) + ((taxableIncome-1600000)*0.25));
                                }

                                taxResult.setText("" + tax + " BDT");
                            }

                        }

                    });

    }

}
