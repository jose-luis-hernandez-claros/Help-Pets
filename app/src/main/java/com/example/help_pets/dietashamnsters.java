package com.example.help_pets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class dietashamnsters extends AppCompatActivity {

    private Button dh1,dh2,dh3,dh4,dh5,dh6,dh7,dh8,dh9;
    private ImageView imagencambiante;
    private TextView dietasperrostxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dietashamnsters);
        dh1= (Button)findViewById(R.id.dh1);
        dh2= (Button)findViewById(R.id.dh2);
        dh3= (Button)findViewById(R.id.dh3);
        dh4= (Button)findViewById(R.id.dh4);
        dh5= (Button)findViewById(R.id.dh5);
        dh6= (Button)findViewById(R.id.dh6);
        dh7= (Button)findViewById(R.id.dh7);
        dh8= (Button)findViewById(R.id.dh8);
        dh9= (Button)findViewById(R.id.dh9);
        imagencambiante = (ImageView)findViewById(R.id.imagencambiante);
        dietasperrostxt = (TextView) findViewById(R.id.dietasperrostxt);

        dh1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imagencambiante.setImageResource(R.drawable.carnesusar);
                dietasperrostxt.setText("Vacuno, Pollo, Cordero, Ciervo o caza, un perro puede con casi todas las carnes de la naturaleza en crudo y " +
                        "debe constituir la gran parte de su dieta. Recomendable entre un 15 y un 20% de grasa en condiciones normales.");
            }
        });

        dh2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imagencambiante.setImageResource(R.drawable.carnesusar);
                dietasperrostxt.setText("2Vacuno, Pollo, Cordero, Ciervo o caza, un perro puede con casi todas las carnes de la naturaleza en crudo y " +
                        "debe constituir la gran parte de su dieta. Recomendable entre un 15 y un 20% de grasa en condiciones normales.");
            }
        });

        dh3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imagencambiante.setImageResource(R.drawable.carnesusar);
                dietasperrostxt.setText("3Vacuno, Pollo, Cordero, Ciervo o caza, un perro puede con casi todas las carnes de la naturaleza en crudo y " +
                        "debe constituir la gran parte de su dieta. Recomendable entre un 15 y un 20% de grasa en condiciones normales.");
            }
        });

        dh4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imagencambiante.setImageResource(R.drawable.carnesusar);
                dietasperrostxt.setText("4Vacuno, Pollo, Cordero, Ciervo o caza, un perro puede con casi todas las carnes de la naturaleza en crudo y " +
                        "debe constituir la gran parte de su dieta. Recomendable entre un 15 y un 20% de grasa en condiciones normales.");
            }
        });

        dh5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imagencambiante.setImageResource(R.drawable.carnesusar);
                dietasperrostxt.setText("5Vacuno, Pollo, Cordero, Ciervo o caza, un perro puede con casi todas las carnes de la naturaleza en crudo y " +
                        "debe constituir la gran parte de su dieta. Recomendable entre un 15 y un 20% de grasa en condiciones normales.");
            }
        });

        dh6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imagencambiante.setImageResource(R.drawable.carnesusar);
                dietasperrostxt.setText("6Vacuno, Pollo, Cordero, Ciervo o caza, un perro puede con casi todas las carnes de la naturaleza en crudo y " +
                        "debe constituir la gran parte de su dieta. Recomendable entre un 15 y un 20% de grasa en condiciones normales.");
            }
        });

        dh7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imagencambiante.setImageResource(R.drawable.carnesusar);
                dietasperrostxt.setText("7Vacuno, Pollo, Cordero, Ciervo o caza, un perro puede con casi todas las carnes de la naturaleza en crudo y " +
                        "debe constituir la gran parte de su dieta. Recomendable entre un 15 y un 20% de grasa en condiciones normales.");
            }
        });

        dh8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imagencambiante.setImageResource(R.drawable.carnesusar);
                dietasperrostxt.setText("8Vacuno, Pollo, Cordero, Ciervo o caza, un perro puede con casi todas las carnes de la naturaleza en crudo y " +
                        "debe constituir la gran parte de su dieta. Recomendable entre un 15 y un 20% de grasa en condiciones normales.");
            }
        });

        dh9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imagencambiante.setImageResource(R.drawable.carnesusar);
                dietasperrostxt.setText("9Vacuno, Pollo, Cordero, Ciervo o caza, un perro puede con casi todas las carnes de la naturaleza en crudo y " +
                        "debe constituir la gran parte de su dieta. Recomendable entre un 15 y un 20% de grasa en condiciones normales.");
            }
        });

    }
}