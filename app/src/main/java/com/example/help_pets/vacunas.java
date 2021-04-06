package com.example.help_pets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class vacunas extends AppCompatActivity {

    private Spinner tipomascota;
    private Spinner sexomascota;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vacunas);

        tipomascota = (Spinner)findViewById(R.id.spinnertipomascota2);
        sexomascota = (Spinner)findViewById(R.id.spinnersexomascota2);


        //Tipo de mascota

        String [] mascotas = {"Perro","Gato","Ave","Pez","Hamnster"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, mascotas);
        tipomascota.setAdapter(adapter);


        //sexo de la mascota
        String [] sexomascota1 = {"Macho","Hembra"};
        ArrayAdapter <String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, sexomascota1);
        sexomascota.setAdapter(adapter2);
    }
}