package com.example.help_pets;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class vacunasbd extends SQLiteOpenHelper {

    public vacunasbd(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase BaseDeDatosvacunas) {
        BaseDeDatosvacunas.execSQL("create table vacunas(codigo int primary key, nombrem text, fechan text, nombrev text, fechav text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
