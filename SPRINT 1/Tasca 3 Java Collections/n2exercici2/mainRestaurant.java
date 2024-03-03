package n2exercici2;

import java.util.HashSet;
import java.util.TreeSet;

public class mainRestaurant {
	
	public static void main(String[] args) {
      
		HashSet <Restaurant> llistatRestaurant = new HashSet <Restaurant>();
		
		Restaurant CanPere = new Restaurant ("Can Pere", 4);
		Restaurant Solana = new Restaurant ("Solana", 6);
		Restaurant Oliva = new Restaurant ("Oliva", 8);
		Restaurant Guinardo = new Restaurant ("Guinardo", 7);
		Restaurant LaParada = new Restaurant ("La Parada", 3);
		
		llistatRestaurant.add(CanPere);
		llistatRestaurant.add(Solana);
		llistatRestaurant.add(Oliva);
		llistatRestaurant.add(Guinardo);
		llistatRestaurant.add(LaParada);
		llistatRestaurant.add(new Restaurant ("Can Pere",5));
		llistatRestaurant.add(new Restaurant ("Oliva",5));
		llistatRestaurant.add(new Restaurant ("Can Pere",5));
		llistatRestaurant.add(new Restaurant ("Guinardo", 7));
		
        TreeSet <Restaurant>restaurantsOrdenats = new TreeSet <Restaurant> (llistatRestaurant);       
     	
		System.out.println("Restaurants ordenats per nom i puntuació:");
		
	        for (Restaurant restaurant : restaurantsOrdenats) {
	        	
	            System.out.println("Nom: " + restaurant.getNom() + ", Puntuació: " + restaurant.getPuntuacio());
	        }
    }
	

}


