package com.example.help_pets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class perros extends AppCompatActivity {

    private Button ver1,ver2;
    private EditText nover,nover2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perros);

        ver1 = (Button)findViewById(R.id.botonver);
        ver2 = (Button)findViewById(R.id.botonver2);
        //nover = (EditText) findViewById(R.id.botonnover);
        //nover2 = (EditText) findViewById(R.id.botonnover2);
    }


    public void visible1(View view){
        nover.setVisibility(View.VISIBLE);
        nover2.setVisibility(View.INVISIBLE);
    }
    public void visible2(View view){
        nover.setVisibility(View.INVISIBLE);
        nover2.setVisibility(View.VISIBLE);
    }


}