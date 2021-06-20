package com.example.help_pets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class dietasgatos extends AppCompatActivity {

    private Button dg1,dg2,dg3,dg4,dg5,dg6,dg7,dg8,dg9;
    private ImageView imagencambiante;
    private TextView dietasperrostxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dietasgatos);

        dg1= (Button)findViewById(R.id.dg1);
        dg2= (Button)findViewById(R.id.dg2);
        dg3= (Button)findViewById(R.id.dg3);
        dg4= (Button)findViewById(R.id.dg4);
        dg5= (Button)findViewById(R.id.dg5);
        dg6= (Button)findViewById(R.id.dg6);
        dg7= (Button)findViewById(R.id.dg7);
        imagencambiante = (ImageView)findViewById(R.id.imagencambiante);
        dietasperrostxt = (TextView) findViewById(R.id.dietasperrostxt);


        //SALMON
        dg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imagencambiante.setImageResource(R.drawable.carnesusar);
                dietasperrostxt.setText("El salmón es una buena fuente de Omega 3 y otros ácidos grasos que favorecen la salud de los gatos." +
                        " Por eso muchos comestibles para felinos están hechos de salmón, ya que proporciona muchos de los suplementos ideales para los gatos.");
            }
        });


        //ACEITES DE PESCADO
        dg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imagencambiante.setImageResource(R.drawable.carnesusar);
                dietasperrostxt.setText("El aceite de salmón y el de bacalao, tienen la virtud de mantener el pelaje de estas mascotas nutrido y humectado, " +
                        "sobre todo en el invierno. Puede conseguirse en estado líquido o en pastillas en tiendas naturistas.");
            }
        });


        //HUEVOS COCIDOS
        dg3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imagencambiante.setImageResource(R.drawable.carnesusar);
                dietasperrostxt.setText("Los huevos aportan proteínas y vitamina B, además de que tienen un delicioso sabor que los felinos adoran. Para prevenir enfermedades, " +
                        "deben estar perfectamente cocinados, para que no haya riesgo para ellos ni para los humanos que manipulen sus alimentos.");
            }
        });


        //QUESO
        dg4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imagencambiante.setImageResource(R.drawable.carnesusar);
                dietasperrostxt.setText("Si un gato demuestra interés en el queso lo mejor es que ingiera las variedades duras como el cheddar," +
                        " el suizo o el gouda. Todas son excelentes fuentes de calcio y proteínas.");
            }
        });


        //POLLO
        dg5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imagencambiante.setImageResource(R.drawable.carnesusar);
                dietasperrostxt.setText("Los gatos son carnívoros y deben consumir dietas que contengan carne. El pollo es entonces una opción saludable para los gatos, ya que tiene proteínas magras de gran calidad." +
                        " Solo hay que procurar que lo coman cocido y sin la grasa de su piel, la que es preferible remover.");
            }
        });


        //PAVO
        dg6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imagencambiante.setImageResource(R.drawable.carnesusar);
                dietasperrostxt.setText("Esta es otra fuente de buenas proteínas en la alimentación de un gato. Aunque la introducción repentina de este alimento que tiene vitamina B16," +
                        " puede causarle algunas molestias como la diarrea. Por eso, lo mejor es dárselo como parte de otros alimentos, en pequeñas cantidades, hasta que se acostumbre a esta comida.");
            }
        });


        //VEGETALES VARIADOS
        dg7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imagencambiante.setImageResource(R.drawable.carnesusar);
                dietasperrostxt.setText("Los gatos son carnívoros, pero eso no evita la posibilidad de incorporar algunos nutrientes a través de algunos vegetales como chícharos, " +
                        "zapallos, acelga y manzanas. " +
                        "También puede suministrárseles arándanos, bananas y melones. Son alimentos saludables para gatos");
            }
        });


    }
}