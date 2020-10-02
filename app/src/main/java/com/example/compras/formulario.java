package com.example.compras;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;

public class formulario extends AppCompatActivity {
    EditText verdurita;
    EditText carnecita;
    EditText cositas;
    Agro agro ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);
        cositas = findViewById(R.id.abarrote);
        carnecita = findViewById(R.id.carne);
        verdurita = findViewById(R.id.verdura);
        agro = new Agro();


    }
    public void otro(View i) {
        Intent mas = new Intent(getApplicationContext(), reciclar.class);
        mas.putExtra("listadefinitiva",agro);
        startActivity(mas);
    }

    public void guardarlista(View m){
        listadecompras l= new listadecompras(verdurita.getText().toString(),carnecita.getText().toString(),cositas.getText().toString());
        agro.lista.add(l);
        verdurita.setText("");
        carnecita.setText("");
        cositas.setText("");

    }










}