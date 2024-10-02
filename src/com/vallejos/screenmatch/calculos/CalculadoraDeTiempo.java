package com.vallejos.screenmatch.calculos;

import com.vallejos.screenmatch.modelos.Pelicula;
import com.vallejos.screenmatch.modelos.Serie;
import com.vallejos.screenmatch.modelos.Titulo;

public class CalculadoraDeTiempo {
    private int tiempoTotal;

     public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void incluye(Titulo titulo) {
      this.tiempoTotal += titulo.getDuracionEnMinutos();
    }




}
