package com.example.help_pets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class peces extends AppCompatActivity {

    private TextView tv1,tv2,tv3,descripcion,sintomas,cuidado,representacion;
    private Button epe1,epe2,epe3,epe4,epe5,epe6,epe7,epe8,epe9,epe10,epe11;
    private ImageView botonrepresentacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peces);


        epe1 = (Button)findViewById(R.id.ep1);
        epe2 = (Button)findViewById(R.id.ep2);
        epe3 = (Button)findViewById(R.id.ep3);
        epe4 = (Button)findViewById(R.id.ep4);
        epe5 = (Button)findViewById(R.id.ep5);
        epe6 = (Button)findViewById(R.id.ep6);
        epe7 = (Button)findViewById(R.id.ep7);
        epe8 = (Button)findViewById(R.id.ep8);
        epe9 = (Button)findViewById(R.id.ep9);
        epe10 = (Button)findViewById(R.id.ep10);
        epe11 = (Button)findViewById(R.id.ep11);

        tv1 = (TextView)findViewById(R.id.tv1);
        tv2 = (TextView)findViewById(R.id.tv2);
        tv3 = (TextView)findViewById(R.id.tv3);
        descripcion = (TextView)findViewById(R.id.Descripcion);
        sintomas = (TextView)findViewById(R.id.Sintomas);
        cuidado = (TextView)findViewById(R.id.Cuidado);

        //hidropesia
        epe1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                descripcion.setVisibility(View.VISIBLE);
                sintomas.setVisibility(View.VISIBLE);
                cuidado.setVisibility(View.VISIBLE);

                tv1.setText("No es considerada una enfermedad como tal, si no una manifestación del mal estado interno o degenerativo del pez, presente por otras patologías como, por ejemplo, la hinchazón y acumulación de líquido en hígado y riñón.\n" +
                        "\n" +
                        "Puede ser causada por parásitos, virus, mala nutrición y bacterias. ");

                tv2.setText("La hidropesía es grave y visible porque la zona abdominal está claramente inflamada y algunas partes del cuerpo salen como si la piel estuviese hecha de pequeños pinos.\n" +
                        "\n" +
                        "Otros síntomas son, poco apetito y necesidad constante de subir a la superficie para recibir oxigeno. Es una enfermedad que, podría resultar contagiosa para otros miembros del acuario, pero en la mayoría de los casos no lo es");

                tv3.setText("Aunque se trata de una enfermedad fácil de diagnosticar, es necesario el ojo de un experto para identificar su origen y el tratamiento a seguir. Cuando hayas identificado la enfermedad en tu pez, debes aislarlo inmediatamente del acuario.Una vez aislado y controlada su alimentación, agua y oxígeno; es necesario que acudas a buscar la orientación de un veterinario para saber los siguientes pasos a seguir. Él te indicará si es necesario, y posible, administrar algún antibiótico.Si no puedes acudir a un profesional, algunos tratamientos básicos inmediatos que puedes seguir son ayunar el pez 2 o 3 días, luego usar un alimento rico en fibra para favorecer el tránsito intestinal, mantener muy limpio el acuario de cuarentena y utilizar sal no-yodada para ayudarle a eliminar la retención de líquidos.Una vez que el pez se ha curado, es necesario que cambies constantemente el agua de la pecera de cuarentena. De esta manera, eliminarás el residuo de medicamento y evitarás un empeoramiento posterior. Como has visto, la enfermedad de la hidropesía puede ser muy grave e infecciosa. Por eso, es fundamental que la reconozcas rápidamente para proteger la vida del pez infectado y de los demás habitantes del acuario.");
            }
        });


        //terciopelo
        epe2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                descripcion.setVisibility(View.VISIBLE);
                sintomas.setVisibility(View.VISIBLE);
                cuidado.setVisibility(View.VISIBLE);

                tv1.setText("La enfermedad del terciopelo, o la enfermedad de los peces de coral es un caso especial entre los parásitos unicelulares de los peces, ya que este organismo es de origen vegetal ( y recibe el nombre de \"dinoflagelado\"). En su fase inicial, los peces se frotan contra objetos y hojas de plantas, pero la enfermedad sólo se hace visible si la infestación es más fuerte. Las infecciones en acuarios de agua dulce suelen ser causadas por el Oodinium pillularis, mientras que en el agua salada se trata del Oodinium ocellatum.\n" +
                        "\n" +
                        "Con el Oodinium, la piel de los peces está llena de pequeñas motas blanco-amarillentas. Los elementos patógenos están sobre la piel; alcanzan un tamaño máximo de 0,3 mm, por lo que son mucho más pequeños que el Ichthyophthirius, y es fácil ignorarlos. Aunque a veces puede confundirse con la enfermedad de los puntos blancos.");

                tv2.setText("Como en todo este tipo de enfermedad, uno de los primeros síntomas es que el pez se rasca contra algún objeto, tratando de desprenderse del los parásitos, después la piel se empieza a recubrir con una mucosa aterciopelada, de color blanco sucio, dorado, amarillo rojizo, dependiendo del tipo de oodinium que los afecte. Es muy contagiosa, por lo que el aislamiento debe ser lo más pronto posible.");

                tv3.setText("El mejor método de prevención es el control metódico y periódico de las condiciones del agua. Dedica tiempo a la observación de tu acuario. Observa detenidamente a todos los peces y su comportamiento para detectar cualquier tipo de síntomas. Verifica que la piel, escamas y aletas estén sanas. Si hay peleas constantes entre algunos de los peces, pide asesoramiento, quizás sean incompatibles para compartir el hábitat.\n" +
                        "\n" +
                        "Antes de realizar cualquier otra operación, hay que controlar los valores de pH, dureza, amoniacos, nitritos y vigilar la temperatura del agua. Administrar a los peces una dieta variada es uno de los pilares para prevenir muchas enfermedades. Efectuar regularmente cambios de agua del acuario teniendo en cuenta que cambiar el agua no es lo mismo que rellenar el agua evaporada. Limpieza regular del filtro sin olvidar dejar siempre partes del filtro viejas. No hay que cambiar todas las materias filtrantes, sino que lo más aconsejable es cambiar la mitad y, al próximo cambio, la otra mitad.");
            }
        });


        //gusano lernaea
        epe3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                descripcion.setVisibility(View.VISIBLE);
                sintomas.setVisibility(View.VISIBLE);
                cuidado.setVisibility(View.VISIBLE);

                tv1.setText("El gusano lernaea es un parásito, este entierra su cabeza en el cuerpo del pez, quedando incrustado en él. Se piensa que es originario de Asia, desde donde se ha distribuido al resto del mundo debido a la comercialización de la carpa dorada. Este parásito macroscópico ha aparecido en muchas especies de peces de agua dulce además de en larvas de ranas y salamandras en Africa, Asia, Europa, Israel, Japón, Eurasia y Estados Unidos de Norteamérica.");

                tv2.setText("Observará que el pez nada de lado a lado, frotando su cuerpo contra rocas, plantas y decoración del acuario. Notará inflamaciones en la piel, y ahí hay hilos que parecen pequeños crustáceos de forma alargada, tipo varilla, blanquecinos, incrustados en la piel del pez, generalmente en la base de las aletas o cerca de las branquias. Esos organismos surgen hacia arriba y son de color verde claro. Es frecuente que el punto donde se sujeta el parásito esté inflamado y sangrando.");

                tv3.setText("El mejor método de prevención es el control metódico y periódico de las condiciones del agua. Dedique tiempo a la observación de su acuario. Observe detenidamente a todos los peces y su comportamiento. Verifique que la piel, escamas y aletas estén sanas. Si hay peleas constantes entre algunos de los peces, pida asesoramiento, quizás sean incompatibles para compartir el hábitat.\n" +
                        "\n" +
                        "Tenga siempre productos para tratar punto blanco, es la enfermedad más habitual. Tenga también entre sus elementos un bactericida y un funguicida. Esos productos suelen ser comunes a muchas enfermedades. Tenga presente sus fechas de caducidad");
            }
        });


        //punto blanco
        epe4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                descripcion.setVisibility(View.VISIBLE);
                sintomas.setVisibility(View.VISIBLE);
                cuidado.setVisibility(View.VISIBLE);

                tv1.setText("Se trata de una enfermedad parasitaria desatada por la acción del protozoo Ichthyophthirius multifilis, por lo cual también es llamada enfermedad de Ich. Este parásito solo ataca a peces de aguas dulces, pues le es imposible sobrevivir en un entorno salado.\n" +
                        "\n" +
                        "Actúa adhiriéndose a la piel de los peces, dando esa apariencia de pequeños puntos blancos que caracteriza a la enfermedad. Se trata de uno de los parásitos más comunes, pudiendo encontrarse en la piel de peces sanos sin manifestarse hasta que las condiciones son propicias para su desarrollo. Una vez iniciado el ciclo de vida de este protozoario, resulta altamente contagioso. El mayor riesgo que corren los peces bajo su afecto es que propicia la aparición de dolencias respiratorias, llevándolos a la muerte si no se aplica un tratamiento a tiempo");

                tv2.setText("El primero de ellos es la aparición de los puntos blancos ya mencionados. Pueden aparecer en todo el cuerpo del pez, pero se agrupan principalmente cerca de las aletas, en forma de motas blanquecinas. Luego, los peces desarrollan conductas anormales, como son:\n" +
                        "\n" +
                        "Nerviosismo.\n" +
                        "Se frotan contra las paredes y objetos del acuario.\n" +
                        "Comportamiento irritable.\n" +
                        "Falta de apetito.\n" +
                        "Respiración irregular.\n" +
                        "Cuando el pez comienza a frotarse contra el acuario, la enfermedad se encuentra avanzada. La falta de apetito y los problemas respiratorios pueden resultar letales si no se aplica un tratamiento.\n" +
                        "\n");

                tv3.setText("La enfermedad del punto blanco es posible curarla utilizando un tratamiento natural, mezclando cambios de temperatura y sal de acuario, o aplicando medicamentos formulados especialmente para la enfermedad.\n" +
                        "Termoterapia y sal de acuario\n" +
                        "Los cambios de temperatura son cruciales a la hora de combatir a este parásito, pues requiere de temperaturas muy específicas para llevar a cabo su ciclo vital.\n" +
                        "\n" +
                        "La primera manifestación de la enfermedad es la aparición de puntos blancos, así que en esta etapa es posible atacar al parásito. Para eliminarlo y curar la enfermedad de punto blanco en peces, conviene aumentar la temperatura para acelerar las etapas de vida del protozoario. Aumenta la temperatura hasta llegar a los 30 grados centígrados de forma paulatina, a razón de 1 grado cada 2 horas. De esta forma, el cambio no resultará brusco para tus peces pero sí para el parásito. A medida que subes la temperatura, debes compensarlo con un aumento de la cantidad de oxígeno. Se recomienda, además, retirar los filtros ultravioleta y el carbón del filtro.\n" +
                        "\n" +
                        "Subir la temperatura hará que los quistes se desprendan del cuerpo del pez y caigan al fondo del tanque, momento en que resultan más vulnerables. Cuando notes que se han desprendido los quistes, agrega 1 cucharadita de sal de acuario por cada 4 litros de agua. Utiliza solo sal de acuario, nunca de mesa; esta se puede adquirir en tiendas de mascotas.\n" +
                        "\n" +
                        "Cada 2 días, cambia alrededor del 25 % del agua, añadiendo agua nueva que esté a la misma temperatura. Aplica este tratamiento entre 7 y 10 días. Cuando notes que ya no se aprecia el parásito, continúa aplicando el tratamiento de 2 a 3 días más. Luego, cambia por última vez el 25 % del agua y regresa a la temperatura habitual del acuario, bajando 1 grado cada 2 horas.\n" +
                        "\n" +
                        "Este tratamiento para la enfermedad del punto blanco con sal es recomendable solo cuando en tu tanque no existen peces que sean sensibles a altas concentraciones de sal. Si no estás seguro, consulta con un especialista en acuarofilia. Si tus peces son sensibles a la sal, puedes aplicar la siguiente opción.\n" +
                        "\n" +
                        "Termoterapia y medicamento\n" +
                        "En principio, debes aplicar la misma parte de termoterapia. Es decir, subir 1 grado la temperatura hasta llegar a 30 grados centígrados. Recuerda aumentar las proporciones de oxígeno, retirar el filtro de carbono y alejar el tanque de la luz directa.\n" +
                        "\n" +
                        "Al notar que los quistes se han desprendido del cuerpo de los peces, aplica el medicamento para el punto blanco. Son comunes el verde de la malaquita, el azul de metileno, la formalita u otros que es posible encontrar en las tiendas de artículos para mascotas. Sigue las instrucciones de cada medicamento con respecto a la dosis, además de consultar con un experto en acuarofilia sobre los posibles riesgos para los peces que hacen vida en tu tanque.\n" +
                        "\n" +
                        "Al terminar los días de tratamiento de acuerdo a las indicaciones del medicamento, cambia entre el 25 y el 50 % del agua, y vuelve a la temperatura habitual del acuario moderando 1 grado cada 2 horas.");
            }
        });


        //dactylogyrus
        epe5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                descripcion.setVisibility(View.VISIBLE);
                sintomas.setVisibility(View.VISIBLE);
                cuidado.setVisibility(View.VISIBLE);
                tv1.setText("Son trematodos monogeneanos ovíparos (puesta de huevos) que tienen dos pares de anclas. Estos anclajes se pueden utilizar para agarrarse a las branquias de un huésped, particularmente a los peces de agua dulce como la carpa. En los peces muy infectados, Dactylogyrus también se puede encontrar en la cavidad bucal, y a veces las aletas y la piel de los peces de agua dulce");

                tv2.setText("Los peces que están infectados por especies de Dactylogyrus pueden tener síntomas que incluyen branquias inflamadas, secreciones mucosas excesivas y respiración acelerada. También el aumento del movimiento de las branquias debido al daño(fibrosis)que la platija está causando a los tejidos, El pez infectado también se vuelve letárgico, nada cerca de la superficie y su apetito disminuye.");

                tv3.setText("Un método primario para el control de las especies de Dactylogyrus es la aplicación de productos químicos. Los tratamientos incluyen Praziquantel,baños de sal, formalina u organofosforados, fenbendazol, albendazol, Bromex-50 y permanganato de potasio.");
            }
        });


        //baba en la piel
        epe6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                descripcion.setVisibility(View.VISIBLE);
                sintomas.setVisibility(View.VISIBLE);
                cuidado.setVisibility(View.VISIBLE);

                tv1.setText("Baba en la piel de los peces . El pez que padezca esta enfermedad lucirá opaco. Su cuerpo se ve cubierto por una delgada capa de (mucosa) grisácea y blancuzca. Afecta también a las branquias. Es resultado de las bacterias que se alojan en la piel del pez debido a un contaminación grave del agua en que vive.");

                tv2.setText("Se notará que el pez que padezca esta enfermedad lucirá opaco. Su cuerpo se ve cubierto por una delgada capa de mucosa grisácea y blancuzca. Afecta también a las [branquias]. El pez frota su cuerpo contra rocas y plantas.");

                tv3.setText("Realmente difícil tratar ésta enfermedad, especialmente si avanzó demasiado. Si las branquias del pez están sanas, acuda a un comercio especializado para que le suministren el producto indicado. Si las branquias ya están dañadas Cuando se detecta pronto, las branquias quizá estén sanas y un veterinario podrá aliviar al pez, pero si las mismas están infectadas el pez debe ser trasladado a un cuidado en cuarentena que sirva para administrarle un tratamiento que alivie la molestia y que cure la enfermedad, en algunos casos los peces lamentablemente terminan muriendo");
            }
        });


        //estreñimiento
        epe7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                descripcion.setVisibility(View.VISIBLE);
                sintomas.setVisibility(View.VISIBLE);
                cuidado.setVisibility(View.VISIBLE);

                tv1.setText("Es una enfermedad en los peces donde el vientre se abulta notablemente. Por estar constipado, no se alimenta ni defeca. Descansa sobre el sustrato muchas horas, ya que está debilitado. Puede resultar difícil distinguir esta enfermedad de la hidropesia.");

                tv2.setText("Poco apetito y necesidad constante de subir a la superficie para recibir oxigeno.");

                tv3.setText("Darle vía oral una gotita de aceite de oliva. Añadir a nuestro acuario hospital sulfato de magnesio en la proporción de una cucharada de té por cada 5 litros de agua de acuario, cambiando agua todos los días en la proporción del 50% y repetir todos los días el proceso hasta un mínimo de 5-6 días. Después del proceso evaluar como esta el pez y si es necesario repetirselo con un proceso de descanso de 2 días.");
            }
        });


        //parasitos intestinales
        epe8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                descripcion.setVisibility(View.VISIBLE);
                sintomas.setVisibility(View.VISIBLE);
                cuidado.setVisibility(View.VISIBLE);

                tv1.setText("Los parásitos en los peces son un grupo de organismos que pueden o no causar enfermedades en los peces de acuario, dependiendo de una serie de factores.\n" +
                        "Algunos parásitos se transmiten directamente de peces a peces, como algunos protozoos ectoparasitarios. Los ciclos de vida de estos parásitos también pueden incluir una fase de vida libre. Allí es cuando se pueden encontrar en el agua o sustrato del acuario. El ciclo de vida de estos parásitos se denomina ciclo de vida directo.\n" +
                        "Otros parásitos más grandes a menudo tienen ciclos de vida complejos que implican dos o más huéspedes. Esto se llama ciclo de vida indirecto. Por ejemplo, el gusano de cabeza espinosa se adhiere a la pared intestinal de un pez tropical. Y después de ser expulsado por el pez defecando, los huevos son comidos por el camarón de agua dulce y son ingeridos a su vez por otro pez tropical.");

                tv2.setText("A veces es difícil detectar si un pez tiene parásitos, ya que no siempre los signos son evidentes a simple vista. Un pez que nada solo, más lento o de lado puede ser un indicativo de que está enfermo. También si notas que ha perdido peso, le cuesta mover sus aletas o ves que las branquias se mueven más rápido de lo normal. El hinchazón también puede ser un síntoma de enfermedad. Y, más visiblemente, cuando tienen manchas blancas, como en la enfermedad de Ich.");

                tv3.setText("Solicite asistencia en un comercio especializado. Probablemente le suministren un antihelmíntico para incluir con el alimento. Aplique un químico sugerido para eliminar los parásitos del acuario.");
            }
        });


        //exophthalmia
        epe9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                descripcion.setVisibility(View.VISIBLE);
                sintomas.setVisibility(View.VISIBLE);
                cuidado.setVisibility(View.VISIBLE);

                tv1.setText("La exophthalmia es una enfermedad que se caracteriza porque el pez adelgaza mucho y los ojos sobresalen de sus órbitas. Puede presentar un ojo desorbitado o ambos ojos. Esta inflamación es porque se acumula una excesiva cantidad de líquidos biológicos en el interior del ojos o cavidad ocular del pez.\n" +
                        "\n" +
                        "Esta enfermedad entra en los peces por una septicemia bacteriana o tuberculosis. Principalmente es debido a una mala calidad del agua del acuario. Si hemos descuidado el acuario, no hemos cambiado el agua como debiéramos, no tenemos los niveles equilibrados, nos pueden enfermar los peces con esta enfermedad.");

                tv2.setText("El pez adelgaza y sus ojos sobresalen de sus órbitas. Causas: esta enfermedad, distinguida por los nódulos inflamados detrás de los ojos del pez, suele ser consecuencia de septicemia bacteriana o tuberculosis. Generalmente se observa un descuido severo de las condiciones del agua.");

                tv3.setText("Mejore la calidad del hábitat. El proceso de tratamiento es lento. Si no se recuperan es porque el origen del mal es tuberculosis. Éste último caso no tiene cura. No hay más alternativa que eliminar los peces infectados.");
            }
        });


        //hexamiatiasis
        epe10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                descripcion.setVisibility(View.VISIBLE);
                sintomas.setVisibility(View.VISIBLE);
                cuidado.setVisibility(View.VISIBLE);

                tv1.setText("Enfermedades de los peces Conocida vulgarmente como la enfermedad de los agujeros en la cabeza.Provoca en fases avanzadas la aparición en la parte superior de los ojos de unos agujeros por los que se puede observar como se desprenden unos filamentos blanquecinos gelatinosos derivados de la necrosis de los músculos de la cabeza del animal. La enfermedad ataca a especies determinadas de peces,siendo las más afectadas los Cíclidos,Serrasálmidos y Gouramis.");

                tv2.setText("Suele afectar a los Discus. Los poros sensoriales en la cabeza se llenan de pus. También los poros sensoriales próximos a la línea lateral. Otro indicador es la materia fecal larga y dura.");

                tv3.setText("Solicite asistencia en un comercio especializado. Probablemente le suministren Dimetronidazole. Aplique 100 mg cada 9 litros de agua en el acuario. El procedimiento correcto es extraer un par de litros del acuario, incorporarles la dosis total para el acuario y, una vez diluido, incorporar el producto ya diluido en el acuario.");
            }
        });


        //vejiga natatoria
        epe11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                descripcion.setVisibility(View.VISIBLE);
                sintomas.setVisibility(View.VISIBLE);
                cuidado.setVisibility(View.VISIBLE);

                tv1.setText("Esta enfermedad se debe a infecciones bacterianas por descuido severo de las condiciones del agua. También puede ser un problema congénito. ");

                tv2.setText("El pez afectado nadará panza arriba, invertido. No se mueve con naturalidad, parece torpe y se golpea con los objetos que lo rodean.");

                tv3.setText("Es poco probable que identifiquemos con exactitud el origen de la enfermedad. mejore la calidad del hábitat, especialmente el agua. Traslade al pez al acuario de cuarentena. Solicite el químico adecuado en un comercio especializado y aplíquelo tanto en el acuario principal como en el de cuarentena. Espere una semana, si el pez afectado no mejora, probablemente no lo haga luego. No quedará más que sacrificar al animal.");
            }
        });


    }
   /* @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.vacunas, menu);
        return super.onCreateOptionsMenu(menu);
    }
    */


}