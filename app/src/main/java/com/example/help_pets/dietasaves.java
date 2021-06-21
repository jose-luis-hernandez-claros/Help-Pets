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
        imagencambiante = (ImageView)findViewById(R.id.imagencambiante);
        dietasperrostxt = (TextView) findViewById(R.id.dietasperrostxt);

        //brocoli
        da1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imagencambiante.setImageResource(R.drawable.carnesusar);
                dietasperrostxt.setText("Mejora la digestión y el tránsito intestinal:\n" +
                        "El gran aporte de fibras del brócoli también ayuda a mejorar el tránsito intestinal y" +
                        "actúa como un remedio natural para el estreñimiento, un problema frecuente en las aves domésticas.");
            }
        });

        //zanahorias
        da2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imagencambiante.setImageResource(R.drawable.carnesusar);
                dietasperrostxt.setText("La zanahoria aporta una gran cantidad de vitaminas y minerales entre los cuales se destaca la vitamina A" +
                        "El aporte de la vitamina A previene la aparición de problemas oculares en las aves y el desarrollo de algunas enfermedades.");
            }
        });

        //arvejas
        da3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imagencambiante.setImageResource(R.drawable.carnesusar);
                dietasperrostxt.setText("El grano de la arveja proteica se compone principalmente de almidón y proteínas, los cuales son altamente digeribles." +
                        "La fibra cruda está contenida principalmente en la cubierta de la semilla." +
                        "el grano de arveja es intermedio entre los cereales y la soja");
            }
        });

        //manzana
        da4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imagencambiante.setImageResource(R.drawable.carnesusar);
                dietasperrostxt.setText("Esta fruta les aporta vitaminas, minerales naturales como vitaminas A, B1 y B2, también minerales como calcio, fósforo y magnesio." +
                        " Posee  magníficas propiedades anti-hepática el cual las regula.");
            }
        });







    }
}