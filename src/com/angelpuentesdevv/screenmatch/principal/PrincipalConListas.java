package com.angelpuentesdevv.screenmatch.principal;

import com.angelpuentesdevv.screenmatch.modelos.Pelicula;
import com.angelpuentesdevv.screenmatch.modelos.Serie;
import com.angelpuentesdevv.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalConListas {

    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula("Se levanta el viento", 2013);
        miPelicula.evaluaTitulo(9);
        Pelicula otraPelicula = new Pelicula("Test", 2024);
        otraPelicula.evaluaTitulo(10);
        var spiritedAway = new Pelicula("Spirited Away", 2001);
        spiritedAway.evaluaTitulo(9.9);
        Serie miSerie = new Serie("Death Note", 2006);
        miSerie.evaluaTitulo(10);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(miPelicula);
        lista.add(spiritedAway);
        lista.add(otraPelicula);
        lista.add(miSerie);

        for (Titulo item : lista) {
            System.out.println(item.getNombre());
            if (item instanceof Pelicula pelicula && pelicula.getClasificacion() > 2) {
                System.out.println(pelicula.getClasificacion());
            }
        }

        //Ordenar listas :D
        ArrayList<String> listaDeArtistas = new ArrayList<>();
        listaDeArtistas.add("HOYO-MIX");
        listaDeArtistas.add("Yu-Peng Cheng");
        listaDeArtistas.add("Yoshihisa Hirano");
        System.out.println("Lista de artistas no ordenada: " + listaDeArtistas);

        Collections.sort(listaDeArtistas);
        System.out.println("Lista de artistas ordenada: " + listaDeArtistas);

        Collections.sort(lista);
        System.out.println("Lista de titulos ordenada: " +  lista);

        lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));
        System.out.println(lista);
    }
}
