package n3exercici1;

import java.util.Comparator;

class ComparadorDNI implements Comparator<Persona> {
    @Override
    public int compare(Persona p1, Persona p2) {
        // Comparació per DNI
        return p1.getDni().compareTo(p2.getDni());
    }
}