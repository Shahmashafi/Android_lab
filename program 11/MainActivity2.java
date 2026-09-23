package com.example.intenttonavigate;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    TextView t1;
    Button b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        t1 = findViewById(R.id.t1);
        b2 = findViewById(R.id.b2);

        String name = getIntent().getStringExtra("name");
        String age = getIntent().getStringExtra("age");

        t1.setText("Name: " + name + "\nAge: " + age);

        b2.setOnClickListener(v -> {

            Intent i = new Intent(MainActivity2.this, MainActivity3.class);

            i.putExtra("name", name);

            startActivity(i);
        });
    }
}

