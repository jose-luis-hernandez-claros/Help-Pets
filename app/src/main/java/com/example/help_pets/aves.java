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


        ea1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                descripcion.setVisibility(View.VISIBLE);
                sintomas.setVisibility(View.VISIBLE);
                cuidado.setVisibility(View.VISIBLE);

                tv1.setText("Es una enfermedad infecciosa, de tipo vírica, grave y potencialmente letal." +
                        "ante cualquier sospecha de tener esta enfermedad es imprescindible acudir de forma inmediata al centro veterinario mas cercano." +
                        "Algunas razas de perro como el Rottweiler son mas propensos a contraer esta enfermedad.\n" +
                        "El Parvovirus se contagia mediante contacto oral/nasal directo de un perro infectado a otro perro," +
                        " a través de las heces de perros infectados con el canino\n" +
                        "Es considerado un virus muy contagioso y tiene un periodo de incubación corto (entre cinco y diez días)");

                tv2.setText("Esta enfermedad por lo general ataca al tejido linfatico e intastinal. Los principales sintomas que produce esta enfermedad son:\n" +
                        "Diarrea (que suele ir acompañada de hemorragia)\n" +
                        "Vómitos\n" +
                        "Fiebre\n" +
                        "Falta de apetito y decaimiento.\n" +
                        "Apatía y/o letargo.\n" +
                        "Depresión\n" +
                        "Pérdida de peso.\n" +
                        "Dolor a la palpación de abdomen.\n" +
                        "En casos más graves, deshidratación (más o menos severa, ya que el virus afecta al tracto intestinal) y muerte del paciente.");

                tv3.setText("No existe un tratamiento 100% efectivo del parviovirus, sin embargo, existen pasos a seguir para poder combatirla y tener mejor resultados o en su caso, " +
                        "eliminar totalmente el virus.\n" +
                        "\n" +
                        "Rehidratación. Normalmente se recomienda una administración de suero por vía intravenosa.\n" +
                        "Transfusiones de sangre. Esto por la perdida de sangre debido a las diarreas. Una vez estabilizado, se prosigue con cuidados y monitoreo.\n" +
                        "Antibióticos.\n" +
                        "Recuerda que los tratamientos deben ser administrados por un veterinario profesional de cabecera o de confianza.");

            }
        });

        ea2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                descripcion.setVisibility(View.VISIBLE);
                sintomas.setVisibility(View.VISIBLE);
                cuidado.setVisibility(View.VISIBLE);

                tv1.setText("2Es una enfermedad infecciosa, de tipo vírica, grave y potencialmente letal." +
                        "ante cualquier sospecha de tener esta enfermedad es imprescindible acudir de forma inmediata al centro veterinario mas cercano." +
                        "Algunas razas de perro como el Rottweiler son mas propensos a contraer esta enfermedad.\n" +
                        "El Parvovirus se contagia mediante contacto oral/nasal directo de un perro infectado a otro perro," +
                        " a través de las heces de perros infectados con el canino\n" +
                        "Es considerado un virus muy contagioso y tiene un periodo de incubación corto (entre cinco y diez días)");

                tv2.setText("2Esta enfermedad por lo general ataca al tejido linfatico e intastinal. Los principales sintomas que produce esta enfermedad son:\n" +
                        "Diarrea (que suele ir acompañada de hemorragia)\n" +
                        "Vómitos\n" +
                        "Fiebre\n" +
                        "Falta de apetito y decaimiento.\n" +
                        "Apatía y/o letargo.\n" +
                        "Depresión\n" +
                        "Pérdida de peso.\n" +
                        "Dolor a la palpación de abdomen.\n" +
                        "En casos más graves, deshidratación (más o menos severa, ya que el virus afecta al tracto intestinal) y muerte del paciente.");

                tv3.setText("2No existe un tratamiento 100% efectivo del parviovirus, sin embargo, existen pasos a seguir para poder combatirla y tener mejor resultados o en su caso, " +
                        "eliminar totalmente el virus.\n" +
                        "\n" +
                        "Rehidratación. Normalmente se recomienda una administración de suero por vía intravenosa.\n" +
                        "Transfusiones de sangre. Esto por la perdida de sangre debido a las diarreas. Una vez estabilizado, se prosigue con cuidados y monitoreo.\n" +
                        "Antibióticos.\n" +
                        "Recuerda que los tratamientos deben ser administrados por un veterinario profesional de cabecera o de confianza.");

            }
        });

        ea3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                descripcion.setVisibility(View.VISIBLE);
                sintomas.setVisibility(View.VISIBLE);
                cuidado.setVisibility(View.VISIBLE);

                tv1.setText("3Es una enfermedad infecciosa, de tipo vírica, grave y potencialmente letal." +
                        "ante cualquier sospecha de tener esta enfermedad es imprescindible acudir de forma inmediata al centro veterinario mas cercano." +
                        "Algunas razas de perro como el Rottweiler son mas propensos a contraer esta enfermedad.\n" +
                        "El Parvovirus se contagia mediante contacto oral/nasal directo de un perro infectado a otro perro," +
                        " a través de las heces de perros infectados con el canino\n" +
                        "Es considerado un virus muy contagioso y tiene un periodo de incubación corto (entre cinco y diez días)");

                tv2.setText("3Esta enfermedad por lo general ataca al tejido linfatico e intastinal. Los principales sintomas que produce esta enfermedad son:\n" +
                        "Diarrea (que suele ir acompañada de hemorragia)\n" +
                        "Vómitos\n" +
                        "Fiebre\n" +
                        "Falta de apetito y decaimiento.\n" +
                        "Apatía y/o letargo.\n" +
                        "Depresión\n" +
                        "Pérdida de peso.\n" +
                        "Dolor a la palpación de abdomen.\n" +
                        "En casos más graves, deshidratación (más o menos severa, ya que el virus afecta al tracto intestinal) y muerte del paciente.");

                tv3.setText("3No existe un tratamiento 100% efectivo del parviovirus, sin embargo, existen pasos a seguir para poder combatirla y tener mejor resultados o en su caso, " +
                        "eliminar totalmente el virus.\n" +
                        "\n" +
                        "Rehidratación. Normalmente se recomienda una administración de suero por vía intravenosa.\n" +
                        "Transfusiones de sangre. Esto por la perdida de sangre debido a las diarreas. Una vez estabilizado, se prosigue con cuidados y monitoreo.\n" +
                        "Antibióticos.\n" +
                        "Recuerda que los tratamientos deben ser administrados por un veterinario profesional de cabecera o de confianza.");

            }
        });

        ea4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                descripcion.setVisibility(View.VISIBLE);
                sintomas.setVisibility(View.VISIBLE);
                cuidado.setVisibility(View.VISIBLE);

                tv1.setText("4Es una enfermedad infecciosa, de tipo vírica, grave y potencialmente letal." +
                        "ante cualquier sospecha de tener esta enfermedad es imprescindible acudir de forma inmediata al centro veterinario mas cercano." +
                        "Algunas razas de perro como el Rottweiler son mas propensos a contraer esta enfermedad.\n" +
                        "El Parvovirus se contagia mediante contacto oral/nasal directo de un perro infectado a otro perro," +
                        " a través de las heces de perros infectados con el canino\n" +
                        "Es considerado un virus muy contagioso y tiene un periodo de incubación corto (entre cinco y diez días)");

                tv2.setText("4Esta enfermedad por lo general ataca al tejido linfatico e intastinal. Los principales sintomas que produce esta enfermedad son:\n" +
                        "Diarrea (que suele ir acompañada de hemorragia)\n" +
                        "Vómitos\n" +
                        "Fiebre\n" +
                        "Falta de apetito y decaimiento.\n" +
                        "Apatía y/o letargo.\n" +
                        "Depresión\n" +
                        "Pérdida de peso.\n" +
                        "Dolor a la palpación de abdomen.\n" +
                        "En casos más graves, deshidratación (más o menos severa, ya que el virus afecta al tracto intestinal) y muerte del paciente.");

                tv3.setText("4No existe un tratamiento 100% efectivo del parviovirus, sin embargo, existen pasos a seguir para poder combatirla y tener mejor resultados o en su caso, " +
                        "eliminar totalmente el virus.\n" +
                        "\n" +
                        "Rehidratación. Normalmente se recomienda una administración de suero por vía intravenosa.\n" +
                        "Transfusiones de sangre. Esto por la perdida de sangre debido a las diarreas. Una vez estabilizado, se prosigue con cuidados y monitoreo.\n" +
                        "Antibióticos.\n" +
                        "Recuerda que los tratamientos deben ser administrados por un veterinario profesional de cabecera o de confianza.");

            }
        });

        ea5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                descripcion.setVisibility(View.VISIBLE);
                sintomas.setVisibility(View.VISIBLE);
                cuidado.setVisibility(View.VISIBLE);

                tv1.setText("5Es una enfermedad infecciosa, de tipo vírica, grave y potencialmente letal." +
                        "ante cualquier sospecha de tener esta enfermedad es imprescindible acudir de forma inmediata al centro veterinario mas cercano." +
                        "Algunas razas de perro como el Rottweiler son mas propensos a contraer esta enfermedad.\n" +
                        "El Parvovirus se contagia mediante contacto oral/nasal directo de un perro infectado a otro perro," +
                        " a través de las heces de perros infectados con el canino\n" +
                        "Es considerado un virus muy contagioso y tiene un periodo de incubación corto (entre cinco y diez días)");

                tv2.setText("5Esta enfermedad por lo general ataca al tejido linfatico e intastinal. Los principales sintomas que produce esta enfermedad son:\n" +
                        "Diarrea (que suele ir acompañada de hemorragia)\n" +
                        "Vómitos\n" +
                        "Fiebre\n" +
                        "Falta de apetito y decaimiento.\n" +
                        "Apatía y/o letargo.\n" +
                        "Depresión\n" +
                        "Pérdida de peso.\n" +
                        "Dolor a la palpación de abdomen.\n" +
                        "En casos más graves, deshidratación (más o menos severa, ya que el virus afecta al tracto intestinal) y muerte del paciente.");

                tv3.setText("5No existe un tratamiento 100% efectivo del parviovirus, sin embargo, existen pasos a seguir para poder combatirla y tener mejor resultados o en su caso, " +
                        "eliminar totalmente el virus.\n" +
                        "\n" +
                        "Rehidratación. Normalmente se recomienda una administración de suero por vía intravenosa.\n" +
                        "Transfusiones de sangre. Esto por la perdida de sangre debido a las diarreas. Una vez estabilizado, se prosigue con cuidados y monitoreo.\n" +
                        "Antibióticos.\n" +
                        "Recuerda que los tratamientos deben ser administrados por un veterinario profesional de cabecera o de confianza.");

            }
        });

        ea6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                descripcion.setVisibility(View.VISIBLE);
                sintomas.setVisibility(View.VISIBLE);
                cuidado.setVisibility(View.VISIBLE);

                tv1.setText("6Es una enfermedad infecciosa, de tipo vírica, grave y potencialmente letal." +
                        "ante cualquier sospecha de tener esta enfermedad es imprescindible acudir de forma inmediata al centro veterinario mas cercano." +
                        "Algunas razas de perro como el Rottweiler son mas propensos a contraer esta enfermedad.\n" +
                        "El Parvovirus se contagia mediante contacto oral/nasal directo de un perro infectado a otro perro," +
                        " a través de las heces de perros infectados con el canino\n" +
                        "Es considerado un virus muy contagioso y tiene un periodo de incubación corto (entre cinco y diez días)");

                tv2.setText("6Esta enfermedad por lo general ataca al tejido linfatico e intastinal. Los principales sintomas que produce esta enfermedad son:\n" +
                        "Diarrea (que suele ir acompañada de hemorragia)\n" +
                        "Vómitos\n" +
                        "Fiebre\n" +
                        "Falta de apetito y decaimiento.\n" +
                        "Apatía y/o letargo.\n" +
                        "Depresión\n" +
                        "Pérdida de peso.\n" +
                        "Dolor a la palpación de abdomen.\n" +
                        "En casos más graves, deshidratación (más o menos severa, ya que el virus afecta al tracto intestinal) y muerte del paciente.");

                tv3.setText("6No existe un tratamiento 100% efectivo del parviovirus, sin embargo, existen pasos a seguir para poder combatirla y tener mejor resultados o en su caso, " +
                        "eliminar totalmente el virus.\n" +
                        "\n" +
                        "Rehidratación. Normalmente se recomienda una administración de suero por vía intravenosa.\n" +
                        "Transfusiones de sangre. Esto por la perdida de sangre debido a las diarreas. Una vez estabilizado, se prosigue con cuidados y monitoreo.\n" +
                        "Antibióticos.\n" +
                        "Recuerda que los tratamientos deben ser administrados por un veterinario profesional de cabecera o de confianza.");

            }
        });

        ea7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                descripcion.setVisibility(View.VISIBLE);
                sintomas.setVisibility(View.VISIBLE);
                cuidado.setVisibility(View.VISIBLE);

                tv1.setText("7Es una enfermedad infecciosa, de tipo vírica, grave y potencialmente letal." +
                        "ante cualquier sospecha de tener esta enfermedad es imprescindible acudir de forma inmediata al centro veterinario mas cercano." +
                        "Algunas razas de perro como el Rottweiler son mas propensos a contraer esta enfermedad.\n" +
                        "El Parvovirus se contagia mediante contacto oral/nasal directo de un perro infectado a otro perro," +
                        " a través de las heces de perros infectados con el canino\n" +
                        "Es considerado un virus muy contagioso y tiene un periodo de incubación corto (entre cinco y diez días)");

                tv2.setText("7Esta enfermedad por lo general ataca al tejido linfatico e intastinal. Los principales sintomas que produce esta enfermedad son:\n" +
                        "Diarrea (que suele ir acompañada de hemorragia)\n" +
                        "Vómitos\n" +
                        "Fiebre\n" +
                        "Falta de apetito y decaimiento.\n" +
                        "Apatía y/o letargo.\n" +
                        "Depresión\n" +
                        "Pérdida de peso.\n" +
                        "Dolor a la palpación de abdomen.\n" +
                        "En casos más graves, deshidratación (más o menos severa, ya que el virus afecta al tracto intestinal) y muerte del paciente.");

                tv3.setText("7No existe un tratamiento 100% efectivo del parviovirus, sin embargo, existen pasos a seguir para poder combatirla y tener mejor resultados o en su caso, " +
                        "eliminar totalmente el virus.\n" +
                        "\n" +
                        "Rehidratación. Normalmente se recomienda una administración de suero por vía intravenosa.\n" +
                        "Transfusiones de sangre. Esto por la perdida de sangre debido a las diarreas. Una vez estabilizado, se prosigue con cuidados y monitoreo.\n" +
                        "Antibióticos.\n" +
                        "Recuerda que los tratamientos deben ser administrados por un veterinario profesional de cabecera o de confianza.");

            }
        });

        ea8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                descripcion.setVisibility(View.VISIBLE);
                sintomas.setVisibility(View.VISIBLE);
                cuidado.setVisibility(View.VISIBLE);

                tv1.setText("8Es una enfermedad infecciosa, de tipo vírica, grave y potencialmente letal." +
                        "ante cualquier sospecha de tener esta enfermedad es imprescindible acudir de forma inmediata al centro veterinario mas cercano." +
                        "Algunas razas de perro como el Rottweiler son mas propensos a contraer esta enfermedad.\n" +
                        "El Parvovirus se contagia mediante contacto oral/nasal directo de un perro infectado a otro perro," +
                        " a través de las heces de perros infectados con el canino\n" +
                        "Es considerado un virus muy contagioso y tiene un periodo de incubación corto (entre cinco y diez días)");

                tv2.setText("8Esta enfermedad por lo general ataca al tejido linfatico e intastinal. Los principales sintomas que produce esta enfermedad son:\n" +
                        "Diarrea (que suele ir acompañada de hemorragia)\n" +
                        "Vómitos\n" +
                        "Fiebre\n" +
                        "Falta de apetito y decaimiento.\n" +
                        "Apatía y/o letargo.\n" +
                        "Depresión\n" +
                        "Pérdida de peso.\n" +
                        "Dolor a la palpación de abdomen.\n" +
                        "En casos más graves, deshidratación (más o menos severa, ya que el virus afecta al tracto intestinal) y muerte del paciente.");

                tv3.setText("8No existe un tratamiento 100% efectivo del parviovirus, sin embargo, existen pasos a seguir para poder combatirla y tener mejor resultados o en su caso, " +
                        "eliminar totalmente el virus.\n" +
                        "\n" +
                        "Rehidratación. Normalmente se recomienda una administración de suero por vía intravenosa.\n" +
                        "Transfusiones de sangre. Esto por la perdida de sangre debido a las diarreas. Una vez estabilizado, se prosigue con cuidados y monitoreo.\n" +
                        "Antibióticos.\n" +
                        "Recuerda que los tratamientos deben ser administrados por un veterinario profesional de cabecera o de confianza.");

            }
        });

        ea9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                descripcion.setVisibility(View.VISIBLE);
                sintomas.setVisibility(View.VISIBLE);
                cuidado.setVisibility(View.VISIBLE);

                tv1.setText("9Es una enfermedad infecciosa, de tipo vírica, grave y potencialmente letal." +
                        "ante cualquier sospecha de tener esta enfermedad es imprescindible acudir de forma inmediata al centro veterinario mas cercano." +
                        "Algunas razas de perro como el Rottweiler son mas propensos a contraer esta enfermedad.\n" +
                        "El Parvovirus se contagia mediante contacto oral/nasal directo de un perro infectado a otro perro," +
                        " a través de las heces de perros infectados con el canino\n" +
                        "Es considerado un virus muy contagioso y tiene un periodo de incubación corto (entre cinco y diez días)");

                tv2.setText("9Esta enfermedad por lo general ataca al tejido linfatico e intastinal. Los principales sintomas que produce esta enfermedad son:\n" +
                        "Diarrea (que suele ir acompañada de hemorragia)\n" +
                        "Vómitos\n" +
                        "Fiebre\n" +
                        "Falta de apetito y decaimiento.\n" +
                        "Apatía y/o letargo.\n" +
                        "Depresión\n" +
                        "Pérdida de peso.\n" +
                        "Dolor a la palpación de abdomen.\n" +
                        "En casos más graves, deshidratación (más o menos severa, ya que el virus afecta al tracto intestinal) y muerte del paciente.");

                tv3.setText("9No existe un tratamiento 100% efectivo del parviovirus, sin embargo, existen pasos a seguir para poder combatirla y tener mejor resultados o en su caso, " +
                        "eliminar totalmente el virus.\n" +
                        "\n" +
                        "Rehidratación. Normalmente se recomienda una administración de suero por vía intravenosa.\n" +
                        "Transfusiones de sangre. Esto por la perdida de sangre debido a las diarreas. Una vez estabilizado, se prosigue con cuidados y monitoreo.\n" +
                        "Antibióticos.\n" +
                        "Recuerda que los tratamientos deben ser administrados por un veterinario profesional de cabecera o de confianza.");

            }
        });


    }
}