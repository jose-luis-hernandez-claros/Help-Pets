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


        //carne
        dp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imagencambiante.setImageResource(R.drawable.carnesusar);
                dietasperrostxt.setText("Vacuno, Pollo, Cordero, Ciervo o caza, un perro puede con casi todas las carnes de la naturaleza en crudo y " +
                        "debe constituir la gran parte de su dieta. Recomendable entre un 15 y un 20% de grasa en condiciones normales.");
            }
        });

        //algas
        dp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imagencambiante.setImageResource(R.drawable.carnesusar);
                dietasperrostxt.setText("Las algas marinas, como clase de plantas, tienen el espectro más amplio de oligoelementos y vitaminas que de cualquier grupo de plantas en el mundo. " +
                        "Como tales, se prestan a ser una muy buena fuente natural de multivitaminas y minerales.\n" +
                        "La razón por la que contienen esta amplia gama de nutrientes, se debe a su capacidad de absorber minerales directamente del agua, del océano. " +
                        "A diferencia de las plantas terrestres, las algas marinas no tienen sistemas de raíces para absorber minerales.");

            }
        });

        //calamares
        dp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imagencambiante.setImageResource(R.drawable.carnesusar);
                dietasperrostxt.setText("Es recomendable no dar muchos calamares ademas es recomendable" +
                        " añadirlos crudos a su comida. Tienen buena proporción de proteína y son bastante magros. Como máximo, una vez a la semana en sustitución de la carne en su dieta es una buena medida.");
            }
        });

        //espirulina
        dp4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imagencambiante.setImageResource(R.drawable.carnesusar);
                dietasperrostxt.setText("Cuando el sistema inmunitario está estresado o sufre, se nutre de la energía metabólica del propio cuerpo.\n" +
                        "Los perros con un desequilibrio en el sistema inmunitario a menudo presentan fatiga crónica y falta de energía.\n" +
                        "Pequeñas cantidades de Espirulina pueden ayudar a balancear y estabilizarlo, liberando más energía metabólica y produciendo más vitalidad, salud y aprovechamiento de nutrientes.");
            }
        });

        //huevos
        dp5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imagencambiante.setImageResource(R.drawable.carnesusar);
                dietasperrostxt.setText("Fuente de proteína, grasa, vitaminas, incluso calcio y no solo por el presente en la cáscara, también lo está en la yema.");
            }
        });

        //melocoton
        dp6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imagencambiante.setImageResource(R.drawable.carnesusar);
                dietasperrostxt.setText("Los melocotones son una fruta sana y tu perro puede beneficiarse de los altos niveles de fibra y hierro." +
                        "\n" +
                        "Fibra soluble: favorecerá la regulación del tránsito intestinal.\n" +
                        "Hierro: ayudará a prevenir la aparición de anemia.\n" +
                        "Compuesto principalmente por agua: los perros con sobrepeso también pueden comerlo sin que les perjudique.");
            }
        });

        //moras
        dp7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imagencambiante.setImageResource(R.drawable.carnesusar);
                dietasperrostxt.setText("Los frutos rojos como las moras silvestres son “bombitas” de antioxidantes que combaten los radicales libres responsables del proceso de envejecimiento canino.\n" +
                        "Las moras tienen un montón de vitaminas A, C, B6, B12, K, E… También son ricas en potasio, magnesio, calcio, fósforo…\n" +
                        "La fibra está muy presente en cada pequeña mora que disfrutará tu peludo, una fibra alimentaria que le ayudará a mantener en plena forma su aparato digestivo.");
            }
        });

        //pepino
        dp8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imagencambiante.setImageResource(R.drawable.carnesusar);
                dietasperrostxt.setText("El pepino es, sin duda, un vegetal que tiene mucho que aportar a los canes. Para empezar, recomendamos lavar la cascara y trocear el pepino para facilitarle las cosas al compañero peludo.\n" +
                        "Este alimento aporta fibra y agua al animal, además de antioxidantes como la vitamina C y diversas vitaminas más. El potasio también pertenece a la composición de este vegetal que reduce, " +
                        "aparte de la diarrea, la presión arterial del can.8Vacuno, Pollo, Cordero, Ciervo o caza, un perro puede con casi todas las carnes de la naturaleza en crudo y " +
                        "debe constituir la gran parte de su dieta. Recomendable entre un 15 y un 20% de grasa en condiciones normales.");
            }
        });

        //zanahorias
        dp9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imagencambiante.setImageResource(R.drawable.carnesusar);
                dietasperrostxt.setText("Fuente natural de carbohidratos\n" +
                        "Los carbohidratos proporcionan al perro una gran cantidad de energía y, por ende, son esenciales en su alimentación." +
                        " Una dieta pobre en hidratos de carbono se refleja en la salud del animal, desarrollando patologías y trastornos que pueden llegar a ser graves" +
                        "\nRecomendada para tratar la diarrea\n" +
                        "Gracias a la composición de la zanahoria, este alimento ayuda a los pacientes con diarrea a restaurar su flora intestinal y volver a producir heces sólidas. " +
                        "Para ello, se recomienda ofrecer al perro con diarrea zanahoria hervida sola, o mezclada con otros ingredientes con propiedades antidiarreicas como el arroz cocido o la calabaza.");
            }
        });


    }

   /* public void carnes(View view){
        dietasperrostxt.setText("Vacuno, Pollo, Cordero, Ciervo o caza, un perro puede con casi todas las carnes de la naturaleza en crudo y " +
                "debe constituir la gran parte de su dieta. Recomendable entre un 15 y un 20% de grasa en condiciones normales.");
    }*/

}