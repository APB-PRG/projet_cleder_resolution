package com.example.projet_cleder_resolution;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class EntrerBR extends AppCompatActivity {

    private AlertDialog.Builder dialogBuilder;
    private AlertDialog dialog;
    ArrayList<Info> infosBR = new ArrayList<>();
    public BRAdaptater brAdaptater = new BRAdaptater(infosBR);

    ArrayList<Info> infosGain = new ArrayList<>();
    public BRAdaptater gainAdaptater = new BRAdaptater(infosGain);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entrer_b_r);


        RecyclerView recyclerViewVariable = findViewById(R.id.recyclerView_variable);
        recyclerViewVariable.setHasFixedSize(false);
        recyclerViewVariable.setLayoutManager(new LinearLayoutManager(this));


        RecyclerView recyclerViewGain = findViewById(R.id.recyclerView);
        recyclerViewGain.setHasFixedSize(false);
        recyclerViewGain.setLayoutManager(new LinearLayoutManager(this));



        recyclerViewVariable.setAdapter(brAdaptater);
        recyclerViewGain.setAdapter(gainAdaptater);

        ImageView ivVariable = findViewById(R.id.AjoutVariable);
        ivVariable.setOnClickListener(this::popUpAjoutVariable);

        ImageView ivGain = findViewById(R.id.AjoutGain);
        ivGain.setOnClickListener(this::popUpAjoutGain);

    }

    public void popUpAjoutVariable(View view){

        dialogBuilder = new AlertDialog.Builder(this);
        final View popupView = getLayoutInflater().inflate(R.layout.popup_edition, null);

        //active le popup dans une fenetre
        dialogBuilder.setView(popupView);
        dialog = dialogBuilder.create();
        dialog.show();
        Button sauvegarde = (Button) dialog.findViewById(R.id.save);


        sauvegarde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String variable = ((EditText)dialog.findViewById(R.id.nouvelle_variable)).getText().toString();
                String unite = ((EditText)dialog.findViewById(R.id.unite)).getText().toString();
                infosBR.add(new Info(variable, unite));
                brAdaptater.notifyItemInserted(infosBR.size());
                dialog.dismiss();
            }
        });

        Button cancel = (Button) dialog.findViewById(R.id.cancel);

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });

    }

    public void popUpAjoutGain(View view){

        dialogBuilder = new AlertDialog.Builder(this);
        final View popupView = getLayoutInflater().inflate(R.layout.popup_edition, null);

        //active le popup dans une fenetre
        dialogBuilder.setView(popupView);
        dialog = dialogBuilder.create();
        dialog.show();
        Button sauvegarde = (Button) dialog.findViewById(R.id.save);


        sauvegarde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String variable = ((EditText)dialog.findViewById(R.id.nouvelle_variable)).getText().toString();
                String unite = ((EditText)dialog.findViewById(R.id.unite)).getText().toString();
                infosGain.add(new Info(variable, unite));
                gainAdaptater.notifyItemInserted(infosGain.size());
                dialog.dismiss();
            }
        });

        Button cancel = (Button) dialog.findViewById(R.id.cancel);

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });

    }


}