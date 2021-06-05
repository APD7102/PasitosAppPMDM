package es.studium.pasitosapp.controllers;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import es.studium.pasitosapp.AyudanteBaseDeDatos;
import es.studium.pasitosapp.modelos.Datos;

public class PasitosController {
    private AyudanteBaseDeDatos ayudanteBaseDeDatos;
    private String NOMBRE_TABLA = "datosPasitos";

    public PasitosController(Context context){
        ayudanteBaseDeDatos = new AyudanteBaseDeDatos(context);
    }

    //Introducir datos en la BD
    public long nuevoDatos(Datos datos){
        SQLiteDatabase baseDeDatos = ayudanteBaseDeDatos.getWritableDatabase();
        ContentValues datosParaInsertar = new ContentValues();
        datosParaInsertar.put("latitud", datos.getLatitud());
        datosParaInsertar.put("longitud", datos.getLongitud());
        datosParaInsertar.put("bateria", datos.getBateria());
        return baseDeDatos.insert(NOMBRE_TABLA, null, datosParaInsertar);
    }


}
