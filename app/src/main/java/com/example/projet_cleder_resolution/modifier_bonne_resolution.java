package com.example.projet_cleder_resolution;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class modifier_bonne_resolution extends AppCompatActivity {
    private AlertDialog.Builder dialogBuilder;
    private AlertDialog dialog;
    private EditText nouvelle_variable, unite;
    private Button save_bttn, cancel_bttn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modifier_bonne_resolution);

        Button button_variable = findViewById(R.id.button_variable);
        button_variable.setOnClickListener(this::popup);
    }

    public void popup(View view){
        createNewcontactDialog();
    }

    //methode de la fenetre popup
    public void createNewcontactDialog(){
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
                //faire la fonction qui "sauvegarde" demande de bdd? ou alors faire juste une redirection vers une page
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