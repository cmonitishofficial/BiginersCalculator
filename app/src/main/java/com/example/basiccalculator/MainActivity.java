package com.example.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText firstNumber,secondNumber;
    TextView textView;
    Button add,subsTract,multiply,divide;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstNumber =(EditText) findViewById(R.id.fitstNumber);
        secondNumber =(EditText) findViewById(R.id.secondNumber);
        textView =(TextView) findViewById(R.id.answer);
        add = (Button) findViewById(R.id.btnAdd);
        subsTract =(Button) findViewById(R.id.btnSubstract);
        multiply =(Button) findViewById(R.id.btnMultiply);
        divide =(Button) findViewById(R.id.btnDivide);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstValue,secondValue,answer;
                firstValue = Integer.parseInt(firstNumber.getText().toString());
                secondValue= Integer.parseInt(secondNumber.getText().toString());
                answer = firstValue+secondValue;
                textView.setText("Answer is "+answer);
            }
        });
        subsTract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstValue,secondValue,answer;
                firstValue = Integer.parseInt(firstNumber.getText().toString());
                secondValue= Integer.parseInt(secondNumber.getText().toString());
                answer = firstValue-secondValue;
                textView.setText("Answer is "+answer);
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstValue,secondValue,answer;
                firstValue = Integer.parseInt(firstNumber.getText().toString());
                secondValue= Integer.parseInt(secondNumber.getText().toString());
                answer = firstValue*secondValue;
                textView.setText("Answer is "+answer);
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstValue,secondValue,answer;
                firstValue = Integer.parseInt(firstNumber.getText().toString());
                secondValue= Integer.parseInt(secondNumber.getText().toString());
                answer = firstValue/secondValue;
                textView.setText("Answer is "+answer);
            }
        });
    }
}