package com.example.registration;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    EditText etName,etEmail,etPassword;
    Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName= findViewById(R.id.etName) ;
        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        btnRegister = findViewById(R.id.btnRegister);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = etName.getText().toString();
                String email= etEmail.getText().toString();
                String password = etPassword.getText().toString();

                SharedPreferences sp = getSharedPreferences("UserData",MODE_PRIVATE);
                SharedPreferences.Editor editor = sp.edit();
                editor.putString("name",name);
                editor.putString("email",email);
                editor.putString("password",password);

               Toast.makeText(MainActivity.this,"Registratin Successful", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this, mainActivity2.class);

                intent.putExtra("username",name);

                startActivity(intent);

            }
        });
    }
}


