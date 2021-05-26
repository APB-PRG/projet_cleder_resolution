package com.example.projet_cleder_resolution;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class remplir_fiche extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remplir_fiche);
        Button bouton_save = findViewById(R.id.bouton_sauvegarder);
        bouton_save.setOnClickListener(this::redirection);
    }

    public void setContentView(int activity_remplir_fiche) {
    }

    public void redirection(View view){
        Intent intent = new Intent(this, FinQuestion.class);
        startActivity(intent);
    }
}