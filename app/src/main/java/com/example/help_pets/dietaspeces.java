package com.example.help_pets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class dietaspeces extends AppCompatActivity {

    private Button dpe1,dpe2,dpe3,dpe4,dpe5,dpe6,dpe7,dpe8,dpe9;
    private ImageView imagencambiante;
    private TextView dietasperrostxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dietaspeces);

        dpe1= (Button)findViewById(R.id.dpe1);
        dpe2= (Button)findViewById(R.id.dpe2);
        dpe3= (Button)findViewById(R.id.dpe3);
        imagencambiante = (ImageView)findViewById(R.id.imagencambiante);
        dietasperrostxt = (TextView) findViewById(R.id.dietasperrostxt);

        //espinaca
        dpe1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imagencambiante.setImageResource(R.drawable.carnesusar);
                dietasperrostxt.setText("Las espinacas es una de las verduras que por todas sus cualidades y aportes que posee podemos añadir perfectamente a las papillas que elaboramos en casa para los peces de nuestros acuarios. Muy bien lavadas, " +
                        "bien crudas o cocidas, es un buen complemento para la dieta de los peces.");
            }
        });

        //carnes de moluscos
        dpe2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imagencambiante.setImageResource(R.drawable.carnesusar);
                dietasperrostxt.setText("Un molusco que pueden comer los peces es el mejillón" +
                        " que cuenta con de fósforo, zinc y manganeso como beneficios, también contiene una buena cantidad de yodo que favorece el metabolismo.");
            }
        });

        //granulos
        dpe3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imagencambiante.setImageResource(R.drawable.carnesusar);
                dietasperrostxt.setText("Los gránulos y los pellets flotan en el agua y ensucian menos que las escamas. Son los ideales para peces que se alimentan en la zona media del acuario, o los del fondo del acuario, ya que se hunden más rápidamente.\n" +
                        "Los alimentos en gránulos son los ideales para dispensadores automáticos, ya que se obstruyen menos que las escamas.");
            }
        });






    }
}