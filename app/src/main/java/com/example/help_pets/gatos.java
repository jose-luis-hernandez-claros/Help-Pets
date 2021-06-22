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


        //leucemia
        eg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                descripcion.setVisibility(View.VISIBLE);
                sintomas.setVisibility(View.VISIBLE);
                cuidado.setVisibility(View.VISIBLE);

                tv1.setText("La leucemia felina es una enfermedad infectocontagiosa especialmente grave y común provocada por el virus FLVe (Virus de la Leucemia Felina) que genera en el animal un cuadro grave inhibición de uno o diversos componentes del sistema inmunitario, anemia severa e incluso el desarrollo de tumores malignos. Todo ello provoca que las defensas del gato bajen y corra un mayor riesgo de contraer todo tipo de infecciones y complicaciones.");

                tv2.setText("La leucemia en gatos y sus síntomas son especialmente variados y dependerán en gran medida del estado de salud del propio individuo. Es frecuente observar que padece diversos problemas de salud a la vez, que tiene ciertas dificultades para superarlos y que, de forma progresiva, el estado de salud general del gato empeora.\n" +
                        "\n" +
                        "Los síntomas de leucemia en gatos más comunes son:\n" +
                        "\n" +
                        "Fiebre\n" +
                        "Cansancio\n" +
                        "Anemia\n" +
                        "Inapetencia\n" +
                        "Letargia\n" +
                        "Inactividad\n" +
                        "Somnolencia\n" +
                        "Pérdida de peso\n" +
                        "Convulsiones\n" +
                        "Dificultad para recuperarse\n" +
                        "Lesiones en la piel\n" +
                        "Problemas renales\n" +
                        "Problemas respiratorios\n" +
                        "Problemas gastrointestinales\n" +
                        "Fatiga\n" +
                        "Debilidad\n" +
                        "Adelgazamiento\n" +
                        "Diarrea\n" +
                        "Inflamación de los ganglios linfáticos\n" +
                        "Estomatitis\n" +
                        "Gingivitis\n" +
                        "Infecciones bacterianas\n" +
                        "Infecciones virales\n" +
                        "Ictericia\n" +
                        "Pelaje en mal estado\n" +
                        "Falta de aseo\n" +
                        "Deja de usar el arenero\n" +
                        "Hipotermia\n" +
                        "Dolor\n" +
                        "Pérdida de dientes\n" +
                        "Anorexia\n" +
                        "Deshidratación");

                tv3.setText("Es muy importante señalar que la leucemia felina no tiene cura, no obstante, determinados individuos pueden llevar un estilo de vida positivo si reciben atención veterinaria regular que incluya la administración de antivirales e inmunoreguladores que ayuden al felino a obtener cierta protección frente a infecciones secundarias.\n" +
                        "\n" +
                        "También será necesario ofrecer buenos cuidados al gato, que incluyan una dieta específica, un estado de bienestar generalizado que evite el estrés y un estado de salud óptimo. En el caso de querer complementar el tratamiento veterinario con un tratamiento natural para la leucemia felina, como vitaminas para gatos con leucemia, consultaremos siempre con el especialista.\n" +
                        "\n" +
                        "Por otro lado, deberemos tomar ciertas precauciones para evitar que nuestro gato pueda contagiar a otros felinos. El veterinario nos sugerirá que mantengamos al gato en el interior para reducir el riesgo de propagación, además, valorará la castración del individuo para evitar el escapismo derivado de la conducta sexual.");

            }
        });


        //panleucopenia
        eg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                descripcion.setVisibility(View.VISIBLE);
                sintomas.setVisibility(View.VISIBLE);
                cuidado.setVisibility(View.VISIBLE);

                tv1.setText("La panleucopenia o enteritis infecciosa felina es una enfermedad vírica altamente contagiosa causada por el parvovirus felino. El virus de la panleucopenia felina es de la misma familia que el que causa la parvovirosis en los perros. Accede al organismo por vía oral y comienza a replicarse en los ganglios linfáticos y, posteriormente, pasa al torrente sanguíneo.\n" +
                        "\n" +
                        "Es un virus que manifiesta una gran afinidad por infectar células con una elevada capacidad de división, como las del sistema digestivo, la médula ósea o los tejidos linfoides. Esto también incluye a los fetos en gestación y explica los síntomas que provoca. Su nombre, panleucopenia, significa disminución del número de glóbulos blancos. Estos son los encargados de defender al organismo frente a patógenos. Además, los glóbulos rojos también se ven afectados. Su número disminuye y la consecuencia es la anemia.");

                tv2.setText("Podemos observar en nuestro gato una manifestación leve o un cuadro clínico de gravedad. Debemos sospechar de la presencia de esta enfermedad si nuestro gato presenta síntomas como los siguientes:\n" +
                        "\n" +
                        "Anorexia.\n" +
                        "Apatía.\n" +
                        "Postración.\n" +
                        "Fiebre.\n" +
                        "Vómitos.\n" +
                        "Diarrea, normalmente con sangre.\n" +
                        "Deshidratación.\n" +
                        "Anemia.\n" +
                        "Aborto.\n" +
                        "Descoordinación y posturas anómalas, sobre todo en gatitos afectados en el útero.\n" +
                        "De observar alguno de los síntomas de la panleucopenia felina, hay que acudir de forma urgente al veterinario para iniciar el tratamiento lo antes posible. Sobre todo en los gatitos más pequeños, la panleucopenia puede causar la muerte en cuestión de horas.");

                tv3.setText("El tratamiento de la panleucopenia felina no es específico, ya que no es posible tratar la infección vírica. Por lo tanto, el objetivo del tratamiento es mantener con vida al gato hasta que se consiga una respuesta inmune capaz de vencer al virus, lo que tardará, de media, 5-7 días. Además, el veterinario puede pautar tratamiento para síntomas concretos. Es fundamental que este se inicie lo antes posible. Cabe destacar que, en la mayoría de casos, es habitual la hospitalización.\n" +
                        "\n" +
                        "En general, estas son las medidas terapéuticas para tratar la panleucopenia en gatos:\n" +
                        "\n" +
                        "Fluidoterapia: la administración de fluidos por vía intravenosa es imprescindible para contrarrestar la deshidratación y restaurar el balance electrolítico normal.\n" +
                        "Transfusión de plasma o sangre: en los casos más graves, con el objetivo de mejorar la anemia y el nivel de los glóbulos blancos.\n" +
                        "Alimentación: si no se consigue que el gato recupere el apetito, tendrá que recurrirse a la alimentación por sonda. Se comercializan dietas hipercalóricas para nutrir a gatos en esta situación.\n" +
                        "Antieméticos: fármacos para controlar los vómitos.\n" +
                        "Antibióticos: pueden emplearse para combatir y controlar infecciones secundarias que aparecen aprovechando la debilidad del organismo.\n" +
                        "Inmunomoduladores: como el interferón omega felino. Aunque no hay estudios realizados con gatos, los resultados en perros con parvovirus han sido positivos.\n" +
                        "Calor: aunque la panleucopenia felina suele dar fiebre, los gatos muy deshidratados pueden presentar hipotermia. Hay que mantener la temperatura corporal.\n" +
                        "Recuerda que el veterinario es la única persona capacitada para prescribir un tratamiento. Una vez en casa, se recomienda mantener al gato enfermo completamente aislado y seguir unas estrictas medidas de higiene si hay otros gatos en el hogar.");

            }
        });

        //insuficiencia renal
        eg3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                descripcion.setVisibility(View.VISIBLE);
                sintomas.setVisibility(View.VISIBLE);
                cuidado.setVisibility(View.VISIBLE);

                tv1.setText("La insuficiencia renal se produce cuando uno o ambos riñones fallan. No es una enfermedad específica, sino un síndrome que disminuye la funcionalidad de los riñones. El sistema renal desempeña un papel muy importante en el organismo, ya que se encarga de filtrar la sangre y eliminar las sustancias de desecho a través de la orina. Cuando los riñones empiezan a fallar suelen ir compensándose hasta que el daño está tan avanzado que aparecen los síntomas, que se deben a la acumulación de sustancias tóxicas. Por eso, a veces, al llegar al veterinario el gato está ya muy enfermo. La enfermedad lleva meses e incluso años gestándose. De ahí que se recomiende hacer analíticas de sangre y de orina al menos una vez al año en los gatos a partir de siete años, aproximadamente.");

                tv2.setText("El fallo de los riñones provoca distintos síntomas que podemos detectar, aunque, en un inicio, al resultar inespecíficos o leves, pueden pasarnos inadvertidos. Por eso, para facilitar su identificación, vamos a diferenciarlos según la insuficiencia sea aguda o crónica. Así, estos son los signos que se pueden detectar si nuestro gato sufre insuficiencia renal aguda:\n" +
                        "\n" +
                        "Depresión.\n" +
                        "Deshidratación, lo podemos comprobar fácilmente tomando entre dos dedos un pliegue de piel en la zona de la cruz y levantándolo. Lo que tarde en volver la piel a su posición indica el grado de deshidratación.\n" +
                        "Anorexia.\n" +
                        "Aumento en la cantidad de orina eliminada o, al contrario, el gato deja de orinar. Estos tienen un peor pronóstico.\n" +
                        "Vómitos.\n" +
                        "Descenso de la temperatura.\n" +
                        "Diarrea.\n" +
                        "Signos a nivel neurológico.\n" +
                        "Detectar cualquiera de estos síntomas es motivo para acudir al veterinario de forma urgente. De lo contrario, el gato puede morir. Por su parte, los signos clínicos que pueden hacernos sospechar de una insuficiencia renal crónica van empeorando con el tiempo y son los siguientes:\n" +
                        "\n" +
                        "Aumento en el consumo de agua.\n" +
                        "Incremento en la eliminación de orina.\n" +
                        "Deshidratación.\n" +
                        "Anorexia.\n" +
                        "Vómitos.\n" +
                        "Depresión.\n" +
                        "Mal aspecto del manto.\n" +
                        "Anemia.\n" +
                        "Hipertensión.\n" +
                        "Adelgazamiento.\n" +
                        "Halitosis, es decir, mal olor en el aliento.\n" +
                        "Heridas en la boca.\n" +
                        "Debilidad.");

                tv3.setText("El tratamiento de la enfermedad renal se basa en la medicación para controlar la sintomatología y en pautar una dieta específica. La alimentación y la hidratación son aspectos clave, así como el seguimiento del veterinario, que nos marcará revisiones periódicas para controlar la evolución de la enfermedad.\n" +
                        "\n" +
                        "En esta patología la comida debe considerarse un medicamento más, por eso hay que recurrir a dietas formuladas específicamente para estos gatos. Como mantener al gato hidratado es fundamental, se recomienda dar alimento húmedo. Un gato deshidratado no come. Si el gato solo acepta el pienso podemos dárselo humedecido o complementarlo con dieta húmeda. En cualquier caso, sigue los consejos del veterinario, pues es perjudicial tanto un exceso como una carencia de proteínas y también hay que controlar el aporte de fósforo. Ten en cuenta que no es extraño que estos gatos se muestren inapetentes. En estos casos es más importante que coman lo que sea, aunque no sea lo más adecuado, antes de que permanezcan en ayunas. Además del alimento, ponle agua limpia y fresca en varios puntos, utiliza fuentes si prefiere el agua en movimiento, ofrécele caldos y reparte la ración diaria en varias tomas, ya que se ha comprobado que les hace beber más.\n" +
                        "\n" +
                        "Por otra parte, si tu gato padece insuficiencia renal aguda, al tratarse de una urgencia, lo primero es estabilizarlo. Para ello suele ser imprescindible ingresarlo en el centro veterinario para administrarle fluidos y fármacos por vía intravenosa.");

            }
        });


        //inmunodeficiencia
        eg4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                descripcion.setVisibility(View.VISIBLE);
                sintomas.setVisibility(View.VISIBLE);
                cuidado.setVisibility(View.VISIBLE);

                tv1.setText("El virus de la inmunodeficiencia afecta a las células del sistema inmunológico (glóbulos blancos o leucocitos) destruyéndolos o dañándolos. Esto causa un deterioro gradual de la función inmunológica del gato. En la fase temprana de la infección puede no causar signos aparentes de enfermedad. El sistema inmune es muy importante en la lucha frente a las infecciones y el control del cuerpo sobre las células cancerosas. Así los gatos infectados por FIV presentan un alto riesgo de enfermedad y de infecciones por otros virus, bacterias y parásitos como Toxoplasma gondii o hemoplasmas(parásitos sanguíneos que causa anemia).");

                tv2.setText("Los signos de la infección por FIV son altamente inespecíficos. Durante la primera fase de la enfermedad (los primeros 2-4 meses) los gatos pueden mostrar signos durante corto tiempo incluyendo malestar, fiebre (temperatura alta) y un posible aumento de tamaño de los ganglios linfáticos o linfadenopatía (las glándulas que filtran la sangre del cuerpo para comprobar si hay infección o células tumorales). La mayoría de los gatos se recuperan de esa fase temprana y entran en la segunda fase en la que están aparentemente sanos. En la tercera fase de la infección se desarrollan otros signos por el efecto directo del virus (por ejemplo, puede infectar el tracto gastrointestinal lo que causa diarrea) y por la depresión del sistema inmunológico y la incapacidad del gato para luchar contra otras infecciones, haciéndole propenso a otras enfermedades o infecciones secundarias. Estos estados pueden tomar diferentes formas y por tanto los signos clínicos ser muy variables. Sin embargo la presencia de una enfermedad persistente o recurrente en el gato, indica una posible inmunodeficiencia. Los signos más comunes son malestar, pérdida de peso, inapetencia, fiebre, linfadenopatía y gingivitis (encías inflamadas). Otros signos adicionales son rinitis (inflamación del tejido interno que recubre la nariz causando estornudo y descarga nasal), infección de piel, anemia, conjuntivitis (inflamación de la zona interna del párpado), uveítis (inflamación de las estructuras internas del ojo) y enfermedades del sistema nerviosos que causan cambios de comportamiento y convulsiones (ataques). Las madres infectadas pueden abortar la camada.");

                tv3.setText("Hasta hoy no hay tratamiento que produzca una remisión de una infección ya establecida.\n" +
                        "El principal objetivo del tratamiento para un gato infectado por FIV es estabilizar al paciente y mantenerlo con una buena calidad de vida. Aunque no están registrados para su uso en gatos, algunos medicamentos antivirales usados en pacientes con VIH (como la azidotimidina, AZT), han dado  resultados en algunos gatos infectados.\n" +
                        "El interferón es un compuesto que interfiere con la replicación del virus y ha recibido mucha atención recientemente en el tratamiento de muchas infecciones virales. El interferón recombinante omega felino es el primer interferón disponible para uso veterinario en Europa y tiene propiedades antivirales e inmunomoduladoras (ajusta la respuesta inmune). Hasta hoy no hay estudios científicos completos sobre la efectividad de este producto pero de forma anecdótica hay algunos artículos con resultados positivos en su utilidad en el tratamiento de gatos infectados, lo que parece prometedor.\n" +
                        "El aceite de prímula (550 mg una vez al día) usado en gatos positivos levemente afectados o asintomáticos puede dar lugar a algunas mejorías como el incremento del peso corporal y el aumento en el contaje de células sanguíneas. Muchas veces se comercializa junto con vitaminas y ácidos grasos que contribuyen a mejorar la condición física del gato.\n" +
                        " Un cuidado rápido y efectivo de las infecciones secundarias es esencial en un gato positivo a FIV que está enfermo. Como esos gatos están inmunodeprimidos, se necesita a menudo un tratamiento con antibióticos más prolongado.");

            }
        });


        //otitis
        eg5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                descripcion.setVisibility(View.VISIBLE);
                sintomas.setVisibility(View.VISIBLE);
                cuidado.setVisibility(View.VISIBLE);

                tv1.setText("La otitis es la inflamación del epitelio que recubre el conducto auditivo y del pabellón auricular. Esta inflamación suele causar dolor y pérdida de audición temporal entre otras cosas.\n" +
                        "Este problema ótico suele darse mucho cuando los felinos están con las defensas bajas por algún motivo. Está comprobado que las épocas del año en las que más se da la otitis son primavera y verano debido al aumento de la temperatura y de la humedad del ambiente. El contagio de algunos posibles responsables de la otitis como los ácaros del oído, se da por contacto directo con una zona o animal infestado. En los refugios, en criaderos, en las zonas en las que hay colonias de gatos controladas y en general en cualquier área en la que convivan gran número de gatos se da con mucha frecuencia este contagio por contacto directo, pues el control constante de todos y en todos los aspectos de su salud siempre es muy difícil. La otitis puede darse sin haber contagio, es decir que se da de forma secundaria a un traumatismo o a una infección bacteriana o fúnigca debido a un cuerpo extraño, entre más causas.");

                tv2.setText("Los signos y síntomas que presentará nuestro felino en caso de otitis dependerán y variarán, sobre todo en el grado de intensidad de éstos, del origen causante de la otitis. Los síntomas que reconoceremos son:\n" +
                        "\n" +
                        "Frecuentes sacudidas de la cabeza.\n" +
                        "Inclinación de la cabeza. Si se da solo hacia un lado, esto indica otitis unilateral que suele ser producida por la presencia de un cuerpo extraño en ese oído. En caso de molestarle los dos oídos irán alternando el lado según les moleste más uno u otro.\n" +
                        "Dolor en la zona cuando les acariciamos. Suelen quejarse y maullar mucho e incluso gritar debido al dolor.\n" +
                        "Prurito que puede ir de moderado a severo.\n" +
                        "Debido al prurito se rascan y se frotan las orejas y el cuello muy frecuentemente hasta llegar a producirse heridas en la zona.\n" +
                        "Zona de las orejas enrojecida e hinchada.\n" +
                        "Irritación, exudación y piodermas de toda la zona afectada.\n" +
                        "Mal humor e incluso agresividad, nulas ganas de jugar y puede llegar a suceder que dejen de comer debido a las grandes molestias y dolor que pueden estar teniendo.\n" +
                        "Abundante cerumen oscuro en los oídos.\n" +
                        "Pérdida de audición.\n" +
                        "Mal olor en los oídos.\n" +
                        "Pérdida de pelo en las zonas afectadas por el excesivo rascado producido por el prurito.\n" +
                        "Presencia de ácaros en los oídos. En caso de presentar una infestación de ácaros muy severa, se debe tener en cuenta que puede tratarse de un caso de defensas demasiado bajas debido al VIF (virus de inmunodeficiencia felina).\n" +
                        "Otohematoma: Problema derivado del excesivo rascado y la continua agitación de la cabeza. Los otohematomas son acumulación de sangre en el pabellón auricular y aparecen en la superficie cóncava de éste, entre el cartílago y la piel o dentro del cartílago, cuando se rompen los capilares sanguíneos. Externamente se observa como una bola en la oreja, que molesta mucho al animal y está muy caliente. La única solución es la cirugía.\n" +
                        "Es de vital importancia para el resultado de la salud de nuestro compañero que en seguida que detectemos uno solo de estos síntomas acudamos a nuestro veterinario de confianza para que lo revise y nos aconseje.");

                tv3.setText("Existen gotas o limpiadores óticos, pero debido a que los felinos son muy sensibles a las medicaciones y a los productos en general, sean químicos o naturales, debemos utilizar uno que nos haya recetado expresamente nuestro veterinario de confianza y nunca uno que veamos en la tienda de animales y nos parezca bien. Sobre todo, nunca debemos utilizar un producto para perros que no esté indicado expresamente para gatos, ya que este tipo de sustancias que producen irritaciones son también una causa importante de otitis en nuestros gatos. Además, en caso de ser ejemplares de pelo largo, podemos pedir al veterinario que de vez en cuando les recorte los pelos de las orejas para evitar la acumulación de suciedad.\n" +
                        "Debemos saber que cuando se le aplican gotas óticas de cualquier tipo en el oído a un animal, éste seguidamente sacudirá la cabeza para expulsarlas del interior de su oído ya que es algo molesto. Pero es muy importante seguir con el tratamiento y dejar que sacudan la cabeza para expulsar más fácilmente la suciedad. Además, aun que aparentemente la otitis se haya curado, debemos acabar el tratamiento como nos indique el especialista y hacerlo durar todo el tiempo que nos diga. Es muy importante alargar una semana más, a partir de que aparentemente esté curada la otitis, para cerciorarnos de que la otitis no reaparezca con facilidad.");

            }
        });


        //conjuntivitis
        eg6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                descripcion.setVisibility(View.VISIBLE);
                sintomas.setVisibility(View.VISIBLE);
                cuidado.setVisibility(View.VISIBLE);

                tv1.setText("La conjuntivitis se trata de la inflamación de la mucosa del ojo, es decir, de la membrana que lo recubre y del interior de los párpados. Puede darse por diversos motivos y los síntomas son muy claros, por lo que es fácil detectarla en nuestros felinos. La conjuntivitis puede ser un síntoma de otra enfermedad más grave, por lo que aunque podamos tratar la conjuntivitis en casa con algunos remedios, deberemos llevar a nuestro compañero al veterinario para detectar o descartar una enfermedad secundaria.");

                tv2.setText("Esta afección ocular puede detectarse fácilmente por sus síntomas más comunes, como:\n" +
                        "\n" +
                        "Irritación de la conjuntiva ocular, es decir, enrojecimiento de los ojos y de sus mucosas (parte interna de los párpados).\n" +
                        "Mucho lagrimeo constante que llega a producir la hinchazón de los ojos.\n" +
                        "Abundante secreción ocular espesa (exceso de legañas), a veces amarillenta o verdosa.\n" +
                        "Aparación del tercer párpado sobresale debido a la hinchazón.\n" +
                        "Ojos cerrados o dificultad para abrirlos por la hinchazón y secreciones.\n" +
                        "Picor en los ojos, rascado y aumento de lavado con las patas.\n" +
                        "En casos avanzados, puede llegar a darse opacidad en la córnea.\n" +
                        "Otros síntomas en casos muy duraderos son los cambios en el color y la forma del iris.");

                tv3.setText("Si identificas alguno de los síntomas anteriormente mencionados en tu compañero gatuno no dudes en llevarlo al veterinario, ya que puede ser una simple conjuntivitis por problemas leves o bien un síntoma más de una enfermedad realmente grave.\n" +
                        "\n" +
                        "Una vez que el especialista nos prescriba un tratamiento adecuado, seguro que también nos recomienda que, además de medicación, le hagamos en casa algunas curas. De esta forma, no podemos indicar cómo curar la conjuntivitis felina definitivamente, puesto que si no tratamos la causa subyacente la afección ocular no dejará de aparecer, pero sí podemos recomendar cómo limpiar los ojos y qué productos utilizar.");

            }
        });


        //rabia
        eg7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                descripcion.setVisibility(View.VISIBLE);
                sintomas.setVisibility(View.VISIBLE);
                cuidado.setVisibility(View.VISIBLE);

                tv1.setText("La rabia felina es una enfermedad infecciosa viral que puede afectar a todos los mamíferos y que está causada por un virus de la familia Rhabdoviridae. Es una patología grave, pues provoca la muerte del animal infectado, afectando al sistema nervioso central causando encefalitis aguda. Se trata, además, de una enfermedad zoonótica, es decir, que puede contagiarse al ser humano, al margen de otros animales, como los perros o los conejos");

                tv2.setText("Los síntomas de la rabia en gatos son variables y no todos los gatos presentan los mismos. No obstante, los más habituales y que pueden mostrarnos cómo saber si un gato tiene rabia son los siguientes:\n" +
                        "\n" +
                        "Maullidos anómalos\n" +
                        "Comportamiento atípico\n" +
                        "Irritabilidad\n" +
                        "Exceso de salivación (babeo)\n" +
                        "Fiebre\n" +
                        "Vómitos\n" +
                        "Pérdida de peso y apetito\n" +
                        "Aversión al agua\n" +
                        "Convulsiones\n" +
                        "Parálisis");

                tv3.setText("Lamentablemente, la rabia no tiene tratamiento. Actúa de manera rápida y es letal para los gatos, por este motivo, si tu gato ha sido infectado, lo primero que hará tu veterinario será aislarlo para evitar que contagie a otros felinos o animales. Dependiendo del avance de la enfermedad, eutanasiar al gato es la única opción.\n" +
                        "\n" +
                        "Debido a que la rabia felina no tiene cura, es muy importante la prevención, puesto que es la única manera de proteger a nuestros gatos frente a esta enfermedad. Presta especial atención a tu gato si sale de casa y está en contacto con otros animales. Recuerda que la rabia afecta a los perros, gatos, hurones, murciélagos y zorros. Cualquier pelea de tu gato con estos animales puede causarle un contagio\n" +
                        "La vacuna antirrábica es el único método de prevención real de la rabia. La primera dosis se aplica a los tres meses de edad y luego se aplican refuerzos anuales. De forma general, se vacuna de forma periódica a los perros pero no a los gatos, por ello debes considerar si tu gato está expuesto a zonas de riesgo o si entra en contacto con animales salvajes. Si es así, lo más conveniente es seguir el calendario de vacunación felino.");

            }
        });


        //peritonitis
        eg8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                descripcion.setVisibility(View.VISIBLE);
                sintomas.setVisibility(View.VISIBLE);
                cuidado.setVisibility(View.VISIBLE);

                tv1.setText("La peritonitis infecciosa felina (PIF) es una enfermedad infecciosa grave, debilitante, progresiva y en la mayoría de casos mortal, que afecta a los felinos silvestres y domésticos. Se trata de un proceso de origen vírico y de distribución mundial que posee un gran componente inmunitario.\n" +
                        "\n" +
                        "La incidencia de esta enfermedad es superior en gatitos de menos de 2 años de edad y en los mayores de 12 años, especialmente los de pura raza de criaderos o los que viven en colectividades, por una mayor posibilidad de contagio del virus que la causa.\n" +
                        "\n" +
                        "Este virus, produzca o no en algún momento la enfermedad de la peritonitis, afecta al aparato digestivo en los gatos.");

                tv2.setText("La sintomatología común a la forma seca y la húmeda de la PIF son síntomas inespecíficos: fiebre, depresión, anorexia fluctuante, palidez de las mucosas o ictericia, adelgazamiento progresivo y retraso en el crecimiento de los gatitos.");

                tv3.setText("Lamentablemente a día de hoy sigue siendo una enfermedad con muy mal pronóstico que no se cura, aunque ha habido casos de remisión, especialmente de la forma seca.\n" +
                        "\n" +
                        "La terapia se basa en un tratamiento sintomático que consiste en:\n" +
                        "\n" +
                        "Alimentación rica en proteínas.\n" +
                        "Administración de enzimas proteolíticas.\n" +
                        "Complejos vitamínicos (A, B, C, E).\n" +
                        "Drenaje de efusiones pleurales si se compromete la capacidad respiratoria.\n" +
                        "Fluidoterapia para reposición de líquido.\n" +
                        "Inyección de dexametasona en la cavidad abdominal o torácica (1 mg/kg cada 24 horas hasta que ya no se produzca el derrame, hasta siete días; si hay derrame en ambos cavidades, la dosis por cavidad debe dividirse).\n" +
                        "Antibióticos de cobertura.\n" +
                        "Prednisolona y ciclofosfamida para disminuir la gravedad de los complejos inmunes y la vasculitis deprimiendo el sistema inmune humoral.\n" +
                        "Interferón omega recombinante felino (FelFN-w) como potenciador de la respuesta inmune celular.");

            }
        });


        //cistitis
        eg9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                descripcion.setVisibility(View.VISIBLE);
                sintomas.setVisibility(View.VISIBLE);
                cuidado.setVisibility(View.VISIBLE);

                tv1.setText("La cistitis es una enfermedad que provoca inflamación de la vejiga urinaria, por lo que es muy similar a la cistitis humana. Puede estar provocada por diferentes causas, pero las consecuencias son las mismas. Causa problemas a la hora de orinar, provoca dolor y puede poner muy nervioso al gato que la padece. Así mismo, acude al arenero una y otra vez pero apenas orina. Por todo ello, es importante acudir al veterinario en cuanto observemos los primeros síntomas.\n" +
                        "\n" +
                        "La cistitis felina es una enfermedad común que con los cuidados adecuados se puede superar, pero si surgen complicaciones puede provocar grandes problemas. Si se produce una obstrucción de la uretra y no se trata, provocará la muerte del animal.");

                tv2.setText("Al principio puede ser difícil determinar los síntomas de la cistitis felina. Pero, a medida que avanza, nuestro gato mostrará de forma más evidente los indicios de esta enfermedad. Por eso es importante observar a tu gato en cuanto se comporte de manera extraña. Cuanto antes actuemos, mejor.\n" +
                        "\n" +
                        "Los síntomas de la cistitis más comunes en gatos son los siguientes:\n" +
                        "\n" +
                        "Dolor al orinar: maúlla o muestra signos de dolor al internar orinar.\n" +
                        "Se lame la zona genital más de lo habitual.\n" +
                        "Polaquiuría: orina muchas veces pero pequeñas cantidades, a veces solo unas gotas.\n" +
                        "Disuria: orina con esfuerzo.\n" +
                        "Orina fuera del cajón.\n" +
                        "Si observas que tu gato no orina nada en absoluto puede tratarse de una obstrucción de la uretra. Se produce por la formación de cristales en la uretra, y suele ocurrir con más frecuencia en gatos machos. Cuando esto sucede, tu gato, aunque lo intente y haga esfuerzo, no consigue orinar nada. En estos casos debes acudir de inmediato a tu veterinario.");

                tv3.setText("En cuanto lleves a tu gato al veterinario, este le realizará un análisis de sangre y orina para determinar el origen de la cistitis.\n" +
                        "\n" +
                        "Si se trata de una infección bacteriana o vírica será tratada con antibióticos. Respeta la duración del tratamiento que aconseje el veterinario y no mediques a tu gato por tu cuenta. Es muy importante no dejar el tratamiento a medias, aunque nuestro gato ya se encuentre bien. Si la infección no se cura bien pueden producirse recaídas.\n" +
                        "\n" +
                        "Durante este periodo debes cuidar la alimentación de tu gato y mantenerlo hidratado hasta que se recupere.");

            }
        });



    }
}