package com.angelpuentesdevv.screenmatch.modelos;

public class Titulo {

    //Atributos que representan las características del objeto

    private String nombre;

    private int fechaDeLanzamiento;

    private int duracionEnMinutos;

    private boolean incluidoEnElPlan;

    private double sumaDeLasEvaluaciones;

    private int totalDeLasEvaluaciones;

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

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
        System.out.println("Película: " + nombre);
        System.out.println("Fecha de Lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Duración: " + duracionEnMinutos + " minutos");
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

}
