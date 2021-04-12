package com.example.help_pets;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;


public class registromascotasbd extends SQLiteOpenHelper {

    public registromascotasbd(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase BaseDeDatos3) {
        BaseDeDatos3.execSQL("create table mascotas(codigo int primary key, nombrem text, tipo text, sexo text, fechan text, razam text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
