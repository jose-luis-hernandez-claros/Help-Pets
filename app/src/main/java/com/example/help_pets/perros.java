package com.example.help_pets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class perros extends AppCompatActivity {


    private TextView tv1,tv2,tv3,descripcion,sintomas,cuidado,representacion;
    private  Button ep1,ep2,ep3,ep4,ep5,ep6,ep7,ep8,ep9,ep10,ep11,ep12;
    private ImageView botonrepresentacion;
/*

    private  String enfermedades [] = {"Parviovirus","Moquillo","Artrosis","Otitis","Leishmaniosis","Gusano del corazon","Tos de las perreras","Problemas urinarios","Problemas digestivos",
            "Problemas de piel","Hepatitis","Rabia"};
*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perros);

        ep1 = (Button)findViewById(R.id.ep1);
        ep2 = (Button)findViewById(R.id.ep2);
        ep3 = (Button)findViewById(R.id.ep3);
        ep4 = (Button)findViewById(R.id.ep4);
        ep5 = (Button)findViewById(R.id.ep5);
        ep6 = (Button)findViewById(R.id.ep6);
        ep7 = (Button)findViewById(R.id.ep7);
        ep8 = (Button)findViewById(R.id.ep8);
        ep9 = (Button)findViewById(R.id.ep9);
        ep10 = (Button)findViewById(R.id.ep10);
        ep11 = (Button)findViewById(R.id.ep11);
        ep12 = (Button)findViewById(R.id.ep12);

        tv1 = (TextView)findViewById(R.id.tv1);
        tv2 = (TextView)findViewById(R.id.tv2);
        tv3 = (TextView)findViewById(R.id.tv3);
        descripcion = (TextView)findViewById(R.id.Descripcion);
        sintomas = (TextView)findViewById(R.id.Sintomas);
        cuidado = (TextView)findViewById(R.id.Cuidado);
//        representacion = (TextView)findViewById(R.id.representacion);
//        botonrepresentacion = (ImageView)findViewById(R.id.botonrepresentacion);

        
        //parviovirus
        ep1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                descripcion.setVisibility(View.VISIBLE);
                sintomas.setVisibility(View.VISIBLE);
                cuidado.setVisibility(View.VISIBLE);
//                representacion.setVisibility(View.VISIBLE);
//                botonrepresentacion.setVisibility(View.VISIBLE);
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
//                botonrepresentacion.setImageResource(R.drawable.parviovirus);
            }
        });


        //moquillo
        ep2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                descripcion.setVisibility(View.VISIBLE);
                sintomas.setVisibility(View.VISIBLE);
                cuidado.setVisibility(View.VISIBLE);

                tv1.setText("El moquillo canino, conocido también como distemper canino o enfermedad de Carré es un virus perteneciente al género Morbillivirus, " +
                        "de la familia de los Paramixovirus. Es una enfermedad infecciosa de tipo viral extremadamente contagiosa que afecta a canes domésticos." +
                        " El contagio del moquillo canino se produce cuando un animal sano entra en contacto con partículas virales que se encuentran en el ambiente, en forma de aerosol. " +
                        "Está estrechamente relacionado con el virus del sarampión y la peste bovina.");

                tv2.setText("Una vez han pasado entre 3 y 6 días tras el contagio, empezamos a observar los primeros signos de esta enfermedad los cuales son:" +
                        "Fiebre\n" +
                        "Pérdida del apetito\n" +
                        "Decaimiento en general\n" +
                        "Pérdida de peso\n" +
                        "Deshidratación\n" +
                        "Descarga nasal\n" +
                        "Tos\n" +
                        "Dificultad para respirar\n" +
                        "Ojos enrojecidos\n" +
                        "Conjuntivitis\n" +
                        "Queratitis seca\n" +
                        "Úlcera de córnea\n" +
                        "Vómitos\n" +
                        "Diarreas\n" +
                        "Endurecimiento de las almohadillas\n" +
                        "Erupciones de la piel\n" +
                        "Ataxia\n" +
                        "Movimientos involuntarios de músculos\n" +
                        "Convulsiones\n" +
                        "Apoplejía");

                tv3.setText("Ante la aparición de uno o más síntomas acudiremos al veterinario, quien confirmará o descartará el diagnóstico del moquillo en los perros. Puede prescribir el uso de antibióticos de amplio espectro, " +
                        "antipiréticos, analgésicos, anticonvulsivos, soluciones electrolíticas, nutrición específica y ciertos cuidados. Cuanto antes se detecte la enfermedad y se empiece el tratamiento, mejor será el pronóstico." +
                        " En los casos más graves se valorará además la hospitalización del perro en el hospital veterinario para administrar suero y fármacos por vía intravenosa.\n" +
                        "\n" +
                        "Es importante destacar que ningún tratamiento para el moquillo en perros es exitoso en el 100% de los casos. Así mismo, cuando el perro presenta signos neurológicos graves y progresivos, " +
                        "debemos saber que el pronóstico puede ser desfavorable. En otros casos, los signos persistirán tras la recuperación.");

            }
        });


        //artrosis
        ep3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                descripcion.setVisibility(View.VISIBLE);
                sintomas.setVisibility(View.VISIBLE);
                cuidado.setVisibility(View.VISIBLE);

                tv1.setText("La artrosis es una enfermedad degenerativa y progresiva de las articulaciones, más frecuente en los perros de mayor edad. " +
                        "No sé sabe por qué aparece la artrosis, pero sí que se conocen procesos que van a terminar generándola, por ejemplo, un traumatismo o el inevitable envejecimiento. La artrosis puede aparecer en cualquier articulación del cuerpo." +
                        " Así, aunque es más normal en las extremidades, también afecta a otras articulaciones como las de la columna vertebral.");

                tv2.setText("Los síntomas van a depender de las articulaciones afectadas y de la importancia de esa afectación. Sobre todo se manifiesta en cadera, rodillas, hombros y codos. Lo habitual es que el perro sienta dolor al mover la articulación o si se la manipulamos. Puede haber inflamación y, en ocasiones, incluso percibiremos un sonido semejante a un chasquido.\n" +
                        "\n" +
                        "Puesto que los síntomas pueden ser confusos, ¿cómo saber si un perro tiene artrosis? El signo que observaremos suele ser una cojera, especialmente evidente cuando el perro se levanta o comienza a andar. Cojea por dolor y, por eso mismo, quizá el primer síntoma que percibamos es que disminuye su actividad, sobre todo en lo relativo a correr y saltar. El cuadro clínico irá empeorando progresivamente." +
                        " Un perro con mucho dolor puede reaccionar con agresividad al manipularlo. Una menor movilidad implica la pérdida de masa muscular, lo que empeora la sintomatología.");

                tv3.setText("La artrosis es una enfermedad degenerativa irreversible y progresiva, es decir, no es posible su curación, aunque sí podremos tratar para, en lo posible, controlar su avance. Al tratarse de una patología sobre todo asociada al envejecimiento, la prevención tan solo puede enfocarse hacia el mantenimiento de una buena condición corporal, con una alimentación y una actividad física adecuadas.\n" +
                        "El tratamiento veterinario minimiza el dolor que va a sentir el perro con artrosis. Y este es el objetivo más importante, ya que es el punto clave para asegurar su bienestar todo lo posible\n" +
                        "Además del tratamiento farmacológico, ortopédico, el control de la alimentación o el ejercicio, existen opciones como la fisioterapia o la acupuntura. Hay que tener claro que tampoco van a curar la artrosis en perros, pero sí mejoran considerablemente la calidad de vida del animal al controlar el dolor y facilitar la movilidad. Eso sí, son técnicas que siempre deben aplicar profesionales.");

            }
        });


        //otitis
        ep4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                descripcion.setVisibility(View.VISIBLE);
                sintomas.setVisibility(View.VISIBLE);
                cuidado.setVisibility(View.VISIBLE);

                tv1.setText("La otitis supone una inflamación del conducto auditivo externo que puede afectar o no a la membrana timpánica y verse acompañada o no de infección. Para su curación es básico identificar la causa que la produce, ya que, de no descubrirla o, directamente, no tratarla, podría cronificarse.");

                tv2.setText("La otitis externa es la inflamación del conducto auditivo externo, en su tramo vertical y horizontal, pudiendo afectar a la bulla timpánica. Los síntomas van a depender de la gravedad y son los siguientes:\n" +
                        "\n" +
                        "Eritema auricular, es decir, enrojecimiento del interior de la oreja por un aumento de sangre en la zona.\n" +
                        "Sobre todo, agitación de la cabeza y rascado.\n" +
                        "Dolor en la zona.\n" +
                        "Si hay infección asociada habrá secreción.\n" +
                        "En los casos de otitis ex");

                tv3.setText("El tratamiento, que siempre debe prescribir el veterinario tras el examen otoscópico y la citología, de ser el caso, se dirige a controlar la inflamación del conducto y a eliminar las infecciones si las hay. Para ello, se da preferencia a la medicación local, es decir, aplicada directamente en el conducto, ya que tendrá menor riesgo de efectos secundarios que el tratamiento sistémico y será más concentrado.\n" +
                        "\n" +
                        "La excepción al tratamiento anterior la suponen los perros con lesiones en el conducto o en los que no es posible el tratamiento tópico. El veterinario tiene que revisar el oído a los 7-15 días para ver si la curación ha sido completa");

            }
        });


        //leishmaniosis
        ep5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                descripcion.setVisibility(View.VISIBLE);
                sintomas.setVisibility(View.VISIBLE);
                cuidado.setVisibility(View.VISIBLE);

                tv1.setText("La leishmaniasis en perros una enfermedad parasitaria que se encuentra en expasión y que, al tratarse de una zoonosis, es decir, de una enfermedad que puede afectar a las personas, es imprescindible conocer para poder adoptar las medidas preventivas adecuadas, pues siempre es mejor evitar una enfermedad antes que curarla.");

                tv2.setText("Tras un período de incubación muy variable, un perro enfermo manifestará síntomas como los siguientes:\n" +
                        "\n" +
                        "Pérdida de pelo alrededor de los ojos, las orejas y la nariz.\n" +
                        "El pelo restante se verá fino y mate.\n" +
                        "Con leishmaniasis avanzada en los perros apreciaremos adelgazamiento, a pesar de estar comiendo con normalidad.\n" +
                        "Aumento del tamaño de los ganglios.\n" +
                        "Sobrecrecimiento de las uñas.\n" +
                        "Heridas que no cicatrizan, sobre todo en zonas de contacto y rodeando los ojos, que pueden presentar conjuntivitis.\n" +
                        "Letargo.\n" +
                        "Cojera.\n" +
                        "Dolor articular.\n" +
                        "Hemorragia nasal.\n" +
                        "Hiperqueratosis, es decir, engrosamiento de la piel en nariz y dedos.\n" +
                        "En la leishmaniasis crónica es habitual que aparezca insuficiencia renal, trastornos digestivos o hepáticos.\n" +
                        "Hay que saber que algunos perros están infestados por el parásito pero no manifiestan síntomas, lo que quiere decir que pueden ser fuente de contagio sin que sepamos que están enfermos. Por ello, se recomienda analizar a todos los perros que vivan en zonas de riesgo para saber si son o no portadores de la Leishmania.");

                tv3.setText("Lo primero que quiere saber un cuidador en estos casos es si la leishmaniasis en perros se cura. Pues bien, tenemos que saber que, si no se trata, el perro probablemente fallecerá. Además, los tratamientos disponibles se dirigen a suprimir los síntomas, pero no a eliminar el parásito. Aun así, los perros enfermos deben recibir medicación para mejorar su calidad de vida, al paliar los signos clínicos, y, muy importante, porque disminuye el riesgo de transmisión. El tratamiento puede prescribirse de por vida y se marcan, además, controles periódicos. Otros perros se tratan varias semanas pero, como no se elimina el parásito, pueden darse recaídas. En estos casos, habrá que repetir el tratamiento en cuanto aparezcan los síntomas.\n" +
                        "\n" +
                        "Para tratar la leishmania en perros se utilizan varios fármacos combinados que dificultan la reproducción del parásito. Suelen administrarse de manera oral o inyectable. Es importante que si detectamos cualquiera de los síntomas antes descritos acudamos al veterinario, ya que un tratamiento precoz mejora el pronóstico considerablemente.\n" +
                        "\n" +
                        "La evolución de los tratamientos ha ayudado a que los perros afectados permanezcan más tiempo sin síntomas ni recaídas. Esto quiere decir que, no existe una cura definitiva para la leishmaniosis en perros, pero los canes infectados puede tener una buena calidad de vida, y vivir durante muchos años, si reciben el adecuado tratamiento.");

            }
        });


        //gusano del corazon
        ep6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                descripcion.setVisibility(View.VISIBLE);
                sintomas.setVisibility(View.VISIBLE);
                cuidado.setVisibility(View.VISIBLE);

                tv1.setText("El gusano del corazón o dirofilariosis canina es una enfermedad que pueden padecer los perros, otros animales domésticos como gatos y hurones, e incluso las personas. Suele transmitirse mediante flebótomos(Insectos) infectados, que actúan como vectores de esta patología, y se considera una de las enfermedades parasitarias más graves y comunes en los canes.\n" +
                        "Consiste en una enfermedad parasitaria provocada por un nematodo denominado Dirofilaria immitis, el cual parasita principalmente el corazón y las arterias pulmonares de los perros a través del riego sanguíneo. Suelen acumularse en el ventrículo derecho y en los vasos sanguíneos de los pulmones, donde se desarrollan hasta alcanzar los 15 o 30 cm de longitud.");

                tv2.setText("Los individuos que han sido infestados pueden ser asintomáticos, es decir, que no presenten señales evidentes provocadas por esta patología. Este es precisamente el motivo por el que suele detectarse la enfermedad del gusano del corazón cuando ya está en estado avanzado.\n" +
                        "\n" +
                        "Los síntomas de dirofilariosis en perros más comunes son:\n" +
                        "\n" +
                        "Cansancio generalizado\n" +
                        "Intolerancia al ejercicio\n" +
                        "Aumento del ritmo cardíaco\n" +
                        "Tos blanda y dificultad para respirar\n" +
                        "Hemorragias nasales\n" +
                        "Sangrados orales\n" +
                        "Apatía y depresión\n" +
                        "Pérdida de peso\n" +
                        "Desmayos\n" +
                        "Anorexia (el perro no quiere comer)\n" +
                        "Ascitis\n" +
                        "Paro cardíaco\n" +
                        "Es de vital importancia acudir a una clínica veterinaria si observamos cualquiera de los síntomas mencionados anteriormente para poder determinar si la causa se debe a la presencia del gusano del corazón o dirofilariosis canina");

                tv3.setText("El proceso pueda ser complicado en algunos casos, es una enfermedad tratable si se diagnostica de forma pronta y se realiza un tratamiento efectivo para eliminar los gusanos adultos y las larvas. Aun así, cabe recordar que en estados avanzados puede ser muy complicada de tratar y que en algunos casos el fallecimiento del perro es inevitable.\n" +
                        "\n" +
                        "El tratamiento suele ser largo, alargándose varios meses, y generalmente empieza con la administración de medicación para expulsar a las microfilarias y las larvas del organismo, seguida de varias inyecciones para eliminar los gusanos adultos. Posteriormente, cuando esta primera fase del tratamiento ha tenido éxito, se prosigue con una medicación de por vida para prevenir las microfilarias. También puede ser necesario aplicar medicación para paliar los síntomas que experimente el can y fármacos de apoyo para los órganos afectados, incluidos el riñón y el hígado.\n" +
                        "\n" +
                        "Finalmente se deberá proporcionar vitaminas y una alimentación que ayude a fortalecer la salud de nuestro can, además de instaurar de forma permanente un plan preventivo para que no se repita la infestación.");

            }
        });


        //tos de las perreras
        ep7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                descripcion.setVisibility(View.VISIBLE);
                sintomas.setVisibility(View.VISIBLE);
                cuidado.setVisibility(View.VISIBLE);

                tv1.setText("La traqueobronquitis infecciosa canina, más comúnmente conocida como \"la tos de las perreras\", es una patología que afecta al sistema respiratorio y suele desarrollarse en lugares donde conviven una gran cantidad de canes, tales como perreras o criaderos. Este hecho fue el que dio lugar al nombre popular de la afección.\n" +
                        "\n" +
                        "Antiguamente, esta enfermedad se producía únicamente en aquellas perreras o criaderos con inadecuadas condiciones higiénicas. No obstante, con el incremento de protectoras animales, casas de acogida de mascotas abandonadas, paseadores de perros, exposiciones caninas y, en general, de lugares en los que se concentran un gran número de canes, la patología se ha propagado con mayor rapidez debido a su elevado índice de contagio, y no tanto por condiciones inapropiadas. ");

                tv2.setText("Una vez contagiado, el perro empezará a experimentar una serie de síntomas claramente identificables. La manifestación más característica de esta patología es la aparición de una tos seca, ronca, fuerte y constante, provocada por la inflamación de las cuerdas vocales.\n" +
                        "\n" +
                        "En los casos más avanzados, la tos puede ir acompañada de una ligera expectoración de las secreciones depositadas en el sistema respiratorio por los gérmenes patógenos. Dicha expulsión suele confundirse con un vómito leve o cuerpo extraño. En la medida de lo posible, es aconsejable reservar una muestra y llevársela al veterinario para que pueda examinarla. De esta forma, además de analizar el aspecto físico de tu perro, podrá estudiar la secreción expulsada y ofrecer un mejor diagnóstico. Debes saber que estos moderados vómitos no son producidos por problemas estomacales, recordemos que esta enfermedad solo afecta al sistema respiratorio. Se desarrollan por la misma inflamación e irritación de la garganta producida por la tos seca.\n" +
                        "\n" +
                        "El decaimiento, el malestar general, la falta de apetito y de energía son otros de los síntomas de la tos de las perras más comunes. Si observas que tu can presenta alguno de estos indicios, no lo dudes y acude al veterinario rápidamente. Aunque no se trate de una enfermedad de carácter grave, sí requiere tratamiento veterinario para curarla y evitar que empeore.\n" +
                        "\n" +
                        "Y si aparecen infecciones secundarias, es posible que el perro presente fiebre, debilidad, secreción ocular y/o nasal, dificultad para respirar, etc.");

                tv3.setText("Lo primero que debemos hacer es aislar al perro enfermo dentro del hogar, en una habitación solo para él durante siete días como mínimo, o el tiempo que dure el tratamiento. Este paso es imprescindible para evitar que se propague la enfermedad y contagie a canes vecinos.\n" +
                        "\n" +
                        "Una vez aislado, la forma más sencilla de controlar y erradicar la tos de las perreras es mediante antibióticos y antiinflamatorios. En función del estado del perro y el avance de la enfermedad, el veterinario optará por recetarle un tipo de medicamento u otro. Puesto que en el desarrollo de esta patología pueden participar varios agentes víricos, resulta prácticamente imposible determinar un tratamiento médico estándar apto para todos los casos. Lo más recomendable es acudir a tu clínica veterinaria habitual para que sea un especialista quien determine cuál es el mejor tratamiento para curar la tos de las perreras.\n" +
                        "\n" +
                        "En los canes que presenten decaimiento y falta de apetito, deberemos asegurarnos de que ingieran la cantidad de agua mínima estipulada por el veterinario para impedir una deshidratación, diluir las secreciones depositadas en las vías respiratorias y favorecer la ventilación.");

            }
        });


        //problemas urinarios
        ep8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                descripcion.setVisibility(View.VISIBLE);
                sintomas.setVisibility(View.VISIBLE);
                cuidado.setVisibility(View.VISIBLE);

                tv1.setText("Al igual que las personas, los perros son susceptibles a sufrir una infección urinaria. Aunque la mayoría de casos se producen en perras, los machos también pueden padecer este problema. Así mismo, este tipo de infección puede afectar a cualquiera de las estructuras que forman el tracto urinario y debe ser tratado con rapidez para evitar problemas mayores en el futuro.");

                tv2.setText("En muchos casos, los síntomas pueden ser difíciles de detectar y es común que la infección salga a la luz durante una visita al veterinario por causas diferentes. En otros casos, los síntomas son más evidentes. En general, los síntomas más comunes de infección urinaria en perros son:\n" +
                        "\n" +
                        "Aumento de la frecuencia de micción.\n" +
                        "El perro orina poca cantidad y, muchas veces, parece tener molestias al hacerlo.\n" +
                        "El perro hace esfuerzos para orinar, pero no lo consigue o solo logra expulsar muy poca cantidad. En estos casos, puede haber una inflamación de próstata o cálculos renales o uretrales. Es urgente llevar al perro al veterinario.\n" +
                        "Puede tener sensación de querer defecar, pero nunca llegar a hacerlo.\n" +
                        "La orina es turbia.\n" +
                        "La orina presenta mal olor.\n" +
                        "Hay sangre en la orina.\n" +
                        "El perro orina en lugares en los que no acostumbra a hacerlo (por ejemplo, un perro bien educado para ir al baño empieza a orinar dentro de casa).\n" +
                        "Fiebre leve o elevada.\n" +
                        "Pérdida de apetito.\n" +
                        "Depresión y letargo.\n" +
                        "Descarga vaginal en las hembras.\n" +
                        "Inflamación e irritación alrededor de los genitales externos.\n" +
                        "Lamido frecuente del pene o la vulva.\n" +
                        "Inquietud y nerviosismo en casa o durante el paseo.\n" +
                        "Jadeo excesivo, provocado por el malestar y la ansiedad.\n" +
                        "Cambios de humor en el perro.");

                tv3.setText("El tratamiento para las infecciones urinarias bacterianas consiste en la administración de antibióticos. Generalmente, se usan antibióticos de amplio espectro que dan buenos resultados, pero en los casos en los que no funcionan se deben administrar antibióticos específicos para la bacteria causante de la infección. En muchos casos, se utiliza amoxicilina para la infección de orina en perros, que es un antibiótico de amplio espectro, pero debe ser siempre recetado por el especialista.\n" +
                        "\n" +
                        "Es importante administrar el tratamiento antibiótico para la cistitis en perros, o la infección urinaria que padezca, recetado durante todo el tiempo que el veterinario haya indicado, incluso si los síntomas desaparecen antes.");

            }
        });


        //problemas digestivos
        ep9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                descripcion.setVisibility(View.VISIBLE);
                sintomas.setVisibility(View.VISIBLE);
                cuidado.setVisibility(View.VISIBLE);

                tv1.setText("Los trastornos gastrointestinales generalmente afectan el sistema digestivo de tu mascota y la capacidad para digerir y absorber nutrientes. Estos problemas pueden estar causados por factores, como:\n" +
                        "\n" +
                        "Un cambio brusco en la dieta.\n" +
                        "Trauma.\n" +
                        "Comer en exceso.\n" +
                        "Toxinas.\n" +
                        "Alergias.\n" +
                        "Objetos extraños.\n" +
                        "Parásitos.\n" +
                        "Medicamentos.\n" +
                        "Agentes infecciosos.");

                tv2.setText("Los síntomas de problemas digestivos en perros son amplios e incluyen:\n" +
                        "Pérdida de apetito.\n" +
                        "Exceso de gases.\n" +
                        "Vómitos.\n" +
                        "Estreñimiento.\n" +
                        "Diarrea.\n" +
                        "Dificultad para tragar.\n" +
                        "Algunos problemas digestivos del perro se alivian cuando su estómago descansa, pero las condiciones más graves pueden provocar pérdida de peso, deshidratación y debilitamiento. Tu veterinario puede determinar el tratamiento apropiado.");

                tv3.setText("Dependiendo de la gravedad y el tipo de problema, éste puede incluir el manejo de la dieta con un alimento especial para estómagos sensibles caninos, manejo médico o incluso cirugía abdominal.\n" +
                        "\n" +
                        "Si se necesitan pruebas de diagnóstico adicionales, el veterinario puede recomendar análisis de laboratorio, radiografías o un procedimiento como la endoscopia, que consiste en insertar un tubo con una pequeña cámara de video en el tracto digestivo de tu perro.\n" +
                        "\n" +
                        "Dado que muchos trastornos gastrointestinales pueden irritar su estómago e intestino, una dieta fácil de digerir puede ayudar a asegurar que tu perro obtenga el equilibrio de nutrientes necesario para su recuperación..");

            }
        });


        //problemas de piel
        ep10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                descripcion.setVisibility(View.VISIBLE);
                sintomas.setVisibility(View.VISIBLE);
                cuidado.setVisibility(View.VISIBLE);

                tv1.setText("Existen muchas enfermedades de la piel en los perros y, de hecho, forman parte de los motivos de consulta veterinaria más frecuentes. Es importante recurrir desde los primeros signos a la clínica u hospital veterinario porque este tipo de enfermedades, sino se tratan pronto, pueden complicarse y resultar muy molestas para el perro.");

                tv2.setText("Los síntomas más comunes que nos van a indicar que existe algún problema dermatológico. Son los siguientes:\n" +
                        "\n" +
                        "Prurito o rascado.\n" +
                        "Alopecia, es decir, áreas sin pelo.\n" +
                        "Dermatitis, que es, literalmente, la inflamación de la piel.\n" +
                        "Eritema o enrojecimiento de la piel.\n" +
                        "Úlceras o heridas abiertas.\n" +
                        "Pápulas, que son bultos rojos graniformes.\n" +
                        "Pústulas, lesiones con pus en su interior.\n" +
                        "Costras, que son heridas que se han secado.\n" +
                        "Nódulos, bultos, granos o masas, que podremos observar o palpar como protuberancias de diferente tamaño.\n" +
                        "Hiperpigmentación o piel oscura.\n" +
                        "Hiperqueratosis o piel engrosada");

                tv3.setText("Existen muchas opciones de tratamiento porque, como hemos visto, existen causas de diferentes orígenes. El tratamiento puede basarse en eliminar al parásito y prevenir su aparición si lo hay. Desinfectar la piel, limpiar con productos tópicos o champús o administrar antibióticos en el caso de infecciones bacterianas. Corticoides y productos de efecto similar se recetan para reducir la inflamación y el picor.\n" +
                        "\n" +
                        "Los problemas hormonales van a requerir medicación y estrecho seguimiento veterinario. Además, cuando la conducta influye en la enfermedad debemos cambiar las condiciones de vida del perro, acudiendo a un educador canino u etólogo si fuese necesario. Las alergias alimentarias se tratan con una alimentación hipoalergénica. También se recurre a la inmunoterapia. Abscesos y neoplasias pueden necesitar intervención quirúrgica");

            }
        });


        //hepatitis
        ep11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                descripcion.setVisibility(View.VISIBLE);
                sintomas.setVisibility(View.VISIBLE);
                cuidado.setVisibility(View.VISIBLE);

                tv1.setText("Hepatitis es un término que proviene de los vocablos griegos \"hepar\" (hígado) e \"itis\" (inflamación) y que por lo tanto indica una stuación patología en la que el hígado está inflamado, no obstante, la inflamación hepática puede producirse por distintas causas, lo que nos ayudará a diferenciar entre distintos tipos de hepatitis.");

                tv2.setText("Estamos ante una inflamación del hígado, por lo que independientemente de la causa, los síntomas de la hepatitis en perros son los siguientes:\n" +
                        "\n" +
                        "Sed excesiva\n" +
                        "Ictericia (coloración amarillenta de ojos y mucosas)\n" +
                        "Sangre en las mucosas\n" +
                        "Dolor abdominal que puede derivar a inmovilidad\n" +
                        "Fiebre\n" +
                        "Convulsiones por fallo hepático\n" +
                        "Pérdida del apetito\n" +
                        "Aumento de la secreción nasal y ocular\n" +
                        "Vómitos\n" +
                        "Edema subcutáneo\n" +
                        "Un perro con hepatitis no tiene por qué mostrar todos los síntomas expuestos, por lo que ante cualquier signo que indique una posible hepatitis debemos acudir urgentemente al veterinario");

                tv3.setText("El tratamiento de la hepatitis en perros dependerá del factor que haya causado la patología.\n" +
                        "\n" +
                        "En la hepatitis común el tratamiento será sintomático pero también deberá cumplir con el objetivo de modular aquellos factores que han causado el daño hepático.\n" +
                        "En la hepatitis autoinmune el tratamiento también será sintomático aunque el veterinario valorará la posible prescripción de un medicamento inmunomodulador que actúe específicamente sobre el sistema de defensas previniendo el daño hepático.\n" +
                        "En el caso de hepatitis infecciosa o vírica, el tratamiento también es sintomático ya que no existe cura, se pueden emplear antibióticos para controlar infecciones secundarias, soluciones isotónicas para prevenir la deshidratación, protectores hepáticos y dieta hipoproteica.\n" +
                        "Es el veterinario el que debe indicar una dieta hipoproteica, aunque ésta resulta beneficiosa en los tres casos de hepatitis, ya que ante la presencia abundante de proteínas el hígado se sobrecarga. Recuerda que únicamente el veterinario es el profesional capacitado para prescribir cualquier tipo de tratamiento a tu mascota.");

            }
        });


        //rabia
        ep12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                descripcion.setVisibility(View.VISIBLE);
                sintomas.setVisibility(View.VISIBLE);
                cuidado.setVisibility(View.VISIBLE);

                tv1.setText("La rabia en perros o rabia canina es una de las enfermedades infecciosas virales más conocidas, pues se trata de una patología que puede transmitirse a todos los mamíferos, incluyendo el ser humano, al ser una enfermedad zoonótica. Además, los perros son los principales transmisores a nivel mundial.\n" +
                        "\n" +
                        "Este virus de la familia Rhabdoviridae está presente en prácticamente todos los rincones del planeta Tierra, exceptuando en Australia, las islas británicas y en la Antártida. Detectar de forma pronta esta patología es vital para prevenirla y evitar el contagio hacia otros animales, pues la rabia canina es mortal, por este motivo, todos los países toman medidas para prevenirla, contenerla y tratar de eliminarla.");

                tv2.setText("Los síntomas de esta condición afectan principalmente al SNC(Sistema Nervioso Central) y al cerebro, y aunque suelen presentarse las fases que hemos mencionado anteriormente, no siempre se manifiestan todos los síntomas, motivo por el cual es tan importante estar atentos a las señales que indican que nuestro perro pueda estar enfermo.\n" +
                        "\n" +
                        "A continuación te mostramos los síntomas de la rabia en perros más comunes:\n" +
                        "\n" +
                        "Fiebre\n" +
                        "Agresividad\n" +
                        "Irritabilidad\n" +
                        "Apatía\n" +
                        "Vómitos\n" +
                        "Salivación excesiva\n" +
                        "Fotofobia (aversión a la luz)\n" +
                        "Hidrofobia (aversión al agua)\n" +
                        "Dificultad para tragar\n" +
                        "Parálisis del rostro\n" +
                        "Convulsiones\n" +
                        "Parálisis general\n" +
                        "La rabia se confunde fácilmente con otras enfermedades neurológicas y, por ende, siempre es necesario consultar con un veterinario ante la aparición de cualquiera de los síntomas de rabia en perros mencionados, o bien si sospechamos que nuestro perro pueda haber entrado en contacto con un animal infectado.");

                tv3.setText("Desafortunadamente, la rabia canina no tiene cura ni tratamiento, pues la intensidad de los síntomas de la rabia en perros y su rápida propagación provocan la muerte certera del animal, sin embargo, sí es posible prevenir el contagio de esta patología mediante la vacunación del perro. Por ello, ante un animal infectado el veterinario nos aconsejará proceder a la eutanasia del perro, con el objetivo de evitar el sufrimiento animal y un posible contagio.\n" +
                        "\n" +
                        "Recordamos que tras la mordedura de un animal infectado nos exponemos a padecer la rabia en humanos, por ese motivo resulta de vital importancia lavar la herida con agua y jabón y acudir cuanto antes a un centro médico para recibir de forma pronta la vacuna antirrábica.");

            }
        });

       /* ver1 = (Button)findViewById(R.id.botonver);
        ver2 = (Button)findViewById(R.id.botonver2);*/
        //nover = (EditText) findViewById(R.id.botonnover);
        //nover2 = (EditText) findViewById(R.id.botonnover2);


/*

        lv1 = (ListView)findViewById(R.id.lvperros);

        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,enfermedades);
        lv1.setAdapter(adapter);

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(lv1.getAdapter(position)=="Parviovirus") {
                    tv1.setVisibility(View.VISIBLE);
                    tv2.setVisibility(View.VISIBLE);
                }
            }
        });*/

    }


   /* public void ep1(View view){
        descripcion.setVisibility(View.VISIBLE);
        sintomas.setVisibility(View.VISIBLE);
        cuidado.setVisibility(View.VISIBLE);
        representacion.setVisibility(View.VISIBLE);
        botonrepresentacion.setVisibility(View.VISIBLE);
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

        tv3.setText("No existe un tratamiento 100% efectivo del parviovirus, sin embargo, existen pasos a seguir para poder combatirla y tener mejor resultados o en su caso, eliminar totalmente el virus.\n" +
                "\n" +
                "Rehidratación. Normalmente se recomienda una administración de suero por vía intravenosa.\n" +
                "Transfusiones de sangre. Esto por la perdida de sangre debido a las diarreas. Una vez estabilizado, se prosigue con cuidados y monitoreo.\n" +
                "Antibióticos.\n" +
                "Recuerda que los tratamientos deben ser administrados por un veterinario profesional de cabecera o de confianza.");
    }*/



}