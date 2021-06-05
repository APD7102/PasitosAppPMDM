package es.studium.pasitosapp.modelos;

import androidx.annotation.NonNull;

public class Datos
{
    private double latitud;
    private double longitud;
    private int bateria;

    private long id;

    public Datos(double latitud, double longitud, int bateria){
        this.latitud = latitud;
        this.longitud = longitud;
        this.bateria = bateria;
    }

    //Constructor para cuando instanciamos la BD
    public Datos(double latitud, double longitud, int bateria, long id){
        this.latitud = latitud;
        this.longitud = longitud;
        this.bateria = bateria;
        this.id = id;
    }

    public long getId(){return id;}

    public void setId(long id){this.id=id;}

    public double getLatitud(){return latitud;}

    public void setLatitud(double latitud){this.latitud=latitud;}

    public double getLongitud(){return longitud;}

    public void setLongitud(double longitud){this.longitud=longitud;}

    public int getBateria() {return bateria;}

    public void setBateria(int bateria){this.bateria=bateria;}

}
