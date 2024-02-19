package tasca103n1exercici3;
import java.util.*;
import java.io.*;


public class PaisosCapitals {
	public static void main (String[] args) {
				
		//Llegir el fitxer
				
		llegir("C:/Users/rocac/Downloads/countries.txt");
		
		//Guardar les dades del fitxer en HashMap
		
		HashMap <String, String> paisosCapitals= afegirDadesMap("C:/Users/rocac/Downloads/countries.txt");
		
		//Demana el nom a l'usuari
		Scanner input =new Scanner (System.in);
		System.out.println("Introdueix el teu nom:");
		String nomUsuari=input.nextLine();
		
			
		//Variables pel joc
		int puntuacio= 0;
		int numPreguntes =10;
		
		
		//inici del joc
		for (int i=0; i < numPreguntes; i++) {
			String pais = obtencioPaisRandom (paisosCapitals);
			System.out.println("Quina és la capital de " +pais +"?");
			String respostaUsuari = input.nextLine();
			
			String respostaCorrecte = paisosCapitals.get(pais);
			
			// comprovacio de resposta
			
			if (respostaUsuari != null && respostaUsuari.equalsIgnoreCase(respostaCorrecte)) {
				puntuacio++;
				System.out.println("Enhorabona, resposta correcte!" );
			}else {
				System.out.println("Has fallat! La resposta correcte és " +respostaCorrecte);
			}
		}
		
		System.out.println("El joc ha finalitzat " +nomUsuari +" i has obtingut un total de " +puntuacio +" punts!");
		 // desar la puntuació en un document txt
		escriureDadesTxt ("El jugador " +nomUsuari +" ha obtingut un total de " +puntuacio +" punts");
		
		
	}
	
	static void llegir (String fitxer) {
		try {
			
			BufferedReader mibuffer = new BufferedReader(new FileReader(fitxer)); // guardem les dades en un buffer per facilitar la lectura
			
			String linia="";
			
			while(linia!=null) {
				
				linia=mibuffer.readLine();
				
				if(linia!=null) // perque no imprimeixi el null
				System.out.println(linia);
			}
			mibuffer.close();
		} catch (IOException e) { // per capturar excepcions controlades
			// TODO Auto-generated catch block
			System.out.println("No s'ha trobat l'arxiu");
		}
	}
	
	static HashMap<String, String> afegirDadesMap (String fitxer){
		HashMap<String, String> paisosCapitals= new HashMap <>();
		 try {
			 BufferedReader br = new BufferedReader(new FileReader(fitxer)); 
		 
			 String linia="";
	            while ((linia = br.readLine()) != null) {
	            	
	            	String []parts = linia.split(" ");
	    			
	            	//String pais = parts [0].trim();
	    			//String capital = parts [1].trim();
	    			
	    			if (parts.length >= 2) {
	    				paisosCapitals.put(parts [0], parts [1]);
	    			}
	    		}
	            
	        } catch (IOException e) {
	            System.err.println("Error en llegir el fitxer");
	        }
		 return paisosCapitals;
	}
	
	static String obtencioPaisRandom (HashMap<String, String>paisosCapitals ) {
		Object [] paisosArray = paisosCapitals.keySet().toArray();
			int indexRandom = (int) (Math.random() * paisosArray.length);
				return (String) paisosArray[indexRandom];
	}
	
	static void escriureDadesTxt (String frase) {
		
		try {
			FileWriter escriptura = new FileWriter ("C:/Users/rocac/Downloads/resultats.txt", true); // posem true perque si el document existeix, ho escrigui a continuacio sense esborrar els resultats d'altres jugadors.
									
				for (int i=0; i<frase.length(); i++) {
				
						escriptura.write(frase.charAt(i));
					}
				
			System.out.println("La puntuació s'ha guardat correctament");
			
			escriptura.close();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}


