package n2exercici1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class mainRestaurant {

	public static void main(String[] args) {
		
		Restaurant CanPere = new Restaurant ("Can Pere", 4);
		Restaurant Solana = new Restaurant ("Solana", 6);
		Restaurant Oliva = new Restaurant ("Oliva", 8);
		Restaurant Guinardo = new Restaurant ("Guinardo", 7);
		Restaurant LaParada = new Restaurant ("La Parada", 3);
		
		
		HashSet <Restaurant> llistatRestaurant = new HashSet <Restaurant>();
		
		llistatRestaurant.add(CanPere);
		llistatRestaurant.add(Solana);
		llistatRestaurant.add(Oliva);
		llistatRestaurant.add(Guinardo);
		llistatRestaurant.add(LaParada);
		llistatRestaurant.add(new Restaurant ("Can Pere",5));
		llistatRestaurant.add(new Restaurant ("Oliva",5));
		llistatRestaurant.add(new Restaurant ("Can Pere",5));
		llistatRestaurant.add(new Restaurant ("Guinardo", 7));
		
		
		System.out.println("Llistat de restaurants:");
		for(Restaurant restaurant : llistatRestaurant) {
			System.out.println(restaurant.toString());
		}
		
		
	}
		

}
