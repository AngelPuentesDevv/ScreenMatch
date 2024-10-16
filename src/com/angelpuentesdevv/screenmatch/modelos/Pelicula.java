package com.angelpuentesdevv.screenmatch.modelos;//Clase modelo que representa los atributos de una película real

import com.angelpuentesdevv.screenmatch.calculos.Clasificacion;

public class Pelicula extends Titulo implements Clasificacion {

    private String director;

    @Override
    public int getClasificacion() {
        return 0;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

}
