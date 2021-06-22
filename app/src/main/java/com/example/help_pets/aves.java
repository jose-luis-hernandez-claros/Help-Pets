package com.example.help_pets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class aves extends AppCompatActivity {

    private TextView tv1,tv2,tv3,descripcion,sintomas,cuidado,representacion;
    private Button ea1,ea2,ea3,ea4,ea5,ea6,ea7,ea8,ea9;
    private ImageView botonrepresentacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aves);


        ea1 = (Button)findViewById(R.id.ep1);
        ea2 = (Button)findViewById(R.id.ep2);
        ea3 = (Button)findViewById(R.id.ep3);
        ea4 = (Button)findViewById(R.id.ep4);
        ea5 = (Button)findViewById(R.id.ep5);
        ea6 = (Button)findViewById(R.id.ep6);
        ea7 = (Button)findViewById(R.id.ep7);
        ea8 = (Button)findViewById(R.id.ep8);
        ea9 = (Button)findViewById(R.id.ep9);
        tv1 = (TextView)findViewById(R.id.tv1);
        tv2 = (TextView)findViewById(R.id.tv2);
        tv3 = (TextView)findViewById(R.id.tv3);
        descripcion = (TextView)findViewById(R.id.Descripcion);
        sintomas = (TextView)findViewById(R.id.Sintomas);
        cuidado = (TextView)findViewById(R.id.Cuidado);

        //coccidiosis
        ea1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                descripcion.setVisibility(View.VISIBLE);
                sintomas.setVisibility(View.VISIBLE);
                cuidado.setVisibility(View.VISIBLE);

                tv1.setText("La coccidiosis en aves es una enfermedad producida por protozoarios, concretamente coccidias, que se contagian por vía oral-fecal, se reproducen en el interior del ave afectando al tracto gastrointestinal y posteriormente se distribuyen en las heces originando nuevos focos de infección.\n" +
                        "\n" +
                        "Afecta a las aves domésticas y a otras aves como por ejemplo las de granja, en este caso, son más susceptibles los pollos en crecimiento y los adultos jóvenes, los pollitos de menos de tres semanas de vida o los pollos maduros muy rara vez sufren esta enfermedad.");

                tv2.setText("Un ave afectada de coccidiosis mostrará los siguientes síntomas:\n" +
                        "\n" +
                        "Heces sanguinolientas\n" +
                        "Debilidad y somnolencia\n" +
                        "Inflamación de la cloaca\n" +
                        "Zona alrededor de la cloaca manchada de sangre\n" +
                        "Reducción de la talla de la cabeza\n" +
                        "Si sospechamos de coccidiosis debemos acudir a un veterinario con urgencia pues es muy importante confirmar el diagnóstico e iniciar el tratamiento lo antes posible.");

                tv3.setText("La coccidiosis puede resultar mortal para las aves, la muerte se produce por pérdida de electrolitos a causa de la deshidratación. Lamentablemente la coccidiosis únicamente puede tratarse en las primeras etapas de la enfermedad. En el caso de tratarse a tiempo se emplea un anticoccidial (generalmente decoquinato), que inhibe el desarrollo de los protozoos y permite un buen pronóstico de la enfermedad.\n" +
                        "\n" +
                        "Por el carácter contagioso de la coccidiosis parte del tratamiento debe basarse en aislar al ave enferma de las demás aves, de lo contrario, la enfermedad puede extenderse de forma rápida y letal.\n" +
                        "\n" +
                        "Será el veterinario el que te indique cuándo el ave ha superado la coccidiosis y por lo tanto cuándo puede volver a estar en contacto con el resto de aves.");

            }
        });


        //Aspergilosis
        ea2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                descripcion.setVisibility(View.VISIBLE);
                sintomas.setVisibility(View.VISIBLE);
                cuidado.setVisibility(View.VISIBLE);

                tv1.setText("Es un tipo de hongo que se puede contagiar por vía respiratoria o digestiva. Existen varios tipos de aspergilosis y la más común es la que provoca infección en el tracto respiratorio, aunque también puede afectar a los ojos o a los órganos viscerales. El animal tendrá dificultades para respirar, diarrea e incluso convulsione");

                tv2.setText("Dificultad para respirar, pérdida del apetito, mocos, catarro, falta de vitalidad.");

                tv3.setText("No existe cura, así que se debe prevenir con alimento limpio, seco y sin polvo.");

            }
        });


        //Escherichia Coli
        ea3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                descripcion.setVisibility(View.VISIBLE);
                sintomas.setVisibility(View.VISIBLE);
                cuidado.setVisibility(View.VISIBLE);

                tv1.setText("Las infecciones por Escherichia coli están distribuidas ampliamente entre pollos de todas las edades y categorías. Ellas están relacionadas principalmente con condiciones higiénicas pobres, procedimientos tecnológicos mal realizados, o enfermedades respiratorias o inmunosupresoras. Una secuela común de las infecciones del ombligo es la peritonitis local o difusa.");

                tv2.setText("Diarrea");

                tv3.setText("No existe tratamiento lo unico que se puede hacer es mantener la jaula limpia e higiénica y evitar que otros animales puedan acceder a ella.");

            }
        });

        //Salmonelosis
        ea4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                descripcion.setVisibility(View.VISIBLE);
                sintomas.setVisibility(View.VISIBLE);
                cuidado.setVisibility(View.VISIBLE);

                tv1.setText("La salmonelosis en las aves es más un problema de salud pública que de sanidad animal, ya que produce toxiinfecciones en personas que consumen alimentos contaminados por Salmonellas. Su principal manifestación son los síntomas digestivos, como los vómitos y las diarreas");

                tv2.setText("Diarrea, dolor articular, problemas en el sistema nervioso, pérdida de plumas.");

                tv3.setText("Antibióticos y probióticos.");

            }
        });


        //Colibacilosis
        ea5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                descripcion.setVisibility(View.VISIBLE);
                sintomas.setVisibility(View.VISIBLE);
                cuidado.setVisibility(View.VISIBLE);

                tv1.setText("La colibacilosis es una enfermedad causada por la bacteria Escherichia Coli y que se transmite por contacto directo con un ave infectada. Esta enfermedad se considera como la principal causa de muerte en estas aves");

                tv2.setText("Cansancio\n" +
                        "Abatimiento\n" +
                        "Pérdida del apetito\n" +
                        "Síntomas gastrointestinales\n" +
                        "Dolor articular\n" +
                        "Inquietud");

                tv3.setText("Una vez se ha verificado el diagnóstico de la enfermedad se debe aislar al animal enfermo, mantener una exhaustiva higiene de la jaula y cambiar diariamente los comederos y bebederos. El veterinario prescribirá un tratamiento a base de antibióticos destinado a controlar y combatir la infección.");

            }
        });


        //Estrés
        ea6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                descripcion.setVisibility(View.VISIBLE);
                sintomas.setVisibility(View.VISIBLE);
                cuidado.setVisibility(View.VISIBLE);

                tv1.setText("El estrés es un trastorno del estado físico o emocional que también podemos incluir dentro de las enfermedades de los pájaros más habituales.\n" +
                        "Esto puede ser causado por aves que no han nacido en cautiverio y se ven encerradas en una jaula. Falta de estimulación y entretenimiento.");

                tv2.setText("Rascado y picaje excesivo, autolesiones, malestar, nerviosismo.");

                tv3.setText("Aumentar la cantidad de agua es efectivo si nos aseguramos que el ave lo ingiera ya que en situaciones de altas temperaturas el ave no disminuye el consumo de agua.");

            }
        });


        //Anemia
        ea7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                descripcion.setVisibility(View.VISIBLE);
                sintomas.setVisibility(View.VISIBLE);
                cuidado.setVisibility(View.VISIBLE);

                tv1.setText("La anemia infecciosa aviar es una enfermedad que generalmente ser observa en aves jóvenes y que se caracteriza por la presencia de anemia y atrofia generalizada de los tejidos linfoides como el timo y la bolsa de Fabricio, conduciendo a un estado de inmunodepresión en las aves y finalmente la muerte");

                tv2.setText("Pérdida de peso, pérdida del equilibrio, patas y pico pálidos.");

                tv3.setText("Alimento completo de alta calidad, vitaminas, luz natural y aire fresco.");

            }
        });

        //Quistes foliculares
        ea8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                descripcion.setVisibility(View.VISIBLE);
                sintomas.setVisibility(View.VISIBLE);
                cuidado.setVisibility(View.VISIBLE);

                tv1.setText("Protuberancias que suelen aparecer debajo de las alas, aunque pueden salir en cualquier parte del cuerpo. Es común en loros y canarios, aves con plumaje más denso.");

                tv2.setText("Las plumas nuevas se retraen y no salen hacia afuera.");

                tv3.setText("Se extirpan mediante cirugía.");

            }
        });


        //Ornitosis
        ea9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                descripcion.setVisibility(View.VISIBLE);
                sintomas.setVisibility(View.VISIBLE);
                cuidado.setVisibility(View.VISIBLE);

                tv1.setText("La psitacosis es una enfermedad causada normalmente por la bacteria Chlamydiophila Psitacci y que también recibe el nombre de ornitosis, clamidiosis o fiebre del loro. Afecta especialmente a loros y periquitos australianos, aunque también puede afectar a otras aves y al tratarse de una zoonosis puede transmitirse a los seres humanos a través de los animales infectados.\n" +
                        "\n" +
                        "Esta enfermedad merece una especial atención pues es altamente contagiosa, se propaga con gran rapidez y además actúa disminuyendo las defensas del animal, lo que da lugar a que puedan presentarse otras infecciones que enmascaren los síntomas de la psitacosis.");

                tv2.setText("En ocasiones la psitacosis puede llegar a producir la muerte súbita de nuestra mascota, por lo que es importante reconocer los síntomas que pueden ser indicativos de esta enfermedad:\n" +
                        "\n" +
                        "Sinusitis\n" +
                        "Hinchazón alrededor de los ojos\n" +
                        "Conjuntivitis\n" +
                        "Secreciones oculares\n" +
                        "Secreciones nasales\n" +
                        "Estornudos\n" +
                        "Diarrea amarillo-verdosa\n" +
                        "Abatimiento\n" +
                        "Pérdida de pe");

                tv3.setText("El tratamiento de la psitacosis en loros, así como su efectividad y el pronóstico de la enfermedad, podrá variar dependiendo del estado de salud general del ave, de su edad y de la presencia de infecciones secundarias. Siempre será necesario aislar al animal y proceder a administrarle fármacos antibióticos durante un periodo mínimo de 45 días, las vías de administración podrán ser las siguientes:\n" +
                        "\n" +
                        "Administración oral\n" +
                        "Administración inyectable\n" +
                        "Administración a través del pienso\n" +
                        "Una vez finalizado el periodo de tratamiento el veterinario puede sugerir realizar de nuevo mediciones en el laboratorio para verificar la efectividad del tratamiento, igualmente, puede recomendar que las aves que han estado en contacto con el loro infectado realicen también un tratamiento farmacológico.\n" +
                        "\n");

            }
        });


    }
}