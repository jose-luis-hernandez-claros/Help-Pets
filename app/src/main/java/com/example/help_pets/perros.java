package com.example.help_pets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

public class perros extends AppCompatActivity {


    private TextView tv1,tv2,tv21,tv22;
    private  Button ep1,ep2;
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

        tv1 = (TextView)findViewById(R.id.tv1);
        tv2 = (TextView)findViewById(R.id.tv2);
        tv21 = (TextView)findViewById(R.id.tv21);
        tv22 = (TextView)findViewById(R.id.tv22);


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


    public void ep1(View view){
        tv1.setVisibility(View.VISIBLE);
        tv2.setVisibility(View.VISIBLE);
        tv21.setVisibility(view.INVISIBLE);
        tv22.setVisibility(view.INVISIBLE);
    }
    public void ep2(View view){
        tv1.setVisibility(View.INVISIBLE);
        tv2.setVisibility(View.INVISIBLE);
        tv21.setVisibility(view.VISIBLE);
        tv22.setVisibility(view.VISIBLE);
    }


}