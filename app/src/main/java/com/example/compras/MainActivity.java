package com.example.compras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText ver ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ver = findViewById(R.id.entrada);
    }
    public void entra (View m){
        String k = "";
        k = ver.getText().toString();
        if(k.equals("usama")) {
            Intent intentar = new Intent(getApplicationContext(), formulario.class);
            startActivity(intentar);



        }


    }
}