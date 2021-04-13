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
}