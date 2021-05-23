package com.example.projet_cleder_resolution;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class AjoutResolution extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajout_resolution);
        ImageView iv = findViewById(R.id.viewAjoutArretFumer);

        iv.setOnClickListener(this::goToCreationBR);



    }

    public void goToCreationBR(View view){
        Intent intent = new Intent(this, EntrerBR.class);
        startActivity(intent);
    }
}