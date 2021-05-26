package com.example.projet_cleder_resolution;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FinQuestion extends AppCompatActivity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fin_question);

        mTextView = (TextView) findViewById(R.id.text);

        Button retour = findViewById(R.id.RetourAccueil);
        retour.setOnClickListener(this::goToAccueil);
    }

    public void goToAccueil(View view){
        Intent intent = new Intent(this, accueil.class);
        startActivity(intent);

    }
}