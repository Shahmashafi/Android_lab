package com.example.intenttonavigate;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {

    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        t1 = findViewById(R.id.t1);

        String name = getIntent().getStringExtra("name");

        t1.setText("Welcome " + name);
    }
}

