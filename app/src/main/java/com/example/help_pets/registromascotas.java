package com.example.help_pets;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;


public class registromascotas extends AppCompatActivity {


    /*private Spinner tipomascota, sexomascota;*/
    private EditText codigo, nombrem, fecham, razam, tipom, sexom; //codigo, nombre, fecha, raza
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registromascotas);

       tipom = (EditText) findViewById(R.id.idtipomascotama);
        sexom = (EditText) findViewById(R.id.idsexomascotama);

        codigo = (EditText) findViewById(R.id.ididentificacionmascota);
        nombrem = (EditText) findViewById(R.id.idnombremascota);
        fecham = (EditText) findViewById(R.id.idfechanacimientomascota);
        razam = (EditText) findViewById(R.id.idrazamascota);

       /* //Tipos de mascotas

        String[] mascotas = {"Seleccionar...","Perro", "Gato", "Ave", "Pez", "Hamnster"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, mascotas);
        tipomascota.setAdapter(adapter);


        //Sexo de mascota
        String[] sexomascota1 = {"Seleccionar...","Macho", "Hembra"};
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, sexomascota1);
        sexomascota.setAdapter(adapter2);*/

    }

    @Override //botones menu mascotas
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mascotas, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if(id ==R.id.buscar2) {
            registromascotasbd admin = new registromascotasbd(this,"mascotas1",null,1);
            SQLiteDatabase db = admin.getWritableDatabase(); // permisos lectura y escritura

            String codigos= codigo.getText().toString();


            if(!codigos.isEmpty()){
                Cursor filaa = db.rawQuery
                        ("select nombrem, tipo, sexo, fechan, razam from mascotas where codigo =" + codigos, null);
                if (filaa.moveToFirst()){
                    nombrem.setText(filaa.getString(0));
                    tipom.setText(filaa.getString(1));
                    sexom.setText(filaa.getString(2));
                    fecham.setText(filaa.getString(3));
                    razam.setText(filaa.getString(4));
                    db.close();
                }else{
                    Toast.makeText(this, "No se encontrarón datos.", Toast.LENGTH_SHORT).show();
                    db.close();
                }
            }else{
                Toast.makeText(this, "Debes introducir un codigo de identificación.", Toast.LENGTH_SHORT).show();
            }
            return  true;
        }
        if(id == R.id.eliminar2){
            registromascotasbd admin = new registromascotasbd(this,"mascotas1",null,1);
            SQLiteDatabase db = admin.getWritableDatabase(); //metodo abrir db lectura y escritura
            String codigos = codigo.getText().toString();

            if(!codigos.isEmpty()){
                int cantidad = db.delete("mascotas","codigo=" + codigos,null);
                db.close();
                codigo.setText("");
                nombrem.setText("");
                tipom.setText("");
                sexom.setText("");
                fecham.setText("");
                razam.setText("");

                if(cantidad==1){
                    Toast.makeText(this, "´Mascota eliminada exitosamente", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(this, "No se encontrarón datos", Toast.LENGTH_SHORT).show();
                }
            }else {
                Toast.makeText(this, "Debes introducir un codigo de identificación", Toast.LENGTH_SHORT).show();
            }
            return  true;
        }
        if(id == R.id.editar2){
            registromascotasbd admin = new registromascotasbd(this,"mascotas1",null,1);
            SQLiteDatabase db = admin.getWritableDatabase();

            String Scodigo = codigo.getText().toString();
            String Snombre = nombrem.getText().toString();
            String Stipo = tipom.getText().toString();
            String Ssexo = sexom.getText().toString();
            String Sfecham = fecham.getText().toString();
            String Srazam = razam.getText().toString();

            if(!Scodigo.isEmpty() && !Snombre.isEmpty() && !Stipo.isEmpty() && !Ssexo.isEmpty() && !Sfecham.isEmpty() && !Srazam.isEmpty()){
                ContentValues registrom = new ContentValues(); //contenido de los campos
                registrom.put("codigo",Scodigo); //guardar codigo
                registrom.put("nombrem",Snombre); //guardar nombre
                registrom.put("tipo",Stipo); //guardar tipo
                registrom.put("sexo",Ssexo); //guardar sexo
                registrom.put("fechan",Sfecham); //guardar fecha
                registrom.put("razam",Srazam); //guardar raza

                int cantidad = db.update("mascotas",registrom,"codigo=" + Scodigo, null);
                db.close();
                codigo.setText("");
                nombrem.setText("");
                tipom.setText("");
                sexom.setText("");
                fecham.setText("");
                razam.setText("");

                if(cantidad == 1){
                    Toast.makeText(this, "Datos de la mascota modificados correctamente", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(this, "No se encontrarón datos", Toast.LENGTH_SHORT).show();
                }

            }else{
                Toast.makeText(this, "Debes llenar todos los campos", Toast.LENGTH_SHORT).show();
            }
            return  true;
        }
        return super.onOptionsItemSelected(item);
        }


   //Metodo boton registrar

    public void registrar(View view){
        registromascotasbd admin = new registromascotasbd(this,"mascotas1",null,1);
        SQLiteDatabase db = admin.getReadableDatabase(); //abrir base de datos modo lectura y escritura

        String Scodigo = codigo.getText().toString();
        String Snombre = nombrem.getText().toString();
        String Stipo = tipom.getText().toString();
        String Ssexo = sexom.getText().toString();
        String Sfecham = fecham.getText().toString();
        String Srazam = razam.getText().toString();

        if(!Scodigo.isEmpty() && !Snombre.isEmpty() && !Stipo.isEmpty() && !Ssexo.isEmpty() && !Sfecham.isEmpty() && !Srazam.isEmpty()){
            ContentValues registrom = new ContentValues(); //contenido base de datos
            registrom.put("codigo",Scodigo); //guardar codigo
            registrom.put("nombrem",Snombre); //guardar nombre
            registrom.put("tipo",Stipo); //guardar tipo
            registrom.put("sexo",Ssexo); //guardar sexo
            registrom.put("fechan",Sfecham); //guardar fecha
            registrom.put("razam",Srazam); //guardar raza

            db.insert("mascotas", null, registrom);
            db.close();
            codigo.setText("");
            nombrem.setText("");
            tipom.setText("");
            sexom.setText("");
            fecham.setText("");
            razam.setText("");

            Toast.makeText(this, "Registro exitoso", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this,"Debes llenar todos los campos", Toast.LENGTH_SHORT).show();
        }
    }


/*

    //Metodo para consultar
    public void consultar(View view){
        registromascotasbd admin = new registromascotasbd(this,"mascotas1",null,1);
        SQLiteDatabase db = admin.getWritableDatabase(); // permisos lectura y escritura

        String codigos= codigo.getText().toString();


        if(!codigos.isEmpty()){
            Cursor filaa = db.rawQuery
                    ("select nombrem, fechan, razam from mascotas where codigo =" + codigos, null);
            if (filaa.moveToFirst()){
                nombrem.setText(filaa.getString(0));
                fecham.setText(filaa.getString(1));
                razam.setText(filaa.getString(2));
                db.close();
            }else{
                Toast.makeText(this, "No se encontrarón datos.", Toast.LENGTH_SHORT).show();
                db.close();
            }
        }else{
            Toast.makeText(this, "Debes introducir un codigo de identificación.", Toast.LENGTH_SHORT).show();
        }

    }
*/
/*
    //Metodo para eliminar

    public void eliminar(View view) {
        registromascotasbd admin = new registromascotasbd(this, "mascotas1", null, 1);
        SQLiteDatabase db = admin.getWritableDatabase(); //metodo abrir db lectura y escritura
        String codigos = codigo.getText().toString();

        if (!codigos.isEmpty()) {
            int cantidad = db.delete("mascotas", "codigo=" + codigos, null);
            db.close();
            codigo.setText("");
            nombrem.setText("");
            fecham.setText("");
            razam.setText("");

            if (cantidad == 1) {
                Toast.makeText(this, "´Mascota eliminada exitosamente", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "No se encontrarón datos", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(this, "Debes introducir un codigo de identificación", Toast.LENGTH_SHORT).show();
        }


    }*/
/*
    //Metodo para modificar

    public void modificar(View view){
        registromascotasbd admin = new registromascotasbd(this,"mascotas1",null,1);
        SQLiteDatabase db = admin.getWritableDatabase();

        String Scodigo = codigo.getText().toString();
        String Snombre = nombrem.getText().toString();
        String Sfecham = fecham.getText().toString();
        String Srazam = razam.getText().toString();

        if(!Scodigo.isEmpty() && !Snombre.isEmpty() && !Sfecham.isEmpty() && !Srazam.isEmpty()){
            ContentValues registrom = new ContentValues(); //contenido de los campos
            registrom.put("codigo",Scodigo); //guardar codigo
            registrom.put("nombrem",Snombre); //guardar nombre
            registrom.put("fechan",Sfecham); //guardar fecha
            registrom.put("razam",Srazam); //guardar raza

            int cantidad = db.update("mascotas",registrom,"codigo=" + Scodigo, null);
            db.close();
            codigo.setText("");
            nombrem.setText("");
            fecham.setText("");
            razam.setText("");

            if(cantidad == 1){
                Toast.makeText(this, "Datos de la mascota modificados correctamente", Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this, "No se encontrarón datos", Toast.LENGTH_SHORT).show();
            }

        }else{
            Toast.makeText(this, "Debes llenar todos los campos", Toast.LENGTH_SHORT).show();
        }

    }*/

}