package com.example.projet_cleder_resolution;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Resolution1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resolution1);

        //création d'un bouton (ici bouton modifier)
        ImageView modifier_button = findViewById(R.id.modifier);
        modifier_button.setOnClickListener(this::modifier_res);
    }

    public void modifier_res(View view){
        Intent intent = new Intent(this, modifier_bonne_resolution.class);
        startActivity(intent);
    }
}
