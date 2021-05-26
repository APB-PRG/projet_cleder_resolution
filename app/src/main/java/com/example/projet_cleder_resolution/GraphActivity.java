package com.example.projet_cleder_resolution;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
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

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(GraphActivity.this, FinQuestion.class);
                startActivity(i);
                finish();
            }
        }, 2000);


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