<<<<<<< HEAD
package com.vallejos.screenmatch.modelos;

import com.vallejos.screenmatch.calculos.Clasificacion;

public class Pelicula extends Titulo implements Clasificacion {
   private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClasificacion() {
        return (int) (calculaMedia() / 2);
    }
}

=======
package com.vallejos.screenmatch.modelos;

import com.vallejos.screenmatch.calculos.Clasificacion;

public class Pelicula extends Titulo implements Clasificacion {
   private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClasificacion() {
        return (int) (calculaMedia() / 2);
    }
}

>>>>>>> 53776b72c78df407a32a72f42c28eb1e64545e3a
