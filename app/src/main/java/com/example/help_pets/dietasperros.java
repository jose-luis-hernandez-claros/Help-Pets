package com.example.help_pets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class dietasperros extends AppCompatActivity {

    private Button carne;
    private ImageView imagencambiante;
    private TextView dietasperrostxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dietasperros);

        carne = (Button)findViewById(R.id.carne);
        imagencambiante = (ImageView)findViewById(R.id.imagencambiante);
        dietasperrostxt = (TextView) findViewById(R.id.dietasperrostxt);

        carne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imagencambiante.setImageResource(R.drawable.carnesusar);
                dietasperrostxt.setText("Vacuno, Pollo, Cordero, Ciervo o caza, un perro puede con casi todas las carnes de la naturaleza en crudo y " +
                        "debe constituir la gran parte de su dieta. Recomendable entre un 15 y un 20% de grasa en condiciones normales.");
            }
        });

    }

   /* public void carnes(View view){
        dietasperrostxt.setText("Vacuno, Pollo, Cordero, Ciervo o caza, un perro puede con casi todas las carnes de la naturaleza en crudo y " +
                "debe constituir la gran parte de su dieta. Recomendable entre un 15 y un 20% de grasa en condiciones normales.");
    }*/

}