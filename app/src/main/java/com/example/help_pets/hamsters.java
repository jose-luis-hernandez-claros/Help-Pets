package com.example.help_pets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class hamsters extends AppCompatActivity {


    private TextView tv1,tv2,tv3,descripcion,sintomas,cuidado,representacion;
    private Button eh1,eh2,eh3,eh4,eh5,eh6,eh7,eh8,eh9;
    private ImageView botonrepresentacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hamsters);


        eh1 = (Button)findViewById(R.id.ep1);
        eh2 = (Button)findViewById(R.id.ep2);
        eh3 = (Button)findViewById(R.id.ep3);
        eh4 = (Button)findViewById(R.id.ep4);
        eh5 = (Button)findViewById(R.id.ep5);
        eh6 = (Button)findViewById(R.id.ep6);
        eh7 = (Button)findViewById(R.id.ep7);
        eh8 = (Button)findViewById(R.id.ep8);
        eh9 = (Button)findViewById(R.id.ep9);

        tv1 = (TextView)findViewById(R.id.tv1);
        tv2 = (TextView)findViewById(R.id.tv2);
        tv3 = (TextView)findViewById(R.id.tv3);
        descripcion = (TextView)findViewById(R.id.Descripcion);
        sintomas = (TextView)findViewById(R.id.Sintomas);
        cuidado = (TextView)findViewById(R.id.Cuidado);


        //diabates
        eh1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                descripcion.setVisibility(View.VISIBLE);
                sintomas.setVisibility(View.VISIBLE);
                cuidado.setVisibility(View.VISIBLE);

                tv1.setText("La diabetes en el hámster se puede definir de forma simple como una patología que se caracteriza por la presencia elevada de azúcares en sangre. Ciertos grupos de roedores son modelos para el estudio de la diabetes tipo 2, es decir, aquella variante que no se produce por un ataque autoinmune mal dirigido.\n" +
                        "\n" +
                        "Si un hámster toma demasiada agua, orina en exceso o presenta agitación y temblores, es posible que sufra diabetes. Este evento se ve propiciado generalmente en aquellos animales con obesidad y un estilo de vida demasiado sedentario para su especie. Si quieres conocerlo todo sobre esta enfermedad en roedores domésticos, continúa leyendo.");

                tv2.setText("Los síntomas de la diabetes pueden ser muy diversos, dependiendo de la etapa de la enfermedad y la gravedad de la misma. Algunos de los más obvios se pueden detectar si se presta especial atención al comportamiento del roedor:\n" +
                        "\n" +
                        "Un incremento en el apetito: el animal está constantemente cansado, pues las células de su cuerpo no pueden utilizar la glucosa para obtener energía. Por ello, es normal que coma más como mecanismo instintivo.\n" +
                        "Aumento de la sed: para que la glucosa pueda ser excretada con la orina, esta necesita un mayor contenido de agua. Por ello, el hámster tendrá sed continuamente.\n" +
                        "Falta de energía: las células tienen menos nutrientes que metabolizar, así que es normal que el animal esté falto de energía.\n" +
                        "Pérdida de peso: por contraintuitivo que pueda resultar, una diabetes puede manifestarse en una pérdida de peso. Los tejidos queman grasas y nutrientes más rápido para compensar la imposibilidad de usar la glucosa.");

                tv3.setText("Por desgracia, no existe un tratamiento para esta patología. El bienestar del animal se basará exclusivamente en patrones dietéticos y cambios en sus hábitos de vida, pero le tocará vivir con la enfermedad en todo momento. De todas formas, ante cualquiera de los signos previamente descritos, es indispensable que visites a un veterinario.\n" +
                        "\n" +
                        "Uno de los tratamientos más eficaces es cambiar la dieta del animal. Revisa los ingredientes de la comida preparada que le ofreces al hámster y elimina todo pienso que contenga altos contenidos de azúcar. Lo ideal es que el roedor afectado obtenga el 15-20 % de su energía de proteína y el 50 % de fibra.\n" +
                        "\n" +
                        "También es importante que el hámster presente a su disposición más de una fuente de agua, pues los ejemplares diabéticos son propensos a la deshidratación. Teniendo en cuenta ambos parámetros, el animal debería ser capaz de manejar la enfermedad relativamente bien.");

            }
        });


        //cola mojada
        eh2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                descripcion.setVisibility(View.VISIBLE);
                sintomas.setVisibility(View.VISIBLE);
                cuidado.setVisibility(View.VISIBLE);

                tv1.setText("La cola mojada o ileitis proliferativa es una de las enfermedades más famosas y contagiosas en los hámsters. Se trata de un afección muy parecida a la diarrea y muchas veces se confunden pero no son lo mismo.\n" +
                        "\n" +
                        "La enfermedad de la cola mojada suele afectar a los hámsteres más jóvenes (3-10 semanas de edad), sobre todo a los que han sido recién destetados, por problemas de estrés o superpoblación, o por una mala alimentación o higiene de la jaula.");

                tv2.setText("La causan unas bacterias que estás inherentes en los intestinos de estos animales llamadas colibacterias, pero puede activarse por alguna de estas anteriores causas. El período de incubación es de 7 días y los síntomas más evidentes son las diarreas abundantes y acuosas, la cola y la región anal muy sucias y de aspecto mojado, la pérdida del apetito y consecuente deshidratación, y el encorvamiento del animal.");

                tv3.setText("El tratamiento para esta afección es muy parecido al de una gastroenteritis o al de la diarrea. Hay que rehidratar y nutrir bien al animal, aislarlo de sus otros compañeros para que no contagie la enfermedad, llevarle al veterinario para que le recete antibióticos y, desinfectar completamente la jaula y todos sus componentes para que no afecte a otros animales.");

            }
        });


        //acaros
        eh3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                descripcion.setVisibility(View.VISIBLE);
                sintomas.setVisibility(View.VISIBLE);
                cuidado.setVisibility(View.VISIBLE);

                tv1.setText("Otra de las enfermedades más comunes en los hámsteres son los ácaros y los hongos. Estos parásitos suelen estar ya en nuestras mascotas pero pueden agravarse en situaciones de estrés, debilitación del sistema inmunitario, infecciones bacterianas o cutáneas, una mala alimentación o una mala higiene de la jaula. También pueden producirse por contagio con otros animales infectados por parásitos.");

                tv2.setText("Los síntomas que producen los ácaros u hongos en los hámsteres con picores excesivos, piel irritada o con calvas, formación de eccemas o costras, y más movimiento e inquietud en la jaula de lo normal.");

                tv3.setText("El tratamiento depende del tipo de ácaros u hongos que haya contraído nuestra mascota, pero por lo general basta con desinfectar al animal (y a su jaula) con productos específicos, -siempre proporcionados por un veterinario-, mantener una correcta alimentación e higiene de su jaula y, en el caso de que la infestación sea por sarna en la piel, es necesario llevar al hámster urgentemente al veterinario, aunque esta enfermedad se puede distinguir de las afecciones más leves porque produce además, ampollas en las extremidades, en las orejas y en el hocico.");

            }
        });


        //tiña
        eh4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                descripcion.setVisibility(View.VISIBLE);
                sintomas.setVisibility(View.VISIBLE);
                cuidado.setVisibility(View.VISIBLE);

                tv1.setText("Esta es una infección fúngica muy contagiosa de la piel\n" +
                        "Este infección se ha hecho muy común con el aumento del uso de jaulas de plástico cerradas.\n" +
                        "\n" +
                        "La condensación de la humedad en el material del nido, es un ambiente ideal para el hongo.");

                tv2.setText("Los síntomas son manchas circulares sin pelo, piel seca y escamosa.");

                tv3.setText("El tratamiento consiste en recortar el pelo, la esterilización de la jaula, una mejor ventilación de la jaula, limpieza de las áreas infectadas con un champú povidona yodada y administración de griseofulvina bajo la dirección de un veterinario.");

            }
        });


        //conjuntivitis
        eh5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                descripcion.setVisibility(View.VISIBLE);
                sintomas.setVisibility(View.VISIBLE);
                cuidado.setVisibility(View.VISIBLE);

                tv1.setText("La conjuntivitis en el hámster, también conocida como ojo rosado o pink eye en inglés, es una inflamación de la conjuntiva ocular, una membrana transparente que recubre el párpado y la parte blanca del globo ocular. Existen múltiples causas que pueden propiciar este evento inflamatorio, aunque lo más común es que se deba a agentes bacterianos.");

                tv2.setText("Los síntomas de la conjuntivitis, como podrás imaginar, se localizarán en la zona cefálica del animal. Entre ellos, encontramos los siguientes:\n" +
                        "\n" +
                        "Una descarga ocular de naturaleza acuosa. \n" +
                        "A lo largo del tiempo, el líquido segregado por los ojos se puede volver purulento.\n" +
                        "Párpados pegajosos.\n" +
                        "Uno o ambos ojos hinchados. En los peores casos, la cara entera puede verse comprometida.\n" +
                        "Una tonalidad rojiza en los bordes oculares.\n" +
                        "Si percibes estos síntomas en tu mascota, lo más posible es que presente un cuadro de conjuntivitis infecciosa. En estos casos, es indispensable llevar al animal al veterinario, pues tendrá que obtener muestras de la mucosa ocular del hámster para recoger información sobre el agente etiológico causante de la enfermedad.");

                tv3.setText("Una vez realizado el diagnóstico, el hámster suele requerir un tratamiento a base de antibióticos tanto orales como en forma de gotas oculares. Antes de comenzar con los fármacos, el veterinario suele lavar la zona afectada con una solución salina, que elimina el exceso de pus en el entorno afectado.\n" +
                        "\n" +
                        "Además de todo esto, la conjuntivitis se puede abordar desde casa con un bastoncillo y una solución acuosa. Para ello, se deben seguir los siguientes pasos:\n" +
                        "\n" +
                        "Coger al hámster de forma gentil pero firme. Si es necesario, realizar caricias en su pelaje por unos pocos minutos antes de continuar con el procedimiento. En muchos casos, el estrés solo empeora el cuadro clínico.\n" +
                        "Hervir un poco de agua y dejar que alcance una temperatura tibia. Tras esto, se debe preparar una gasa aséptica.\n" +
                        "Empapar la gasa con agua tibia y aplicarla sobre la superficie purulenta del animal. Tras unas cuantas pasadas, la costra del ojo debería retirarse y el animal podría volver a abrir el ojo.\n" +
                        "Es esencial que se tenga mucho cuidado en este proceso pues, si se hace de forma muy brusca, la irritación ocular del hámster puede ir a peor. También es esencial que no se use algodón u otros materiales que no sean gasas, pues pueden dejar residuos de tejido dentro del ojo del animal.");

            }
        });


        //estreñimiento
        eh6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                descripcion.setVisibility(View.VISIBLE);
                sintomas.setVisibility(View.VISIBLE);
                cuidado.setVisibility(View.VISIBLE);

                tv1.setText("El estreñimiento está normalmente causado por una obstrucción intestinal de material comercial para el nido o agua potable insuficiente, sobre todo en los más jóvenes. Otras causas son la falta de ejercicio, la mala alimentación, el embarazo o la distocia.\n" +
                        "\n" +
                        "En raras ocasiones, existe la posibilidad de que sea por culpa del parásito Hymenolepis nana (muy similar a la Tenia) en el intestino delgado.");

                tv2.setText("Hay carencia o disminución de excrementos, que serán pequeños y duros, el hámster tendrá el ano hinchado y ligeramente húmedo, y puede dar muestras de dolor, inapetencia, e hinchazón en el abdomen. Suele estar causado por una mala o desequilibrada alimentación ");

                tv3.setText("El tratamiento consiste en administrar al animal mucha agua y frutas y verduras laxantes.");

            }
        });


        //calculos en la vejiga
        eh7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                descripcion.setVisibility(View.VISIBLE);
                sintomas.setVisibility(View.VISIBLE);
                cuidado.setVisibility(View.VISIBLE);

                tv1.setText("Está enfermedad consiste en tener pequeñas piedras en la vejiga");

                tv2.setText("Se manifiestan con dolor, dificultad para orinar y gotitas de sangre en la orina.");

                tv3.setText("Unas hojas de diente de león pueden ayudar a aumentar la producción de orina y expulsar las piedras, también darle verduras y alimentos empapados y un aporte extra de vitamina C");

            }
        });

        //cataratas
        eh8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                descripcion.setVisibility(View.VISIBLE);
                sintomas.setVisibility(View.VISIBLE);
                cuidado.setVisibility(View.VISIBLE);

                tv1.setText("Al igual que en los seres humanos, las cataratas suelen aparecer en los hámsters mayores y se ve como una película blanca sobre el ojo.\n" +
                        "\n" +
                        "A veces también son un efecto secundario de la diabetes.\n" +
                        "\n" +
                        "Debido a que esta es una enfermedad hereditaria, los hámsters con cataratas no se deben utilizar para la reproducción.");

                tv2.setText("Perdida de vision");

                tv3.setText("No hay tratamiento y la pérdida de visión es inevitable. Sin embargo, como los hámsters no ven bien, como mucho, pueden normalmente moverse en su jaula sin problemas, siempre y cuando la localización de los elementos de la jaula no se muevan.");

            }
        });


        //abscesos
        eh9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                descripcion.setVisibility(View.VISIBLE);
                sintomas.setVisibility(View.VISIBLE);
                cuidado.setVisibility(View.VISIBLE);

                tv1.setText("Los abscesos son bultos de pus subcutáneos, normalmente de color rojo, sobresalientes y dolorosos, que se pueden formar en cualquier parte del cuerpo, debido a una reacción del sistema inmunológico del hámster. Se distinguen de los tumores porque en los abscesos suelen quedar restos de las heridas que lo han formado.\n" +
                        "\n" +
                        "Estos bultos se producen, generalmente, debido a infecciones bacterianas o parasitarias, o por cortes y mordeduras mal curados.");

                tv2.setText("Si la hinchazón no disminuye, entonces es probable que el hámster tenga un absceso en su mejilla.\n" +
                        "Un absceso haría que el hámster se sienta enfermo. Es posible que el hámster coma menos y luzca mal en general (por ejemplo, tenga el pelaje desaliñado, un bajo nivel de energía, etc.). Una bolsa en la mejilla llena de comida no hará que un hámster se sienta mal.");

                tv3.setText("Los abscesos son bultos de pus subcutáneos, normalmente de color rojo, sobresalientes y dolorosos, que se pueden formar en cualquier parte del cuerpo, debido a una reacción del sistema inmunológico del hámster. Se distinguen de los tumores porque en los abscesos suelen quedar restos de las heridas que lo han formado.\n" +
                        "\n" +
                        "Estos bultos se producen, generalmente, debido a infecciones bacterianas o parasitarias, o por cortes y mordeduras mal curados.");

            }
        });

    }
}