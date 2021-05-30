package com.example.projet_cleder_resolution;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class remplir_fiche extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remplir_fiche);
        Button bouton_save = findViewById(R.id.bouton_sauvegarder);

        bouton_save.setOnClickListener(this::redirection);
    }



    public void redirection(View view){
        String unite = ((EditText)findViewById(R.id.edit)).getText().toString();
        if(!unite.isEmpty()) {
            Intent intent = new Intent(this, FinQuestion.class);
            startActivity(intent);
        }
    }
}