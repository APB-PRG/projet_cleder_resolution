package com.example.projet_cleder_resolution;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class accueil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.accueil);

        ImageView iv = findViewById(R.id.settingsButton);
        iv.setOnClickListener(this::goToSettings);

        ImageView iv_arbre1 = findViewById(R.id.ic_arbre_br1);
        iv_arbre1.setOnClickListener(this::goToBR_1);

        ImageView graph = findViewById(R.id.graph);
        graph.setOnClickListener(this::goToGraph);

        ImageView ajout = findViewById(R.id.ajout);
        ajout.setOnClickListener(this::goToAjout);
    }

    public void goToSettings(View view){
        Intent intent = new Intent(this, Settings.class);
        startActivity(intent);
    }

    public void goToBR_1(View view){
        Intent intent = new Intent(this, Resolution1.class);

        startActivity(intent);
    }

    public void goToGraph(View view){
        Intent intent = new Intent(this, GraphActivity.class);
        startActivity(intent);

    }

    public void goToAjout(View view){
        Intent intent = new Intent(this, AjoutResolution.class );
        startActivity(intent);
    }


}