package n2exercici2;
import java.util.*;

class Restaurant implements Comparable<Restaurant> {
   
	private String nom;
    private int puntuacio;

    public Restaurant(String nom, int puntuacio) {
        this.nom = nom;
        this.puntuacio = puntuacio;
    }
        
    public String getNom() {
        return nom;
    }

    public int getPuntuacio() {
        return puntuacio;
    }
    

    @Override
    public int hashCode() {
        return Objects.hash(nom, puntuacio);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Restaurant restaurant = (Restaurant) obj;
        return puntuacio == restaurant.puntuacio && Objects.equals(nom, restaurant.nom);
    }

    @Override
    public int compareTo(Restaurant other) {
        if (!this.nom.equals(other.nom)) {
            return this.nom.compareTo(other.nom);
        } else {
            return Integer.compare(this.puntuacio, other.puntuacio);
        }
    }
	public String toString () {
		return "El restaurant " +nom +" té una puntuació de " +puntuacio;
	}
   
   }
 


