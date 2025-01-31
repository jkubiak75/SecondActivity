package com.example.secondactivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        EditText imie = findViewById(R.id.imie);
        EditText nazwisko = findViewById(R.id.nazwisko);
        EditText email = findViewById(R.id.email);


        Button buttonback = findViewById(R.id.buttonBack);
        buttonback.setOnClickListener(v->{
            finish();
        });

        Button Rejestruj = findViewById(R.id.register);
        Rejestruj.setOnClickListener(v->{
            String [] dane = new String[]{imie.getText().toString(),
                    nazwisko.getText().toString(),
                    email.getText().toString()};

            Intent intent = new Intent(SecondActivity.this, MainActivity.class);
            intent.putExtra("dane", dane);
            startActivity(intent);
        });
    };
}