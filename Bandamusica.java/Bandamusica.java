public package dominio;

import java.util.ArrayList;
import java.util.List;

public class BandaMusica {
    private String nombre;
    private List<Actuacion> actuaciones;

    public BandaMusica(String nombre) {
        this.nombre = nombre;
        this.actuaciones = new ArrayList<>();
    }

    public void annadirActuacion(Actuacion actuacion) {
        actuaciones.add(actuacion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BANDA DE MÚSICA DE VILLAR DEL MONTE\n");
        for (Actuacion actuacion : actuaciones) {
            sb.append(actuacion.toString()).append("\n");
        }
        return sb.toString();
    }
}
 {
    
}
package dominio;

import java.util.ArrayList;
import java.util.List;

public class BandaMusica {
    private String nombre;
    private List<Actuacion> actuaciones;

    public BandaMusica(String nombre) {
        this.nombre = nombre;
        this.actuaciones = new ArrayList<>();
    }

    public void annadirActuacion(Actuacion actuacion) {
        actuaciones.add(actuacion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BANDA DE MÚSICA DE VILLAR DEL MONTE\n");
        for (Actuacion actuacion : actuaciones) {
            sb.append(actuacion.toString()).append("\n");
        }
        return sb.toString();
    }
}
