package com.example.compras;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class reciclar extends AppCompatActivity {
    ArrayList <listadecompras> otralista;
    RecyclerView recicl;
    Bundle datos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reciclar);
        recicl = findViewById(R.id.reciclista);
        recicl.setLayoutManager(new LinearLayoutManager(this));
        otralista = new ArrayList<>();
        pegamento pega = new  pegamento(otralista);
        recicl.setAdapter(pega);
        lascompritas();


    }
    public void lascompritas(){
        datos = getIntent().getExtras();
        Agro a = (Agro)datos.getSerializable("listadefinitiva");
        otralista = a.lista;
    }

}