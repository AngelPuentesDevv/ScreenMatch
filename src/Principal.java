import com.angelpuentesdevv.screenmatch.modelos.Pelicula;
import com.angelpuentesdevv.screenmatch.modelos.Serie;

public class Principal {

    public static void main(String[] args) {
        //Crear modelo u objeto de tipo película
        //La palabra reservada new crea una instancia de la clase modelo
        Pelicula miPelicula = new Pelicula();
        Serie miSerie = new Serie();

        //Métodos que ofrece la clase com.angelpuentesdevv.screenmatch.modelos.Pelicula "miPelicula.[método]", se pueden atribuir valores
        miPelicula.setNombre("Se levanta el viento");
        miPelicula.setFechaDeLanzamiento(2013);
        miPelicula.setDuracionEnMinutos(126);
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.muestraFichaTecnica();
        miPelicula.evaluaTitulo(8.0);
        miPelicula.evaluaTitulo(9.0);
        miPelicula.evaluaTitulo(10);
        System.out.println(miPelicula.getTotalDeLasEvaluaciones());
        System.out.println(miPelicula.calculaMediaTitulo());

        miSerie.setNombre("Death Note");
        miSerie.setFechaDeLanzamiento(2006);
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
    }
}