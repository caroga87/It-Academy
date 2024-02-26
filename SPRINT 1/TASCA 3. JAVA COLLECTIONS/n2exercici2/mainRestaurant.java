package n2exercici2;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import n2exercici1.Restaurant;

public class mainRestaurant {
	
	public static void main(String[] args) {
      
		HashSet <Restaurant> restaurants = new HashSet <Restaurant>();

		Restaurant CanPere = new Restaurant ("Can Pere", 4);
		Restaurant Solana = new Restaurant ("Solana", 6);
		Restaurant Oliva = new Restaurant ("Oliva", 8);
		Restaurant Guinardo = new Restaurant ("Guinardo", 7);
		Restaurant LaParada = new Restaurant ("La Parada", 3);

        restaurants.add(CanPere);
        restaurants.add(Solana);
        restaurants.add(Oliva);
        restaurants.add(Guinardo);
        restaurants.add(LaParada);
        restaurants.add(new Restaurant ("Can Pere",5));
        restaurants.add(new Restaurant ("Oliva",5));
                
        
        Set<Restaurant> llistatRestaurant = new TreeSet<>(new Comparator<Restaurant>() {
	      @Override
	      public int compare(Restaurant r1, Restaurant r2) {
	          if (!r1.getNom().equals(r2.getNom())) {
	              return r1.getNom().compareTo(r2.getNom());
	          } else {
	              return Integer.compare(r1.getPuntuacio(), r2.getPuntuacio());
	          }
	      }
	  });
		
	llistatRestaurant.addAll(restaurants);
	
	System.out.println("Restaurants ordenats per nom i puntuació:");
        for (Restaurant restaurant : llistatRestaurant) {
            System.out.println("Nom: " + restaurant.getNom() + ", Puntuació: " + restaurant.getPuntuacio());
        }
    }
	

}


