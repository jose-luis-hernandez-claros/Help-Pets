package com.example.help_pets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class mascotas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mascotas);
    }

    public void enfperro(View view){
        Intent perro = new Intent(this,perros.class);
        startActivity(perro);
    }
    public void enfgatos(View view){
        Intent gatos = new Intent(this,gatos.class);
        startActivity(gatos);
    }
    public void enfaves(View view){
        Intent aves = new Intent(this,aves.class);
        startActivity(aves);
    }
    public void enfpeces(View view){
        Intent peces = new Intent(this,peces.class);
        startActivity(peces);
    }
    public void enfhamnsters(View view){
        Intent hamnsters = new Intent(this,hamsters.class);
        startActivity(hamnsters);
    }

}