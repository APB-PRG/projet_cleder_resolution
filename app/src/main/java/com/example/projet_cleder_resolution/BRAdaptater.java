package com.example.projet_cleder_resolution;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BRAdaptater extends RecyclerView.Adapter<BRAdaptater.ViewHolder> {


    private ArrayList<Info> infos;





    public BRAdaptater(ArrayList<Info> info){
        this.infos = info;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView variable;

        private final TextView unite;


        public ViewHolder(View view) {
            super(view);
            variable = view.findViewById(R.id.variable);
            unite = view.findViewById(R.id.uniteView);
            }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.mat_br, parent, false);
        ViewHolder vh = new ViewHolder(view);
        return vh;

    }

    @Override
    public void onBindViewHolder(@NonNull BRAdaptater.ViewHolder holder, int position) {

        final String mesure = infos.get(position).getVariable();
        final String unite = infos.get(position).getUnite();
        holder.variable.setText(mesure);
        holder.unite.setText(unite);


    }



    @Override
    public int getItemCount() {
        return infos.size();
    }
}
