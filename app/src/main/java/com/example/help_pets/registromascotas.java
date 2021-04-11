package com.example.help_pets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class registromascotas extends AppCompatActivity {


    private Spinner tipomascota;
    private  Spinner sexomascota;
    private EditText codigomascota, nombremascota; //codigo, nombre
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registromascotas);

       /* tipomascota = (Spinner) findViewById(R.id.spinnertipomascota1);
        sexomascota = (Spinner) findViewById(R.id.spinnersexomascota1);*/

        codigomascota = (EditText) findViewById(R.id.codigomascota);
        nombremascota = (EditText) findViewById(R.id.nombremascota);


        //Tipos de mascotas

        /*String[] mascotas = {"Perro", "Gato", "Ave", "Pez", "Hamnster"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, mascotas);
        tipomascota.setAdapter(adapter);


        //Sexo de mascota
        String[] sexomascota1 = {"Macho", "Hembra"};
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, sexomascota1);
        sexomascota.setAdapter(adapter2);*/
    }


    //Metodo boton registrar

    public void registrar(View view){
        registromascotasbd admin = new registromascotasbd(this,"bdmascotas",null,1);
        SQLiteDatabase db = admin.getReadableDatabase(); //abrir base de datos modo lectura y escritura

        String Scodigo = codigomascota.getText().toString();
        String Snombre = nombremascota.getText().toString();

        if(!Scodigo.isEmpty() && !Snombre.isEmpty()){
            ContentValues registrom = new ContentValues(); //contenido base de datos
            registrom.put("codigo",Scodigo); //guardar codigo
            registrom.put("nombre",Snombre); //guardar nombre
            db.insert("mascotas", null, registrom);
            db.close();
            codigomascota.setText("");
            nombremascota.setText("");

            Toast.makeText(this, "Registro exitoso", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this,"Debes llenar todos los campos", Toast.LENGTH_SHORT).show();
        }
    }



    //Metodo para consultar
    public void consultar(View view){
        registromascotasbd admin = new registromascotasbd(this,"bdmascotas",null,1);
        SQLiteDatabase db = admin.getWritableDatabase(); // permisos lectura y escritura

        String codigo= codigomascota.getText().toString();


        if(!codigo.isEmpty()){
            Cursor fila = db.rawQuery
                    ("select nombre from mascotas where codigo =" + codigo, null);
            if (fila.moveToFirst()){
                nombremascota.setText(fila.getString(0));
                db.close();
            }else{
                Toast.makeText(this, "No existe el articulo", Toast.LENGTH_SHORT).show();
                db.close();
            }
        }else{
            Toast.makeText(this, "Debes introducir el codigo del articulo", Toast.LENGTH_SHORT).show();
        }

    }

}