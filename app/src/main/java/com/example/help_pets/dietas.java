package com.example.help_pets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class dietas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dietas);
    }

    //abrir pestaña dietas de perros
    public void dietaperros(View view){
        Intent dietaperros = new Intent(this, com.example.help_pets.dietasperros.class);
        startActivity(dietaperros);
    }
    /*//abrir pestaña dietas de gatos
    public void dietagatos(View view){
        Intent dietagatos = new Intent(this, com.example.help_pets.dietagatos.class);
        startActivity(dietagatos);
    }
    //abrir pestaña dietas de aves
    public void dietaaves(View view){
        Intent dietaaves = new Intent(this, com.example.help_pets.dietaaves.class);
        startActivity(dietaaves);
    }
    //abrir pestaña dietas de peces
    public void dietapeces(View view){
        Intent dietapeces = new Intent(this, com.example.help_pets.dietapecess.class);
        startActivity(dietapeces);
    }
    //abrir pestaña dietas de hamnsters
    public void dietahamnsters(View view){
        Intent dietahamnsters = new Intent(this, com.example.help_pets.dietahamnsters.class);
        startActivity(dietahamnsters);
    }*/
}