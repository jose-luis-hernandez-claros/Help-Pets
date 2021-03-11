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


    public void mascotas(View view){
        Intent mascotas = new Intent(this, com.example.help_pets.mascotas.class);
        startActivity(mascotas);

    }
}