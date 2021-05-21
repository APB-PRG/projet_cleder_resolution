package com.example.projet_cleder_resolution;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class GraphActivity extends AppCompatActivity {

    private TextView mTextView;
    private AlertDialog.Builder dialogBuilder;
    private AlertDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.graph);

        ImageView iv = findViewById(R.id.viewArretFumer);
        iv.setOnClickListener(this::goToArretFumer);


    }

    public void goToArretFumer(View view){

        createNewcontactDialog();

    }
    public void createNewcontactDialog(){
        dialogBuilder = new AlertDialog.Builder(this);
        final View contactPopupView = getLayoutInflater().inflate(R.layout.popup_graph, null);

        //active le popup dans une fenetre
        dialogBuilder.setView(contactPopupView);
        dialog = dialogBuilder.create();
        dialog.show();


    }
}