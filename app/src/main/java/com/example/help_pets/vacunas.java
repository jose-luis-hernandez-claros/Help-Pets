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
import android.widget.Toast;

public class vacunas extends AppCompatActivity {

    private Spinner tipomascota;
    private Spinner sexomascota;
    private EditText etcodigo, etnombrem, etfechan, etnombrev, etfechav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vacunas);

        tipomascota = (Spinner)findViewById(R.id.spinnertipomascota2);
        sexomascota = (Spinner)findViewById(R.id.spinnersexomascota2);

        etcodigo = (EditText)findViewById(R.id.ididentificacionvacuna);
        etnombrem = (EditText)findViewById(R.id.idnombremascota2);
        etfechan = (EditText)findViewById(R.id.idfechanacimiento2);
        etnombrev = (EditText)findViewById(R.id.idnombrevacuna);
        etfechav = (EditText)findViewById(R.id.idfechavacunacion);


        //Tipo de mascota

        String [] mascotas = {"Perro","Gato","Ave","Pez","Hamnster"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, mascotas);
        tipomascota.setAdapter(adapter);


        //sexo de la mascota
        String [] sexomascota1 = {"Macho","Hembra"};
        ArrayAdapter <String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, sexomascota1);
        sexomascota.setAdapter(adapter2);
    }

    //Metodo boton registrar

    public void registrar(View view){
        vacunasbd admin = new vacunasbd(this,"vacunaspruebaaaa",null,1);
        SQLiteDatabase db = admin.getReadableDatabase(); //abrir base de datos modo lectura y escritura

        String Scodigo = etcodigo.getText().toString();
        String Snombrem = etnombrem.getText().toString();
        String Sfechan = etfechan.getText().toString();
        String Snombrev = etnombrev.getText().toString();
        String Sfechav = etfechav.getText().toString();

        if(!Scodigo.isEmpty() && !Snombrem.isEmpty() && !Sfechan.isEmpty() && !Snombrev.isEmpty() && !Sfechav.isEmpty()){
            ContentValues registro = new ContentValues(); //contenido base de datos
            registro.put("codigo",Scodigo); //guardar codigo
            registro.put("nombrem",Snombrem); //guardar nombre mascota
            registro.put("fechan",Sfechan); //guardar fecha nacimiento
            registro.put("nombrev",Snombrev); //guardar nombre vacuna
            registro.put("fechav",Sfechav); //guardar fecha vacunacion

            db.insert("vacunas", null, registro);
            db.close();
            etcodigo.setText("");
            etnombrem.setText("");
            etfechan.setText("");
            etnombrev.setText("");
            etfechav.setText("");

            Toast.makeText(this, "Registro exitoso", Toast.LENGTH_SHORT).show();


        }else{
            Toast.makeText(this,"Debes llenar todos los campos", Toast.LENGTH_SHORT).show();
        }
    }


    //Metodo para consultar
    public void Buscar(View view){
        vacunasbd admin = new vacunasbd(this,"vacunaspruebaaaa",null,1);
        SQLiteDatabase db = admin.getWritableDatabase(); // permisos lectura y escritura

        String codigo= etcodigo.getText().toString();


        if(!codigo.isEmpty()){
            Cursor fila = db.rawQuery
                    ("select nombrem, fechan, nombrev, fechav from vacunas where codigo=" + codigo, null);
            if (fila.moveToFirst()){
                etnombrem.setText(fila.getString(0));
                etfechan.setText(fila.getString(1));
                etnombrev.setText(fila.getString(2));
                etfechav.setText(fila.getString(3));
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