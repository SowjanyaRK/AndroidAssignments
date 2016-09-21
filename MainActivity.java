package com.example.dell.calculatorassignment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText et1,et2;
    Button answer,addbtn,subbtn,multbtn,divbtn;
    String num1,num2;
    int number1,number2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=(EditText)findViewById(R.id.editTextnum1);
        et2=(EditText)findViewById(R.id.editTextnum2);
        addbtn=(Button)findViewById(R.id.buttonaddition);
        subbtn=(Button)findViewById(R.id.buttonsubstract);
        multbtn=(Button)findViewById(R.id.buttonmultiply);
        divbtn=(Button)findViewById(R.id.buttondivision);
        answer=(Button)findViewById(R.id.buttonanswer);

        divbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=et1.getText().toString();
                num2=et2.getText().toString();
                number1=Integer.parseInt(num1);
                number2=Integer.parseInt(num2);
                int ans=number1/number2;
                String str=Integer.toString(ans);
                answer.setText(str);
            }
        });
        multbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=et1.getText().toString();
                num2=et2.getText().toString();
                number1=Integer.parseInt(num1);
                number2=Integer.parseInt(num2);
                int ans=number1*number2;
                String str=Integer.toString(ans);
                answer.setText(str);
            }
        });
        subbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=et1.getText().toString();
                num2=et2.getText().toString();
                number1=Integer.parseInt(num1);
                number2=Integer.parseInt(num2);
                int ans=number1-number2;
                String str=Integer.toString(ans);
                answer.setText(str);
            }
        });
        addbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=et1.getText().toString();
                num2=et2.getText().toString();
                number1=Integer.parseInt(num1);
                number2=Integer.parseInt(num2);
                int ans=number1+number2;
                String str=Integer.toString(ans);
                answer.setText(str);
            }
        });

    }
}
