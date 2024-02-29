package n2exercici1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainNoms {
	
	 public static void main(String[] args) {
		 
	        List<String> llistaNoms = Arrays.asList("Anna", "Maria", "Arnau", "Eva", "Abel", "Leo", "Carla", "ainhoa","Pau");
	        
	        List<String>llistaFiltrada = new ArrayList<>();
	        
	        llistaNoms.stream().filter(nom->nom.length()==3 || nom.charAt(0)== 'A').forEach(word->llistaFiltrada.add(word));
	  
	        
	        llistaFiltrada.forEach(System.out::println);
	 }

}
