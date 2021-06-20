package com.example.help_pets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class gatos extends AppCompatActivity {

    private TextView tv1,tv2,tv3,descripcion,sintomas,cuidado,representacion;
    private Button eg1,eg2,eg3,eg4,eg5,eg6,eg7,eg8,eg9;
    private ImageView botonrepresentacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gatos);

        eg1 = (Button)findViewById(R.id.eg1);
        eg2 = (Button)findViewById(R.id.eg2);
        eg3 = (Button)findViewById(R.id.eg3);
        eg4 = (Button)findViewById(R.id.eg4);
        eg5 = (Button)findViewById(R.id.eg5);
        eg6 = (Button)findViewById(R.id.eg6);
        eg7 = (Button)findViewById(R.id.eg7);
        eg8 = (Button)findViewById(R.id.eg8);
        eg9 = (Button)findViewById(R.id.eg9);

        tv1 = (TextView)findViewById(R.id.tv1);
        tv2 = (TextView)findViewById(R.id.tv2);
        tv3 = (TextView)findViewById(R.id.tv3);
        descripcion = (TextView)findViewById(R.id.Descripcion);
        sintomas = (TextView)findViewById(R.id.Sintomas);
        cuidado = (TextView)findViewById(R.id.Cuidado);
        representacion = (TextView)findViewById(R.id.representacion);
        botonrepresentacion = (ImageView)findViewById(R.id.botonrepresentacion);

        eg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                descripcion.setVisibility(View.VISIBLE);
                sintomas.setVisibility(View.VISIBLE);
                cuidado.setVisibility(View.VISIBLE);
                representacion.setVisibility(View.VISIBLE);
                botonrepresentacion.setVisibility(View.VISIBLE);
                tv1.setText("gatos Es una enfermedad infecciosa, de tipo vírica, grave y potencialmente letal." +
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
                botonrepresentacion.setImageResource(R.drawable.parviovirus);
            }
        });

        eg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                descripcion.setVisibility(View.VISIBLE);
                sintomas.setVisibility(View.VISIBLE);
                cuidado.setVisibility(View.VISIBLE);
                representacion.setVisibility(View.VISIBLE);
                botonrepresentacion.setVisibility(View.VISIBLE);
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
                botonrepresentacion.setImageResource(R.drawable.parviovirus);
            }
        });

        eg3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                descripcion.setVisibility(View.VISIBLE);
                sintomas.setVisibility(View.VISIBLE);
                cuidado.setVisibility(View.VISIBLE);
                representacion.setVisibility(View.VISIBLE);
                botonrepresentacion.setVisibility(View.VISIBLE);
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
                botonrepresentacion.setImageResource(R.drawable.parviovirus);
            }
        });

        eg4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                descripcion.setVisibility(View.VISIBLE);
                sintomas.setVisibility(View.VISIBLE);
                cuidado.setVisibility(View.VISIBLE);
                representacion.setVisibility(View.VISIBLE);
                botonrepresentacion.setVisibility(View.VISIBLE);
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
                botonrepresentacion.setImageResource(R.drawable.parviovirus);
            }
        });

        eg5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                descripcion.setVisibility(View.VISIBLE);
                sintomas.setVisibility(View.VISIBLE);
                cuidado.setVisibility(View.VISIBLE);
                representacion.setVisibility(View.VISIBLE);
                botonrepresentacion.setVisibility(View.VISIBLE);
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
                botonrepresentacion.setImageResource(R.drawable.parviovirus);
            }
        });

        eg6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                descripcion.setVisibility(View.VISIBLE);
                sintomas.setVisibility(View.VISIBLE);
                cuidado.setVisibility(View.VISIBLE);
                representacion.setVisibility(View.VISIBLE);
                botonrepresentacion.setVisibility(View.VISIBLE);
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
                botonrepresentacion.setImageResource(R.drawable.parviovirus);
            }
        });

        eg7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                descripcion.setVisibility(View.VISIBLE);
                sintomas.setVisibility(View.VISIBLE);
                cuidado.setVisibility(View.VISIBLE);
                representacion.setVisibility(View.VISIBLE);
                botonrepresentacion.setVisibility(View.VISIBLE);
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
                botonrepresentacion.setImageResource(R.drawable.parviovirus);
            }
        });

        eg8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                descripcion.setVisibility(View.VISIBLE);
                sintomas.setVisibility(View.VISIBLE);
                cuidado.setVisibility(View.VISIBLE);
                representacion.setVisibility(View.VISIBLE);
                botonrepresentacion.setVisibility(View.VISIBLE);
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
                botonrepresentacion.setImageResource(R.drawable.parviovirus);
            }
        });

        eg9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                descripcion.setVisibility(View.VISIBLE);
                sintomas.setVisibility(View.VISIBLE);
                cuidado.setVisibility(View.VISIBLE);
                representacion.setVisibility(View.VISIBLE);
                botonrepresentacion.setVisibility(View.VISIBLE);
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
                botonrepresentacion.setImageResource(R.drawable.parviovirus);
            }
        });



    }
}