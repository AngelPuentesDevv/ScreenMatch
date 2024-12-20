package com.angelpuentesdevv.screenmatch.principal;

import com.angelpuentesdevv.screenmatch.calculos.CalculadoraDeTiempo;
import com.angelpuentesdevv.screenmatch.calculos.FiltroRecomendacion;
import com.angelpuentesdevv.screenmatch.modelos.Episodio;
import com.angelpuentesdevv.screenmatch.modelos.Pelicula;
import com.angelpuentesdevv.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        //Crear modelo u objeto de tipo película
        //La palabra reservada new crea una instancia de la clase modelo
        Pelicula miPelicula = new Pelicula("Se levanta el viento", 2013);
        //Métodos que ofrece la clase com.angelpuentesdevv.screenmatch.modelos.Pelicula "miPelicula.[método]", se pueden atribuir valores
        miPelicula.setDuracionEnMinutos(126);
        miPelicula.setIncluidoEnElPlan(true);

        Pelicula otraPelicula = new Pelicula("Test", 2024);
        otraPelicula.setIncluidoEnElPlan(true);
        otraPelicula.setDuracionEnMinutos(7);

        miPelicula.muestraFichaTecnica();
        miPelicula.evaluaTitulo(8);
        miPelicula.evaluaTitulo(5);
        miPelicula.evaluaTitulo(9);
        System.out.println(miPelicula.getTotalDeLasEvaluaciones());
        System.out.println(miPelicula.calculaMediaTitulo());

        Serie miSerie = new Serie("Death Note", 2006);
        miSerie.setTemporadas(1);
        miSerie.setEpisodiosPorTemporada(37);
        miSerie.setMinutosPorEpisodio(21);
        miSerie.setIncluidoEnElPlan(true);

        miSerie.muestraFichaTecnica();
        miSerie.evaluaTitulo(10);
        miSerie.evaluaTitulo(9.5);
        miSerie.evaluaTitulo(9.0);
        System.out.println(miSerie.getTotalDeLasEvaluaciones());
        System.out.println(miSerie.calculaMediaTitulo());
        System.out.println(miSerie.getDuracionEnMinutos());
        miSerie.muestraFichaTecnica();

        Episodio miEpisodio = new Episodio();
        miEpisodio.setNombre("Renacimiento");
        miEpisodio.setNumero(1);
        miEpisodio.setSerie(miSerie);
        miEpisodio.setTotalVisualizaciones(1);

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(miSerie);
        calculadora.incluye(otraPelicula);
        System.out.println("El tiempo que necesitas para ver los tres títulos es: " +calculadora.getTiempoTotal()+ " minutos.");

        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtra(miPelicula);
        filtroRecomendacion.filtra(miEpisodio);

        var spiritedAway = new Pelicula("Spirited Away", 2001);
        spiritedAway.setDuracionEnMinutos(125);

        ArrayList<Pelicula> listaDePeliculas = new ArrayList<>();
        listaDePeliculas.add(miPelicula);
        listaDePeliculas.add(spiritedAway);
        listaDePeliculas.add(otraPelicula);

        System.out.println("Tamaño de la lista: " + listaDePeliculas.size());
        System.out.println("La primera película de la lista es: " + listaDePeliculas.get(0).toString());

    }
}