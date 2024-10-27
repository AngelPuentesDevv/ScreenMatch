package com.angelpuentesdevv.screenmatch.modelos;//Clase modelo que representa los atributos de una película real

import com.angelpuentesdevv.screenmatch.calculos.Clasificacion;

public class Pelicula extends Titulo implements Clasificacion {

    private String director;

    public Pelicula(String nombre, int fechaDeLanzamiento) {
        super(nombre, fechaDeLanzamiento);
    }

    @Override
    public int getClasificacion() {
        return (int) (calculaMediaTitulo() / 2);
    }

    @Override
    public String toString() {
        return this.getNombre() + " (" + getFechaDeLanzamiento() + ")";
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

}
