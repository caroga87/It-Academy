package n1exercici2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Llista {
    public static void main(String[] args) {
        // Creació i emplenament de la primera llista
        List<Integer> llista1 = new ArrayList<>();
        llista1.add(1);
        llista1.add(2);
        llista1.add(3);
        llista1.add(4);
        llista1.add(5);
        
        // Creació de la segona llista
        List<Integer> llista2 = new ArrayList<>();
        
        
        // Utilitzant un ListIterator per llegir els elements de la primera llista i inserir-los en la segona
        ListIterator<Integer> iterator = llista1.listIterator(llista1.size());
        while (iterator.hasPrevious()) {
            Integer element = iterator.previous();
            llista2.add(element);
        }
        
        // Mostrem la segona llista amb els elements inserits en ordre invers
        System.out.println("Segona llista amb elements de la primera en ordre invers:");
        for (Integer num : llista2) {
            System.out.println(num);
        }
    }
}
