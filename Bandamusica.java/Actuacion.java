public class Actuacion {
    package dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Actuacion {
    private LocalDate fecha;
    private List<Persona> participantes;

    public Actuacion(LocalDate fecha) {
        this.fecha = fecha;
        this.participantes = new ArrayList<>();
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void annadirParticipante(Persona participante) {
        participantes.add(participante);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Fecha de actuación: ").append(fecha).append("\n");
        for (Persona participante : participantes) {
            sb.append(participante.toString()).append("\n");
        }
        return sb.toString();
    }
}

}
