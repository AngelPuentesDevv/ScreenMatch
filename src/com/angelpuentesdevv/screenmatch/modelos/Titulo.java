package com.angelpuentesdevv.screenmatch.modelos;

public class Titulo implements Comparable<Titulo> {

    //Atributos que representan las características del objeto

    private String nombre;

    private int fechaDeLanzamiento;

    private int duracionEnMinutos;

    private boolean incluidoEnElPlan;

    private double sumaDeLasEvaluaciones;

    private int totalDeLasEvaluaciones;

    //Creación de constructor

    public Titulo(String nombre, int fechaDeLanzamiento) {
        this.nombre = nombre;
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    // Los getters y setters son métodos que me ayudan a modificar y leer los valores de los atributos desde otras clases.

    public String getNombre() {
        return nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public boolean isIncluidoEnElPlan() {
        return incluidoEnElPlan;
    }

    public int getTotalDeLasEvaluaciones() {
        return totalDeLasEvaluaciones;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }

    //Creación de un nuevo método (Convención: verbos en imperativo)

    public void muestraFichaTecnica(){
        System.out.println("Título: " + nombre);
        System.out.println("Fecha de Lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
    }

    //Este método recibe un parámetro
    public void evaluaTitulo(double nota){
        sumaDeLasEvaluaciones += nota;
        //Esta linea significa sumaDeLasEvaluaciones = sumaDeLasEvaluaciones + nota
        totalDeLasEvaluaciones++;
    }

    public double calculaMediaTitulo(){
        return sumaDeLasEvaluaciones / totalDeLasEvaluaciones;
    }

    @Override
    public int compareTo(Titulo otroTitulo) {
        return this.getNombre().compareTo(otroTitulo.getNombre());
    }
}
