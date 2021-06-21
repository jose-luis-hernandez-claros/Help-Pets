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

        imagencambiante = (ImageView)findViewById(R.id.imagencambiante);
        dietasperrostxt = (TextView) findViewById(R.id.dietasperrostxt);

        //zanahorias
        dh1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imagencambiante.setImageResource(R.drawable.zanahorias);
                dietasperrostxt.setText("Zanahoria. La parte más beneficiosa de este alimento es la hoja, por lo que es ideal proporcionar a nuestro hámster las hojas de las zanahorias lavadas y troceadas de vez en cuando. El fruto en sí," +
                        " solo podremos dárselo sin piel y troceado en cantidades pequeñas para fortalecer sus dientes y mandíbula.");
            }
        });

        //nueces
        dh2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imagencambiante.setImageResource(R.drawable.nueces);
                dietasperrostxt.setText("Evitar la alimentación con demasiadas nueces o semillas a un hámster enano. Las nueces y semillas son alimentos muy grasos y pueden causar una condición conocida como “fuego” en un hámster enano, " +
                        "que puede resultar en la pérdida de pelo. Una o dos semillas cada dos días es probablemente suficiente si tu hámster es un enano.");
            }
        });

        //cebada
        dh3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imagencambiante.setImageResource(R.drawable.cebada);
                dietasperrostxt.setText("Es rica en fósforo, potasio y ácidos grasos insaturados, es decir, grasas saludables. Es una buena fuente de fibra β-glucan," +
                        " la cual se asocia con múltiples beneficios a la salud como reducir el riesgo de enfermedades cardiacas.");
            }
        });

        //espinaca
        dh4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imagencambiante.setImageResource(R.drawable.espinaca);
                dietasperrostxt.setText("Las espinacas son altamente beneficiosas a la hora de regular el tránsito intestinal. Asimismo, son una gran fuente de fibra y cuenta con propiedades antioxidantes y una ausencia de grasas," +
                        " imprescindible para mantener la salud de nuestro hámster en perfectas condiciones.");
            }
        });

        //avellanas
        dh5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imagencambiante.setImageResource(R.drawable.avellanas);
                dietasperrostxt.setText("Son una buena fuente de minerales como calcio, fósforo y magnesio, indispensables para el crecimiento, así como de manganeso.");
            }
        });






    }
}