package n3exercici1;

import java.util.Comparator;

class ComparadorCognom implements Comparator<Persona> {
    @Override
    public int compare(Persona p1, Persona p2) {
        
        return p1.getCognom().compareTo(p2.getCognom());
    }
}