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
                tv1.setText("Es una enfermedad infecciosa, de tipo v??rica, grave y potencialmente letal." +
                        "ante cualquier sospecha de tener esta enfermedad es imprescindible acudir de forma inmediata al centro veterinario mas cercano." +
                        "Algunas razas de perro como el Rottweiler son mas propensos a contraer esta enfermedad.\n" +
                        "El Parvovirus se contagia mediante contacto oral/nasal directo de un perro infectado a otro perro," +
                        " a trav??s de las heces de perros infectados con el canino\n" +
                        "Es considerado un virus muy contagioso y tiene un periodo de incubaci??n corto (entre cinco y diez d??as)");

                tv2.setText("Esta enfermedad por lo general ataca al tejido linfatico e intastinal. Los principales sintomas que produce esta enfermedad son:\n" +
                        "Diarrea (que suele ir acompa??ada de hemorragia)\n" +
                        "V??mitos\n" +
                        "Fiebre\n" +
                        "Falta de apetito y decaimiento.\n" +
                        "Apat??a y/o letargo.\n" +
                        "Depresi??n\n" +
                        "P??rdida de peso.\n" +
                        "Dolor a la palpaci??n de abdomen.\n" +
                        "En casos m??s graves, deshidrataci??n (m??s o menos severa, ya que el virus afecta al tracto intestinal) y muerte del paciente.");

                tv3.setText("No existe un tratamiento 100% efectivo del parviovirus, sin embargo, existen pasos a seguir para poder combatirla y tener mejor resultados o en su caso, " +
                        "eliminar totalmente el virus.\n" +
                        "\n" +
                        "Rehidrataci??n. Normalmente se recomienda una administraci??n de suero por v??a intravenosa.\n" +
                        "Transfusiones de sangre. Esto por la perdida de sangre debido a las diarreas. Una vez estabilizado, se prosigue con cuidados y monitoreo.\n" +
                        "Antibi??ticos.\n" +
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

                tv1.setText("El moquillo canino, conocido tambi??n como distemper canino o enfermedad de Carr?? es un virus perteneciente al g??nero Morbillivirus, " +
                        "de la familia de los Paramixovirus. Es una enfermedad infecciosa de tipo viral extremadamente contagiosa que afecta a canes dom??sticos." +
                        " El contagio del moquillo canino se produce cuando un animal sano entra en contacto con part??culas virales que se encuentran en el ambiente, en forma de aerosol. " +
                        "Est?? estrechamente relacionado con el virus del sarampi??n y la peste bovina.");

                tv2.setText("Una vez han pasado entre 3 y 6 d??as tras el contagio, empezamos a observar los primeros signos de esta enfermedad los cuales son:" +
                        "Fiebre\n" +
                        "P??rdida del apetito\n" +
                        "Decaimiento en general\n" +
                        "P??rdida de peso\n" +
                        "Deshidrataci??n\n" +
                        "Descarga nasal\n" +
                        "Tos\n" +
                        "Dificultad para respirar\n" +
                        "Ojos enrojecidos\n" +
                        "Conjuntivitis\n" +
                        "Queratitis seca\n" +
                        "??lcera de c??rnea\n" +
                        "V??mitos\n" +
                        "Diarreas\n" +
                        "Endurecimiento de las almohadillas\n" +
                        "Erupciones de la piel\n" +
                        "Ataxia\n" +
                        "Movimientos involuntarios de m??sculos\n" +
                        "Convulsiones\n" +
                        "Apoplej??a");

                tv3.setText("Ante la aparici??n de uno o m??s s??ntomas acudiremos al veterinario, quien confirmar?? o descartar?? el diagn??stico del moquillo en los perros. Puede prescribir el uso de antibi??ticos de amplio espectro, " +
                        "antipir??ticos, analg??sicos, anticonvulsivos, soluciones electrol??ticas, nutrici??n espec??fica y ciertos cuidados. Cuanto antes se detecte la enfermedad y se empiece el tratamiento, mejor ser?? el pron??stico." +
                        " En los casos m??s graves se valorar?? adem??s la hospitalizaci??n del perro en el hospital veterinario para administrar suero y f??rmacos por v??a intravenosa.\n" +
                        "\n" +
                        "Es importante destacar que ning??n tratamiento para el moquillo en perros es exitoso en el 100% de los casos. As?? mismo, cuando el perro presenta signos neurol??gicos graves y progresivos, " +
                        "debemos saber que el pron??stico puede ser desfavorable. En otros casos, los signos persistir??n tras la recuperaci??n.");

            }
        });


        //artrosis
        ep3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                descripcion.setVisibility(View.VISIBLE);
                sintomas.setVisibility(View.VISIBLE);
                cuidado.setVisibility(View.VISIBLE);

                tv1.setText("La artrosis es una enfermedad degenerativa y progresiva de las articulaciones, m??s frecuente en los perros de mayor edad. " +
                        "No s?? sabe por qu?? aparece la artrosis, pero s?? que se conocen procesos que van a terminar gener??ndola, por ejemplo, un traumatismo o el inevitable envejecimiento. La artrosis puede aparecer en cualquier articulaci??n del cuerpo." +
                        " As??, aunque es m??s normal en las extremidades, tambi??n afecta a otras articulaciones como las de la columna vertebral.");

                tv2.setText("Los s??ntomas van a depender de las articulaciones afectadas y de la importancia de esa afectaci??n. Sobre todo se manifiesta en cadera, rodillas, hombros y codos. Lo habitual es que el perro sienta dolor al mover la articulaci??n o si se la manipulamos. Puede haber inflamaci??n y, en ocasiones, incluso percibiremos un sonido semejante a un chasquido.\n" +
                        "\n" +
                        "Puesto que los s??ntomas pueden ser confusos, ??c??mo saber si un perro tiene artrosis? El signo que observaremos suele ser una cojera, especialmente evidente cuando el perro se levanta o comienza a andar. Cojea por dolor y, por eso mismo, quiz?? el primer s??ntoma que percibamos es que disminuye su actividad, sobre todo en lo relativo a correr y saltar. El cuadro cl??nico ir?? empeorando progresivamente." +
                        " Un perro con mucho dolor puede reaccionar con agresividad al manipularlo. Una menor movilidad implica la p??rdida de masa muscular, lo que empeora la sintomatolog??a.");

                tv3.setText("La artrosis es una enfermedad degenerativa irreversible y progresiva, es decir, no es posible su curaci??n, aunque s?? podremos tratar para, en lo posible, controlar su avance. Al tratarse de una patolog??a sobre todo asociada al envejecimiento, la prevenci??n tan solo puede enfocarse hacia el mantenimiento de una buena condici??n corporal, con una alimentaci??n y una actividad f??sica adecuadas.\n" +
                        "El tratamiento veterinario minimiza el dolor que va a sentir el perro con artrosis. Y este es el objetivo m??s importante, ya que es el punto clave para asegurar su bienestar todo lo posible\n" +
                        "Adem??s del tratamiento farmacol??gico, ortop??dico, el control de la alimentaci??n o el ejercicio, existen opciones como la fisioterapia o la acupuntura. Hay que tener claro que tampoco van a curar la artrosis en perros, pero s?? mejoran considerablemente la calidad de vida del animal al controlar el dolor y facilitar la movilidad. Eso s??, son t??cnicas que siempre deben aplicar profesionales.");

            }
        });


        //otitis
        ep4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                descripcion.setVisibility(View.VISIBLE);
                sintomas.setVisibility(View.VISIBLE);
                cuidado.setVisibility(View.VISIBLE);

                tv1.setText("La otitis supone una inflamaci??n del conducto auditivo externo que puede afectar o no a la membrana timp??nica y verse acompa??ada o no de infecci??n. Para su curaci??n es b??sico identificar la causa que la produce, ya que, de no descubrirla o, directamente, no tratarla, podr??a cronificarse.");

                tv2.setText("La otitis externa es la inflamaci??n del conducto auditivo externo, en su tramo vertical y horizontal, pudiendo afectar a la bulla timp??nica. Los s??ntomas van a depender de la gravedad y son los siguientes:\n" +
                        "\n" +
                        "Eritema auricular, es decir, enrojecimiento del interior de la oreja por un aumento de sangre en la zona.\n" +
                        "Sobre todo, agitaci??n de la cabeza y rascado.\n" +
                        "Dolor en la zona.\n" +
                        "Si hay infecci??n asociada habr?? secreci??n.\n" +
                        "En los casos de otitis ex");

                tv3.setText("El tratamiento, que siempre debe prescribir el veterinario tras el examen otosc??pico y la citolog??a, de ser el caso, se dirige a controlar la inflamaci??n del conducto y a eliminar las infecciones si las hay. Para ello, se da preferencia a la medicaci??n local, es decir, aplicada directamente en el conducto, ya que tendr?? menor riesgo de efectos secundarios que el tratamiento sist??mico y ser?? m??s concentrado.\n" +
                        "\n" +
                        "La excepci??n al tratamiento anterior la suponen los perros con lesiones en el conducto o en los que no es posible el tratamiento t??pico. El veterinario tiene que revisar el o??do a los 7-15 d??as para ver si la curaci??n ha sido completa");

            }
        });


        //leishmaniosis
        ep5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                descripcion.setVisibility(View.VISIBLE);
                sintomas.setVisibility(View.VISIBLE);
                cuidado.setVisibility(View.VISIBLE);

                tv1.setText("La leishmaniasis en perros una enfermedad parasitaria que se encuentra en expasi??n y que, al tratarse de una zoonosis, es decir, de una enfermedad que puede afectar a las personas, es imprescindible conocer para poder adoptar las medidas preventivas adecuadas, pues siempre es mejor evitar una enfermedad antes que curarla.");

                tv2.setText("Tras un per??odo de incubaci??n muy variable, un perro enfermo manifestar?? s??ntomas como los siguientes:\n" +
                        "\n" +
                        "P??rdida de pelo alrededor de los ojos, las orejas y la nariz.\n" +
                        "El pelo restante se ver?? fino y mate.\n" +
                        "Con leishmaniasis avanzada en los perros apreciaremos adelgazamiento, a pesar de estar comiendo con normalidad.\n" +
                        "Aumento del tama??o de los ganglios.\n" +
                        "Sobrecrecimiento de las u??as.\n" +
                        "Heridas que no cicatrizan, sobre todo en zonas de contacto y rodeando los ojos, que pueden presentar conjuntivitis.\n" +
                        "Letargo.\n" +
                        "Cojera.\n" +
                        "Dolor articular.\n" +
                        "Hemorragia nasal.\n" +
                        "Hiperqueratosis, es decir, engrosamiento de la piel en nariz y dedos.\n" +
                        "En la leishmaniasis cr??nica es habitual que aparezca insuficiencia renal, trastornos digestivos o hep??ticos.\n" +
                        "Hay que saber que algunos perros est??n infestados por el par??sito pero no manifiestan s??ntomas, lo que quiere decir que pueden ser fuente de contagio sin que sepamos que est??n enfermos. Por ello, se recomienda analizar a todos los perros que vivan en zonas de riesgo para saber si son o no portadores de la Leishmania.");

                tv3.setText("Lo primero que quiere saber un cuidador en estos casos es si la leishmaniasis en perros se cura. Pues bien, tenemos que saber que, si no se trata, el perro probablemente fallecer??. Adem??s, los tratamientos disponibles se dirigen a suprimir los s??ntomas, pero no a eliminar el par??sito. Aun as??, los perros enfermos deben recibir medicaci??n para mejorar su calidad de vida, al paliar los signos cl??nicos, y, muy importante, porque disminuye el riesgo de transmisi??n. El tratamiento puede prescribirse de por vida y se marcan, adem??s, controles peri??dicos. Otros perros se tratan varias semanas pero, como no se elimina el par??sito, pueden darse reca??das. En estos casos, habr?? que repetir el tratamiento en cuanto aparezcan los s??ntomas.\n" +
                        "\n" +
                        "Para tratar la leishmania en perros se utilizan varios f??rmacos combinados que dificultan la reproducci??n del par??sito. Suelen administrarse de manera oral o inyectable. Es importante que si detectamos cualquiera de los s??ntomas antes descritos acudamos al veterinario, ya que un tratamiento precoz mejora el pron??stico considerablemente.\n" +
                        "\n" +
                        "La evoluci??n de los tratamientos ha ayudado a que los perros afectados permanezcan m??s tiempo sin s??ntomas ni reca??das. Esto quiere decir que, no existe una cura definitiva para la leishmaniosis en perros, pero los canes infectados puede tener una buena calidad de vida, y vivir durante muchos a??os, si reciben el adecuado tratamiento.");

            }
        });


        //gusano del corazon
        ep6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                descripcion.setVisibility(View.VISIBLE);
                sintomas.setVisibility(View.VISIBLE);
                cuidado.setVisibility(View.VISIBLE);

                tv1.setText("El gusano del coraz??n o dirofilariosis canina es una enfermedad que pueden padecer los perros, otros animales dom??sticos como gatos y hurones, e incluso las personas. Suele transmitirse mediante fleb??tomos(Insectos) infectados, que act??an como vectores de esta patolog??a, y se considera una de las enfermedades parasitarias m??s graves y comunes en los canes.\n" +
                        "Consiste en una enfermedad parasitaria provocada por un nematodo denominado Dirofilaria immitis, el cual parasita principalmente el coraz??n y las arterias pulmonares de los perros a trav??s del riego sangu??neo. Suelen acumularse en el ventr??culo derecho y en los vasos sangu??neos de los pulmones, donde se desarrollan hasta alcanzar los 15 o 30 cm de longitud.");

                tv2.setText("Los individuos que han sido infestados pueden ser asintom??ticos, es decir, que no presenten se??ales evidentes provocadas por esta patolog??a. Este es precisamente el motivo por el que suele detectarse la enfermedad del gusano del coraz??n cuando ya est?? en estado avanzado.\n" +
                        "\n" +
                        "Los s??ntomas de dirofilariosis en perros m??s comunes son:\n" +
                        "\n" +
                        "Cansancio generalizado\n" +
                        "Intolerancia al ejercicio\n" +
                        "Aumento del ritmo card??aco\n" +
                        "Tos blanda y dificultad para respirar\n" +
                        "Hemorragias nasales\n" +
                        "Sangrados orales\n" +
                        "Apat??a y depresi??n\n" +
                        "P??rdida de peso\n" +
                        "Desmayos\n" +
                        "Anorexia (el perro no quiere comer)\n" +
                        "Ascitis\n" +
                        "Paro card??aco\n" +
                        "Es de vital importancia acudir a una cl??nica veterinaria si observamos cualquiera de los s??ntomas mencionados anteriormente para poder determinar si la causa se debe a la presencia del gusano del coraz??n o dirofilariosis canina");

                tv3.setText("El proceso pueda ser complicado en algunos casos, es una enfermedad tratable si se diagnostica de forma pronta y se realiza un tratamiento efectivo para eliminar los gusanos adultos y las larvas. Aun as??, cabe recordar que en estados avanzados puede ser muy complicada de tratar y que en algunos casos el fallecimiento del perro es inevitable.\n" +
                        "\n" +
                        "El tratamiento suele ser largo, alarg??ndose varios meses, y generalmente empieza con la administraci??n de medicaci??n para expulsar a las microfilarias y las larvas del organismo, seguida de varias inyecciones para eliminar los gusanos adultos. Posteriormente, cuando esta primera fase del tratamiento ha tenido ??xito, se prosigue con una medicaci??n de por vida para prevenir las microfilarias. Tambi??n puede ser necesario aplicar medicaci??n para paliar los s??ntomas que experimente el can y f??rmacos de apoyo para los ??rganos afectados, incluidos el ri????n y el h??gado.\n" +
                        "\n" +
                        "Finalmente se deber?? proporcionar vitaminas y una alimentaci??n que ayude a fortalecer la salud de nuestro can, adem??s de instaurar de forma permanente un plan preventivo para que no se repita la infestaci??n.");

            }
        });


        //tos de las perreras
        ep7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                descripcion.setVisibility(View.VISIBLE);
                sintomas.setVisibility(View.VISIBLE);
                cuidado.setVisibility(View.VISIBLE);

                tv1.setText("La traqueobronquitis infecciosa canina, m??s com??nmente conocida como \"la tos de las perreras\", es una patolog??a que afecta al sistema respiratorio y suele desarrollarse en lugares donde conviven una gran cantidad de canes, tales como perreras o criaderos. Este hecho fue el que dio lugar al nombre popular de la afecci??n.\n" +
                        "\n" +
                        "Antiguamente, esta enfermedad se produc??a ??nicamente en aquellas perreras o criaderos con inadecuadas condiciones higi??nicas. No obstante, con el incremento de protectoras animales, casas de acogida de mascotas abandonadas, paseadores de perros, exposiciones caninas y, en general, de lugares en los que se concentran un gran n??mero de canes, la patolog??a se ha propagado con mayor rapidez debido a su elevado ??ndice de contagio, y no tanto por condiciones inapropiadas. ");

                tv2.setText("Una vez contagiado, el perro empezar?? a experimentar una serie de s??ntomas claramente identificables. La manifestaci??n m??s caracter??stica de esta patolog??a es la aparici??n de una tos seca, ronca, fuerte y constante, provocada por la inflamaci??n de las cuerdas vocales.\n" +
                        "\n" +
                        "En los casos m??s avanzados, la tos puede ir acompa??ada de una ligera expectoraci??n de las secreciones depositadas en el sistema respiratorio por los g??rmenes pat??genos. Dicha expulsi??n suele confundirse con un v??mito leve o cuerpo extra??o. En la medida de lo posible, es aconsejable reservar una muestra y llev??rsela al veterinario para que pueda examinarla. De esta forma, adem??s de analizar el aspecto f??sico de tu perro, podr?? estudiar la secreci??n expulsada y ofrecer un mejor diagn??stico. Debes saber que estos moderados v??mitos no son producidos por problemas estomacales, recordemos que esta enfermedad solo afecta al sistema respiratorio. Se desarrollan por la misma inflamaci??n e irritaci??n de la garganta producida por la tos seca.\n" +
                        "\n" +
                        "El decaimiento, el malestar general, la falta de apetito y de energ??a son otros de los s??ntomas de la tos de las perras m??s comunes. Si observas que tu can presenta alguno de estos indicios, no lo dudes y acude al veterinario r??pidamente. Aunque no se trate de una enfermedad de car??cter grave, s?? requiere tratamiento veterinario para curarla y evitar que empeore.\n" +
                        "\n" +
                        "Y si aparecen infecciones secundarias, es posible que el perro presente fiebre, debilidad, secreci??n ocular y/o nasal, dificultad para respirar, etc.");

                tv3.setText("Lo primero que debemos hacer es aislar al perro enfermo dentro del hogar, en una habitaci??n solo para ??l durante siete d??as como m??nimo, o el tiempo que dure el tratamiento. Este paso es imprescindible para evitar que se propague la enfermedad y contagie a canes vecinos.\n" +
                        "\n" +
                        "Una vez aislado, la forma m??s sencilla de controlar y erradicar la tos de las perreras es mediante antibi??ticos y antiinflamatorios. En funci??n del estado del perro y el avance de la enfermedad, el veterinario optar?? por recetarle un tipo de medicamento u otro. Puesto que en el desarrollo de esta patolog??a pueden participar varios agentes v??ricos, resulta pr??cticamente imposible determinar un tratamiento m??dico est??ndar apto para todos los casos. Lo m??s recomendable es acudir a tu cl??nica veterinaria habitual para que sea un especialista quien determine cu??l es el mejor tratamiento para curar la tos de las perreras.\n" +
                        "\n" +
                        "En los canes que presenten decaimiento y falta de apetito, deberemos asegurarnos de que ingieran la cantidad de agua m??nima estipulada por el veterinario para impedir una deshidrataci??n, diluir las secreciones depositadas en las v??as respiratorias y favorecer la ventilaci??n.");

            }
        });


        //problemas urinarios
        ep8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                descripcion.setVisibility(View.VISIBLE);
                sintomas.setVisibility(View.VISIBLE);
                cuidado.setVisibility(View.VISIBLE);

                tv1.setText("Al igual que las personas, los perros son susceptibles a sufrir una infecci??n urinaria. Aunque la mayor??a de casos se producen en perras, los machos tambi??n pueden padecer este problema. As?? mismo, este tipo de infecci??n puede afectar a cualquiera de las estructuras que forman el tracto urinario y debe ser tratado con rapidez para evitar problemas mayores en el futuro.");

                tv2.setText("En muchos casos, los s??ntomas pueden ser dif??ciles de detectar y es com??n que la infecci??n salga a la luz durante una visita al veterinario por causas diferentes. En otros casos, los s??ntomas son m??s evidentes. En general, los s??ntomas m??s comunes de infecci??n urinaria en perros son:\n" +
                        "\n" +
                        "Aumento de la frecuencia de micci??n.\n" +
                        "El perro orina poca cantidad y, muchas veces, parece tener molestias al hacerlo.\n" +
                        "El perro hace esfuerzos para orinar, pero no lo consigue o solo logra expulsar muy poca cantidad. En estos casos, puede haber una inflamaci??n de pr??stata o c??lculos renales o uretrales. Es urgente llevar al perro al veterinario.\n" +
                        "Puede tener sensaci??n de querer defecar, pero nunca llegar a hacerlo.\n" +
                        "La orina es turbia.\n" +
                        "La orina presenta mal olor.\n" +
                        "Hay sangre en la orina.\n" +
                        "El perro orina en lugares en los que no acostumbra a hacerlo (por ejemplo, un perro bien educado para ir al ba??o empieza a orinar dentro de casa).\n" +
                        "Fiebre leve o elevada.\n" +
                        "P??rdida de apetito.\n" +
                        "Depresi??n y letargo.\n" +
                        "Descarga vaginal en las hembras.\n" +
                        "Inflamaci??n e irritaci??n alrededor de los genitales externos.\n" +
                        "Lamido frecuente del pene o la vulva.\n" +
                        "Inquietud y nerviosismo en casa o durante el paseo.\n" +
                        "Jadeo excesivo, provocado por el malestar y la ansiedad.\n" +
                        "Cambios de humor en el perro.");

                tv3.setText("El tratamiento para las infecciones urinarias bacterianas consiste en la administraci??n de antibi??ticos. Generalmente, se usan antibi??ticos de amplio espectro que dan buenos resultados, pero en los casos en los que no funcionan se deben administrar antibi??ticos espec??ficos para la bacteria causante de la infecci??n. En muchos casos, se utiliza amoxicilina para la infecci??n de orina en perros, que es un antibi??tico de amplio espectro, pero debe ser siempre recetado por el especialista.\n" +
                        "\n" +
                        "Es importante administrar el tratamiento antibi??tico para la cistitis en perros, o la infecci??n urinaria que padezca, recetado durante todo el tiempo que el veterinario haya indicado, incluso si los s??ntomas desaparecen antes.");

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
                        "Objetos extra??os.\n" +
                        "Par??sitos.\n" +
                        "Medicamentos.\n" +
                        "Agentes infecciosos.");

                tv2.setText("Los s??ntomas de problemas digestivos en perros son amplios e incluyen:\n" +
                        "P??rdida de apetito.\n" +
                        "Exceso de gases.\n" +
                        "V??mitos.\n" +
                        "Estre??imiento.\n" +
                        "Diarrea.\n" +
                        "Dificultad para tragar.\n" +
                        "Algunos problemas digestivos del perro se alivian cuando su est??mago descansa, pero las condiciones m??s graves pueden provocar p??rdida de peso, deshidrataci??n y debilitamiento. Tu veterinario puede determinar el tratamiento apropiado.");

                tv3.setText("Dependiendo de la gravedad y el tipo de problema, ??ste puede incluir el manejo de la dieta con un alimento especial para est??magos sensibles caninos, manejo m??dico o incluso cirug??a abdominal.\n" +
                        "\n" +
                        "Si se necesitan pruebas de diagn??stico adicionales, el veterinario puede recomendar an??lisis de laboratorio, radiograf??as o un procedimiento como la endoscopia, que consiste en insertar un tubo con una peque??a c??mara de video en el tracto digestivo de tu perro.\n" +
                        "\n" +
                        "Dado que muchos trastornos gastrointestinales pueden irritar su est??mago e intestino, una dieta f??cil de digerir puede ayudar a asegurar que tu perro obtenga el equilibrio de nutrientes necesario para su recuperaci??n..");

            }
        });


        //problemas de piel
        ep10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                descripcion.setVisibility(View.VISIBLE);
                sintomas.setVisibility(View.VISIBLE);
                cuidado.setVisibility(View.VISIBLE);

                tv1.setText("Existen muchas enfermedades de la piel en los perros y, de hecho, forman parte de los motivos de consulta veterinaria m??s frecuentes. Es importante recurrir desde los primeros signos a la cl??nica u hospital veterinario porque este tipo de enfermedades, sino se tratan pronto, pueden complicarse y resultar muy molestas para el perro.");

                tv2.setText("Los s??ntomas m??s comunes que nos van a indicar que existe alg??n problema dermatol??gico. Son los siguientes:\n" +
                        "\n" +
                        "Prurito o rascado.\n" +
                        "Alopecia, es decir, ??reas sin pelo.\n" +
                        "Dermatitis, que es, literalmente, la inflamaci??n de la piel.\n" +
                        "Eritema o enrojecimiento de la piel.\n" +
                        "??lceras o heridas abiertas.\n" +
                        "P??pulas, que son bultos rojos graniformes.\n" +
                        "P??stulas, lesiones con pus en su interior.\n" +
                        "Costras, que son heridas que se han secado.\n" +
                        "N??dulos, bultos, granos o masas, que podremos observar o palpar como protuberancias de diferente tama??o.\n" +
                        "Hiperpigmentaci??n o piel oscura.\n" +
                        "Hiperqueratosis o piel engrosada");

                tv3.setText("Existen muchas opciones de tratamiento porque, como hemos visto, existen causas de diferentes or??genes. El tratamiento puede basarse en eliminar al par??sito y prevenir su aparici??n si lo hay. Desinfectar la piel, limpiar con productos t??picos o champ??s o administrar antibi??ticos en el caso de infecciones bacterianas. Corticoides y productos de efecto similar se recetan para reducir la inflamaci??n y el picor.\n" +
                        "\n" +
                        "Los problemas hormonales van a requerir medicaci??n y estrecho seguimiento veterinario. Adem??s, cuando la conducta influye en la enfermedad debemos cambiar las condiciones de vida del perro, acudiendo a un educador canino u et??logo si fuese necesario. Las alergias alimentarias se tratan con una alimentaci??n hipoalerg??nica. Tambi??n se recurre a la inmunoterapia. Abscesos y neoplasias pueden necesitar intervenci??n quir??rgica");

            }
        });


        //hepatitis
        ep11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                descripcion.setVisibility(View.VISIBLE);
                sintomas.setVisibility(View.VISIBLE);
                cuidado.setVisibility(View.VISIBLE);

                tv1.setText("Hepatitis es un t??rmino que proviene de los vocablos griegos \"hepar\" (h??gado) e \"itis\" (inflamaci??n) y que por lo tanto indica una stuaci??n patolog??a en la que el h??gado est?? inflamado, no obstante, la inflamaci??n hep??tica puede producirse por distintas causas, lo que nos ayudar?? a diferenciar entre distintos tipos de hepatitis.");

                tv2.setText("Estamos ante una inflamaci??n del h??gado, por lo que independientemente de la causa, los s??ntomas de la hepatitis en perros son los siguientes:\n" +
                        "\n" +
                        "Sed excesiva\n" +
                        "Ictericia (coloraci??n amarillenta de ojos y mucosas)\n" +
                        "Sangre en las mucosas\n" +
                        "Dolor abdominal que puede derivar a inmovilidad\n" +
                        "Fiebre\n" +
                        "Convulsiones por fallo hep??tico\n" +
                        "P??rdida del apetito\n" +
                        "Aumento de la secreci??n nasal y ocular\n" +
                        "V??mitos\n" +
                        "Edema subcut??neo\n" +
                        "Un perro con hepatitis no tiene por qu?? mostrar todos los s??ntomas expuestos, por lo que ante cualquier signo que indique una posible hepatitis debemos acudir urgentemente al veterinario");

                tv3.setText("El tratamiento de la hepatitis en perros depender?? del factor que haya causado la patolog??a.\n" +
                        "\n" +
                        "En la hepatitis com??n el tratamiento ser?? sintom??tico pero tambi??n deber?? cumplir con el objetivo de modular aquellos factores que han causado el da??o hep??tico.\n" +
                        "En la hepatitis autoinmune el tratamiento tambi??n ser?? sintom??tico aunque el veterinario valorar?? la posible prescripci??n de un medicamento inmunomodulador que act??e espec??ficamente sobre el sistema de defensas previniendo el da??o hep??tico.\n" +
                        "En el caso de hepatitis infecciosa o v??rica, el tratamiento tambi??n es sintom??tico ya que no existe cura, se pueden emplear antibi??ticos para controlar infecciones secundarias, soluciones isot??nicas para prevenir la deshidrataci??n, protectores hep??ticos y dieta hipoproteica.\n" +
                        "Es el veterinario el que debe indicar una dieta hipoproteica, aunque ??sta resulta beneficiosa en los tres casos de hepatitis, ya que ante la presencia abundante de prote??nas el h??gado se sobrecarga. Recuerda que ??nicamente el veterinario es el profesional capacitado para prescribir cualquier tipo de tratamiento a tu mascota.");

            }
        });


        //rabia
        ep12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                descripcion.setVisibility(View.VISIBLE);
                sintomas.setVisibility(View.VISIBLE);
                cuidado.setVisibility(View.VISIBLE);

                tv1.setText("La rabia en perros o rabia canina es una de las enfermedades infecciosas virales m??s conocidas, pues se trata de una patolog??a que puede transmitirse a todos los mam??feros, incluyendo el ser humano, al ser una enfermedad zoon??tica. Adem??s, los perros son los principales transmisores a nivel mundial.\n" +
                        "\n" +
                        "Este virus de la familia Rhabdoviridae est?? presente en pr??cticamente todos los rincones del planeta Tierra, exceptuando en Australia, las islas brit??nicas y en la Ant??rtida. Detectar de forma pronta esta patolog??a es vital para prevenirla y evitar el contagio hacia otros animales, pues la rabia canina es mortal, por este motivo, todos los pa??ses toman medidas para prevenirla, contenerla y tratar de eliminarla.");

                tv2.setText("Los s??ntomas de esta condici??n afectan principalmente al SNC(Sistema Nervioso Central) y al cerebro, y aunque suelen presentarse las fases que hemos mencionado anteriormente, no siempre se manifiestan todos los s??ntomas, motivo por el cual es tan importante estar atentos a las se??ales que indican que nuestro perro pueda estar enfermo.\n" +
                        "\n" +
                        "A continuaci??n te mostramos los s??ntomas de la rabia en perros m??s comunes:\n" +
                        "\n" +
                        "Fiebre\n" +
                        "Agresividad\n" +
                        "Irritabilidad\n" +
                        "Apat??a\n" +
                        "V??mitos\n" +
                        "Salivaci??n excesiva\n" +
                        "Fotofobia (aversi??n a la luz)\n" +
                        "Hidrofobia (aversi??n al agua)\n" +
                        "Dificultad para tragar\n" +
                        "Par??lisis del rostro\n" +
                        "Convulsiones\n" +
                        "Par??lisis general\n" +
                        "La rabia se confunde f??cilmente con otras enfermedades neurol??gicas y, por ende, siempre es necesario consultar con un veterinario ante la aparici??n de cualquiera de los s??ntomas de rabia en perros mencionados, o bien si sospechamos que nuestro perro pueda haber entrado en contacto con un animal infectado.");

                tv3.setText("Desafortunadamente, la rabia canina no tiene cura ni tratamiento, pues la intensidad de los s??ntomas de la rabia en perros y su r??pida propagaci??n provocan la muerte certera del animal, sin embargo, s?? es posible prevenir el contagio de esta patolog??a mediante la vacunaci??n del perro. Por ello, ante un animal infectado el veterinario nos aconsejar?? proceder a la eutanasia del perro, con el objetivo de evitar el sufrimiento animal y un posible contagio.\n" +
                        "\n" +
                        "Recordamos que tras la mordedura de un animal infectado nos exponemos a padecer la rabia en humanos, por ese motivo resulta de vital importancia lavar la herida con agua y jab??n y acudir cuanto antes a un centro m??dico para recibir de forma pronta la vacuna antirr??bica.");

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
        tv1.setText("Es una enfermedad infecciosa, de tipo v??rica, grave y potencialmente letal." +
                "ante cualquier sospecha de tener esta enfermedad es imprescindible acudir de forma inmediata al centro veterinario mas cercano." +
                "Algunas razas de perro como el Rottweiler son mas propensos a contraer esta enfermedad.\n" +
                "El Parvovirus se contagia mediante contacto oral/nasal directo de un perro infectado a otro perro," +
                " a trav??s de las heces de perros infectados con el canino\n" +
                "Es considerado un virus muy contagioso y tiene un periodo de incubaci??n corto (entre cinco y diez d??as)");

        tv2.setText("Esta enfermedad por lo general ataca al tejido linfatico e intastinal. Los principales sintomas que produce esta enfermedad son:\n" +
                "Diarrea (que suele ir acompa??ada de hemorragia)\n" +
                "V??mitos\n" +
                "Fiebre\n" +
                "Falta de apetito y decaimiento.\n" +
                "Apat??a y/o letargo.\n" +
                "Depresi??n\n" +
                "P??rdida de peso.\n" +
                "Dolor a la palpaci??n de abdomen.\n" +
                "En casos m??s graves, deshidrataci??n (m??s o menos severa, ya que el virus afecta al tracto intestinal) y muerte del paciente.");

        tv3.setText("No existe un tratamiento 100% efectivo del parviovirus, sin embargo, existen pasos a seguir para poder combatirla y tener mejor resultados o en su caso, eliminar totalmente el virus.\n" +
                "\n" +
                "Rehidrataci??n. Normalmente se recomienda una administraci??n de suero por v??a intravenosa.\n" +
                "Transfusiones de sangre. Esto por la perdida de sangre debido a las diarreas. Una vez estabilizado, se prosigue con cuidados y monitoreo.\n" +
                "Antibi??ticos.\n" +
                "Recuerda que los tratamientos deben ser administrados por un veterinario profesional de cabecera o de confianza.");
    }*/



}