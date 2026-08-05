package com.example.simplecalculater;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    TextView results;
    EditText etnum1,etnum2;
    Button addbtn,subbtn,mulbtn,divbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etnum1= findViewById(R.id.num1) ;
        etnum2 = findViewById(R.id.num2);
        addbtn= findViewById(R.id.addbtn);
        subbtn = findViewById(R.id.subbtn);
        mulbtn= findViewById(R.id.mulbtn);
        divbtn = findViewById(R.id.divbtn);
        results = findViewById(R.id.result);
        addbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a= Double.parseDouble(etnum1.getText().toString());
                double b= Double.parseDouble(etnum2.getText().toString());
                double cal = a + b;
                results.setText("Result:" + cal);
            }
        });

        subbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a= Double.parseDouble(etnum1.getText().toString());
                double b= Double.parseDouble(etnum2.getText().toString());
                results.setText("Result:"+(a - b));
            }
        });

        mulbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a= Double.parseDouble(etnum1.getText().toString());
                double b= Double.parseDouble(etnum2.getText().toString());
                results.setText("Result:"+(a * b));
            }
        });

        divbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a= Double.parseDouble(etnum1.getText().toString());
                double b= Double.parseDouble(etnum2.getText().toString());
                results.setText("Result:"+(a/b));
            }
        });

    }
}
