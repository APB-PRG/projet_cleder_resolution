package com.example.projet_cleder_resolution;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class modifier_bonne_resolution extends AppCompatActivity {
    private AlertDialog.Builder dialogBuilder;
    private AlertDialog dialog;
    private EditText nouvelle_variable, unite;
    private Button save_bttn, cancel_bttn;



    ArrayList<Info> infosBR = new ArrayList<>();

    public BRAdaptater brAdaptater = new BRAdaptater(infosBR);

    ArrayList<Info> infosGain = new ArrayList<>();
    public BRAdaptater gainAdaptater = new BRAdaptater(infosGain);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modifier_bonne_resolution);

        Button button_variable = findViewById(R.id.button_variable);
        button_variable.setOnClickListener(this::popupV);

        Button buttonGain = findViewById(R.id.buttonGain);
        buttonGain.setOnClickListener(this::popupG);

        infosBR.add(new Info("Consommation", "Cigarette/semaine"));
        brAdaptater.notifyItemInserted(0);

        infosGain.add(new Info("Economie", "Euros"));
        gainAdaptater.notifyItemInserted(0);
        RecyclerView recyclerViewVariable = findViewById(R.id.recyclerView_variable);
        recyclerViewVariable.setHasFixedSize(false);
        recyclerViewVariable.setLayoutManager(new LinearLayoutManager(this));


        RecyclerView recyclerViewGain = findViewById(R.id.recyclerView);
        recyclerViewGain.setHasFixedSize(false);
        recyclerViewGain.setLayoutManager(new LinearLayoutManager(this));

        recyclerViewVariable.setAdapter(brAdaptater);
        recyclerViewGain.setAdapter(gainAdaptater);
    }


    public void popupV(View view){
        createNewcontactDialogV();
    }

    //methode de la fenetre popup
    public void createNewcontactDialogV(){
        dialogBuilder = new AlertDialog.Builder(this);
        final View contactPopupView = getLayoutInflater().inflate(R.layout.popup_edition, null);

        //define les variables de la popup
        nouvelle_variable = (EditText) contactPopupView.findViewById(R.id.nouvelle_variable);
        unite = (EditText) contactPopupView.findViewById(R.id.unite);
        save_bttn = (Button) contactPopupView.findViewById(R.id.save);
        cancel_bttn = (Button) contactPopupView.findViewById(R.id.cancel);

        //active le popup dans une fenetre
        dialogBuilder.setView(contactPopupView);
        dialog = dialogBuilder.create();
        dialog.show();

        //ici permet de faire le lien avec les fonctionnalités des boutons
        save_bttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String variable = ((EditText)dialog.findViewById(R.id.nouvelle_variable)).getText().toString();
                String unite = ((EditText)dialog.findViewById(R.id.unite)).getText().toString();
                infosBR.add(new Info(variable, unite));
                brAdaptater.notifyItemInserted(infosGain.size());
                dialog.dismiss();
            }
        });

        cancel_bttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });
    }

    public void popupG(View view){
        createNewcontactDialogG();
    }
    public void createNewcontactDialogG(){
        dialogBuilder = new AlertDialog.Builder(this);
        final View contactPopupView = getLayoutInflater().inflate(R.layout.popup_edition, null);

        //define les variables de la popup
        nouvelle_variable = (EditText) contactPopupView.findViewById(R.id.nouvelle_variable);
        unite = (EditText) contactPopupView.findViewById(R.id.unite);
        save_bttn = (Button) contactPopupView.findViewById(R.id.save);
        cancel_bttn = (Button) contactPopupView.findViewById(R.id.cancel);

        //active le popup dans une fenetre
        dialogBuilder.setView(contactPopupView);
        dialog = dialogBuilder.create();
        dialog.show();

        //ici permet de faire le lien avec les fonctionnalités des boutons
        save_bttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String variable = ((EditText)dialog.findViewById(R.id.nouvelle_variable)).getText().toString();
                String unite = ((EditText)dialog.findViewById(R.id.unite)).getText().toString();
                if (!variable.isEmpty()&&! unite.isEmpty()) {
                    infosGain.add(new Info(variable, unite));
                    gainAdaptater.notifyItemInserted(infosGain.size());
                }
                dialog.dismiss();
            }
        });

        cancel_bttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });
    }
}