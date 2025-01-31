package com.example.secondactivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonSecondActivity = findViewById(R.id.buttonSecondActivity);
        buttonSecondActivity.setOnClickListener(v->{
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
    });

        TextView name, surname, email;
        name = findViewById(R.id.textName);
        surname = findViewById(R.id.TextSurname);
        email = findViewById(R.id.TextEmail);
        String [] dane = getIntent().getStringArrayExtra("dane");
        if(dane!=null) {
            name.setText(dane[0]);
            surname.setText(dane[1]);
            email.setText(dane[2]);
        }
    }
}