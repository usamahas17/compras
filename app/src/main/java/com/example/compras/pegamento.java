package com.example.compras;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public  class pegamento extends RecyclerView.Adapter<pegamento.ViewHolderpegamento> {
    ArrayList <listadecompras>  mercado;


    public pegamento(ArrayList<listadecompras> unalistamas){
        this.mercado = unalistamas;

    }


    @NonNull
    @Override
    public pegamento.ViewHolderpegamento onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View ik = LayoutInflater.from(parent.getContext()).inflate(R.layout.compras,null,false);
        return new ViewHolderpegamento(ik);
    }

    @Override
    public void onBindViewHolder(@NonNull pegamento.ViewHolderpegamento holder, int position) {
        holder.verdura.setText(mercado.get(position).getVerdura());
        holder.carne.setText(mercado.get(position).getCarne());
        holder.abarote.setText(mercado.get(position).getAbarrotes());



    }

    @Override
    public int getItemCount() { return mercado.size();}
    public class ViewHolderpegamento extends RecyclerView.ViewHolder{
        TextView verdura , carne , abarote;

        public ViewHolderpegamento(@NonNull  View item){
            super(item);
            verdura = item.findViewById(R.id.kilosverduras);
            carne = item.findViewById(R.id.kiloscarnes);
            abarote = item.findViewById(R.id.numerodecosas);


        }
    }
}

