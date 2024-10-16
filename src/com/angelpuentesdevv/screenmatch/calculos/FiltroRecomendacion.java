package com.angelpuentesdevv.screenmatch.calculos;

public class FiltroRecomendacion {

    public void filtra(Clasificacion clasificacion){
        if (clasificacion.getClasificacion() >= 4){
            System.out.println("Te recomendamos ver esto!");
        } else if (clasificacion.getClasificacion() >= 2){
            System.out.println("Buen contenido para ver");
        } else {
            System.out.println("Agregalo a tu lista!");
        }
    }
}
