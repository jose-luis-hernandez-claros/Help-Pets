package com.example.help_pets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    //intent para abrir pestaña mascotas
    public void mascotas(View view){
        Intent mascotas = new Intent(this, com.example.help_pets.mascotas.class);
        startActivity(mascotas);
    }

    //Intent para abrir pestaña maps
    public void maps(View view){
        Intent maps = new Intent(this, ubicacionveterinarias.class);
        startActivity(maps);
    }

    //intent para abrir pestaña dietas recomendadas
    public void dietas(View view){
        Intent dietas = new Intent(this, com.example.help_pets.dietas.class);
        startActivity(dietas);
    }

    //intent para abrir pestaña registro mascotas
    public  void registromascotas(View view){
        Intent registro = new Intent(this,com.example.help_pets.registromascotas.class);
        startActivity(registro);
    }

    //intent para abrir pestaña registro de vacunas
    public void registrovacunas(View view){
        Intent rvacunas = new Intent(this,com.example.help_pets.vacunas.class);
        startActivity(rvacunas);
    }

}