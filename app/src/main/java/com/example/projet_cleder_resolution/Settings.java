package com.example.projet_cleder_resolution;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        View s = findViewById(R.id.switch1);
        s.setOnClickListener(this::goToFin);
    }
    public void goToFin(View view){
        Intent intent = new Intent(this, FinQuestion.class);
        startActivity(intent);
    }
}