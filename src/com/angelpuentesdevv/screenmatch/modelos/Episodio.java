package com.angelpuentesdevv.screenmatch.modelos;

import com.angelpuentesdevv.screenmatch.calculos.Clasificacion;

public class Episodio implements Clasificacion {

    private int numero;

    private String nombre;

    private Serie serie;

    private int totalVisualizaciones;


    @Override
    public int getClasificacion() {
        if (totalVisualizaciones >= 100){
            return 4;
        } else {
            return 1;
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

}
