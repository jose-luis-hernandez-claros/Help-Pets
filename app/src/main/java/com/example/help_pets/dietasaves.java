package com.example.help_pets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class dietasaves extends AppCompatActivity {

    private Button da1,da2,da3,da4,da5,da6,da7,da8,da9;
    private ImageView imagencambiante;
    private TextView dietasperrostxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dietasaves);

        da1= (Button)findViewById(R.id.da1);
        da2= (Button)findViewById(R.id.da2);
        da3= (Button)findViewById(R.id.da3);
        da4= (Button)findViewById(R.id.da4);
        da5= (Button)findViewById(R.id.da5);
        da6= (Button)findViewById(R.id.da6);
        da7= (Button)findViewById(R.id.da7);
        da8= (Button)findViewById(R.id.da8);
        da9= (Button)findViewById(R.id.da9);
        imagencambiante = (ImageView)findViewById(R.id.imagencambiante);
        dietasperrostxt = (TextView) findViewById(R.id.dietasperrostxt);

        da1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imagencambiante.setImageResource(R.drawable.carnesusar);
                dietasperrostxt.setText("Vacuno, Pollo, Cordero, Ciervo o caza, un perro puede con casi todas las carnes de la naturaleza en crudo y " +
                        "debe constituir la gran parte de su dieta. Recomendable entre un 15 y un 20% de grasa en condiciones normales.");
            }
        });

        da2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imagencambiante.setImageResource(R.drawable.carnesusar);
                dietasperrostxt.setText("2Vacuno, Pollo, Cordero, Ciervo o caza, un perro puede con casi todas las carnes de la naturaleza en crudo y " +
                        "debe constituir la gran parte de su dieta. Recomendable entre un 15 y un 20% de grasa en condiciones normales.");
            }
        });

        da3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imagencambiante.setImageResource(R.drawable.carnesusar);
                dietasperrostxt.setText("3Vacuno, Pollo, Cordero, Ciervo o caza, un perro puede con casi todas las carnes de la naturaleza en crudo y " +
                        "debe constituir la gran parte de su dieta. Recomendable entre un 15 y un 20% de grasa en condiciones normales.");
            }
        });

        da4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imagencambiante.setImageResource(R.drawable.carnesusar);
                dietasperrostxt.setText("4Vacuno, Pollo, Cordero, Ciervo o caza, un perro puede con casi todas las carnes de la naturaleza en crudo y " +
                        "debe constituir la gran parte de su dieta. Recomendable entre un 15 y un 20% de grasa en condiciones normales.");
            }
        });

        da5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imagencambiante.setImageResource(R.drawable.carnesusar);
                dietasperrostxt.setText("5Vacuno, Pollo, Cordero, Ciervo o caza, un perro puede con casi todas las carnes de la naturaleza en crudo y " +
                        "debe constituir la gran parte de su dieta. Recomendable entre un 15 y un 20% de grasa en condiciones normales.");
            }
        });

        da6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imagencambiante.setImageResource(R.drawable.carnesusar);
                dietasperrostxt.setText("6Vacuno, Pollo, Cordero, Ciervo o caza, un perro puede con casi todas las carnes de la naturaleza en crudo y " +
                        "debe constituir la gran parte de su dieta. Recomendable entre un 15 y un 20% de grasa en condiciones normales.");
            }
        });

        da7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imagencambiante.setImageResource(R.drawable.carnesusar);
                dietasperrostxt.setText("7Vacuno, Pollo, Cordero, Ciervo o caza, un perro puede con casi todas las carnes de la naturaleza en crudo y " +
                        "debe constituir la gran parte de su dieta. Recomendable entre un 15 y un 20% de grasa en condiciones normales.");
            }
        });

        da8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imagencambiante.setImageResource(R.drawable.carnesusar);
                dietasperrostxt.setText("8Vacuno, Pollo, Cordero, Ciervo o caza, un perro puede con casi todas las carnes de la naturaleza en crudo y " +
                        "debe constituir la gran parte de su dieta. Recomendable entre un 15 y un 20% de grasa en condiciones normales.");
            }
        });

        da9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imagencambiante.setImageResource(R.drawable.carnesusar);
                dietasperrostxt.setText("9Vacuno, Pollo, Cordero, Ciervo o caza, un perro puede con casi todas las carnes de la naturaleza en crudo y " +
                        "debe constituir la gran parte de su dieta. Recomendable entre un 15 y un 20% de grasa en condiciones normales.");
            }
        });
    }
}