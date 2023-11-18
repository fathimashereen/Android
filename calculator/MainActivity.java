package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2,e3;
    Button add,sub,mul,div;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.num1);
        e2=findViewById(R.id.num2);
        add=findViewById(R.id.add);
        sub=findViewById(R.id.subtract);
        mul=findViewById(R.id.product);
        div=findViewById(R.id.divide);
        e3=findViewById(R.id.result);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float a=Float.parseFloat(e1.getText().toString());
                float b=Float.parseFloat(e2.getText().toString());
                float c=a+b;
                e3.setText(Float.toString(c));
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float a=Float.parseFloat(e1.getText().toString());
                float b=Float.parseFloat(e2.getText().toString());
                float c=a-b;
                e3.setText(Float.toString(c));
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float a=Float.parseFloat(e1.getText().toString());
                float b=Float.parseFloat(e2.getText().toString());
                float c=a*b;
                e3.setText(Float.toString(c));
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float a=Float.parseFloat(e1.getText().toString());
                float b=Float.parseFloat(e2.getText().toString());
                float c=a/b;
                e3.setText(Float.toString(c));
            }
        });

    }
}
