package com.example.simplecalculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    EditText n1,n2;

    Button sum,sub,mul,div;

    TextView reslt;

    @SuppressLint("MissingInflatedId")


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1=(EditText) findViewById(R.id.editTextText3);

        n2=(EditText)findViewById(R.id.editTextText5);

        div = findViewById(R.id.button8);

        sum = findViewById(R.id.button9);

        sub = findViewById(R.id.button10);

        mul = findViewById(R.id.button12);

        reslt = findViewById(R.id.textView4);

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int f1 = Integer.parseInt(n1.getText().toString());

                int f2 = Integer.parseInt(n2.getText().toString());

                int cal =f1+f2;

                reslt.setText("Addition = "+cal);

            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int f1 = Integer.parseInt(n1.getText().toString());

                int f2 = Integer.parseInt(n1.getText().toString());

                int cal = f1 - f2;

                reslt.setText("Subtraction = " + cal);

            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int f1 = Integer.parseInt(n1.getText().toString());

                int f2 = Integer.parseInt(n1.getText().toString());

                int cal =f1 * f2;

                reslt.setText("Multiplication = "+cal);

            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int f1 = Integer.parseInt(n1.getText().toString());

                int f2 = Integer.parseInt(n1.getText().toString());

                int cal =f1 / f2;

                reslt.setText("Division = "+cal);

            }
        });
    }
}
