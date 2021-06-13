package com.example.help_pets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class alertaayuda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alertaayuda);
    }

    public void Whatsapp(View view){
        Intent what = new Intent(this, com.example.help_pets.Whatsapp.class);
        startActivity(what);
    }

    public void Messenger(View view){
        Intent Mess = new Intent(this, com.example.help_pets.Gmail.class);
        startActivity(Mess);
    }

}