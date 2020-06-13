package com.yousufjamil.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        EditText etFirstValue, etsecondvalue;
        TextView tvAnswer;
        Button add, subtract, multiply, divide;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFirstValue = findViewById(R.id.etFirstValue);
        etsecondvalue = findViewById(R.id.etSecondValue);

        tvAnswer = findViewById(R.id.tvAnswer);
        add = findViewById(R.id.btnAdd);
        subtract = findViewById(R.id.btnSubtract);
        multiply = findViewById(R.id.btnMultiply);
        divide = findViewById(R.id.btnDivide);


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                int firstValue, secondValue, ans;

                firstValue = Integer.parseInt(etFirstValue.getText().toString());
                secondValue = Integer.parseInt(etsecondvalue.getText().toString());

                ans = firstValue + secondValue;
                tvAnswer.setText("Answer is = "+ans);

            }
        });


        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                int firstValue, secondValue, ans;

                firstValue = Integer.parseInt(etFirstValue.getText().toString());
                secondValue = Integer.parseInt(etsecondvalue.getText().toString());

                ans = firstValue - secondValue;
                tvAnswer.setText("Answer is = "+ans);

            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                int firstValue, secondValue, ans;

                firstValue = Integer.parseInt(etFirstValue.getText().toString());
                secondValue = Integer.parseInt(etsecondvalue.getText().toString());

                ans = firstValue * secondValue;
                tvAnswer.setText("Answer is = "+ans);

            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                int firstValue, secondValue, ans;

                firstValue = Integer.parseInt(etFirstValue.getText().toString());
                secondValue = Integer.parseInt(etsecondvalue.getText().toString());

                ans = firstValue / secondValue;
                tvAnswer.setText("Answer is = "+ans);

            }
        });

    }
}