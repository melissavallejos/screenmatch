package com.vallejos.screenmatch.modelos;

import com.vallejos.screenmatch.calculos.Clasificable;

public class Pelicula extends Titulo implements Clasificable {
    private String director;



    public Pelicula(String nombre, int fechaDeLanzamiento) {
        super(nombre, fechaDeLanzamiento);
    }


    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClasificacion() {
        return (int) calculaMediaEvaluaciones() / 2;
    }

    @Override
    public String toString() {
        return "Pelicula: " + this.getNombre() + " (" + this.getFechaDeLanzamiento() + ")";
    }
}
