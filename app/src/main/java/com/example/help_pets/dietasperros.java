package com.example.help_pets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class dietasperros extends AppCompatActivity {

    private Button dp1,dp2,dp3,dp4,dp5,dp6,dp7,dp8,dp9;
    private ImageView imagencambiante;
    private TextView dietasperrostxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dietasperros);

        dp1= (Button)findViewById(R.id.dp1);
        dp2= (Button)findViewById(R.id.dp2);
        dp3= (Button)findViewById(R.id.dp3);
        dp4= (Button)findViewById(R.id.dp4);
        dp5= (Button)findViewById(R.id.dp5);
        dp6= (Button)findViewById(R.id.dp6);
        dp7= (Button)findViewById(R.id.dp7);
        dp8= (Button)findViewById(R.id.dp8);
        dp9= (Button)findViewById(R.id.dp9);
        imagencambiante = (ImageView)findViewById(R.id.imagencambiante);
        dietasperrostxt = (TextView) findViewById(R.id.dietasperrostxt);

        dp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imagencambiante.setImageResource(R.drawable.carnesusar);
                dietasperrostxt.setText("Vacuno, Pollo, Cordero, Ciervo o caza, un perro puede con casi todas las carnes de la naturaleza en crudo y " +
                        "debe constituir la gran parte de su dieta. Recomendable entre un 15 y un 20% de grasa en condiciones normales.");
            }
        });

        dp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imagencambiante.setImageResource(R.drawable.carnesusar);
                dietasperrostxt.setText("2Vacuno, Pollo, Cordero, Ciervo o caza, un perro puede con casi todas las carnes de la naturaleza en crudo y " +
                        "debe constituir la gran parte de su dieta. Recomendable entre un 15 y un 20% de grasa en condiciones normales.");
            }
        });

        dp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imagencambiante.setImageResource(R.drawable.carnesusar);
                dietasperrostxt.setText("3Vacuno, Pollo, Cordero, Ciervo o caza, un perro puede con casi todas las carnes de la naturaleza en crudo y " +
                        "debe constituir la gran parte de su dieta. Recomendable entre un 15 y un 20% de grasa en condiciones normales.");
            }
        });

        dp4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imagencambiante.setImageResource(R.drawable.carnesusar);
                dietasperrostxt.setText("4Vacuno, Pollo, Cordero, Ciervo o caza, un perro puede con casi todas las carnes de la naturaleza en crudo y " +
                        "debe constituir la gran parte de su dieta. Recomendable entre un 15 y un 20% de grasa en condiciones normales.");
            }
        });

        dp5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imagencambiante.setImageResource(R.drawable.carnesusar);
                dietasperrostxt.setText("5Vacuno, Pollo, Cordero, Ciervo o caza, un perro puede con casi todas las carnes de la naturaleza en crudo y " +
                        "debe constituir la gran parte de su dieta. Recomendable entre un 15 y un 20% de grasa en condiciones normales.");
            }
        });

        dp6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imagencambiante.setImageResource(R.drawable.carnesusar);
                dietasperrostxt.setText("6Vacuno, Pollo, Cordero, Ciervo o caza, un perro puede con casi todas las carnes de la naturaleza en crudo y " +
                        "debe constituir la gran parte de su dieta. Recomendable entre un 15 y un 20% de grasa en condiciones normales.");
            }
        });

        dp7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imagencambiante.setImageResource(R.drawable.carnesusar);
                dietasperrostxt.setText("7Vacuno, Pollo, Cordero, Ciervo o caza, un perro puede con casi todas las carnes de la naturaleza en crudo y " +
                        "debe constituir la gran parte de su dieta. Recomendable entre un 15 y un 20% de grasa en condiciones normales.");
            }
        });

        dp8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imagencambiante.setImageResource(R.drawable.carnesusar);
                dietasperrostxt.setText("8Vacuno, Pollo, Cordero, Ciervo o caza, un perro puede con casi todas las carnes de la naturaleza en crudo y " +
                        "debe constituir la gran parte de su dieta. Recomendable entre un 15 y un 20% de grasa en condiciones normales.");
            }
        });

        dp9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imagencambiante.setImageResource(R.drawable.carnesusar);
                dietasperrostxt.setText("9Vacuno, Pollo, Cordero, Ciervo o caza, un perro puede con casi todas las carnes de la naturaleza en crudo y " +
                        "debe constituir la gran parte de su dieta. Recomendable entre un 15 y un 20% de grasa en condiciones normales.");
            }
        });


    }

   /* public void carnes(View view){
        dietasperrostxt.setText("Vacuno, Pollo, Cordero, Ciervo o caza, un perro puede con casi todas las carnes de la naturaleza en crudo y " +
                "debe constituir la gran parte de su dieta. Recomendable entre un 15 y un 20% de grasa en condiciones normales.");
    }*/

}