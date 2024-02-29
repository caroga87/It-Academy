package n1exercici3;
import java.util.*;
import java.io.*;

public class PaisosCapitals {
	
 public static void main (String[] args) {
	
	String pais="";
	String respostaUsuari="";
	String respostaCorrecte="";
	int puntuacio=0;
	String nomUsuari="";
	
	System.out.println("El fitxer countries conté el següent:");
	llegirFitxer("./n1exercici3/countries.txt");
	
	HashMap<String, String> paisosCapitals= new HashMap <>();	
	afegirDadesHashMap("./n1exercici3/countries.txt", paisosCapitals);
	
	nomUsuari= demanaString("Introdueix el teu nom:");
					
		
	System.out.println("Comença el joc:");
		
	for (int i=0; i< 10; i++) {
		pais=obtencioPaisRandom (paisosCapitals);
		respostaUsuari = demanaString ("Quina és la capital de " +pais +"?");
		respostaCorrecte =paisosCapitals.get(pais);
	
	
	if (respostaUsuari != null && respostaUsuari.equalsIgnoreCase(respostaCorrecte)) {
		puntuacio++;
		System.out.println("Enhorabona, resposta correcte!" );
	}else {
		System.out.println("Has fallat! La resposta correcte és " +respostaCorrecte);
	}
	}
	
			 
	escriureDadesFitxer ("El jugador " +nomUsuari +" ha obtingut un total de " +puntuacio +" punts", "./n1exercici3/resultat.txt");
	System.out.println("El joc ha finalitzat " +nomUsuari +" i has obtingut un total de " +puntuacio +" punts!");

}


static void llegirFitxer (String fitxer) {
	try {
		
		BufferedReader mibuffer = new BufferedReader(new FileReader(fitxer));
		String linia="";
		
		while(linia!=null) {
			
			linia=mibuffer.readLine();
			
			if(linia!=null) 
			System.out.println(linia);
		}
		mibuffer.close();
	} catch (IOException e) { 
		// TODO Auto-generated catch block
		System.out.println("No s'ha trobat l'arxiu");
	}
}

static HashMap<String, String> afegirDadesHashMap (String fitxer, HashMap<String, String> nouHashMap){
			 
	try {
		 BufferedReader br = new BufferedReader(new FileReader(fitxer)); 
	 
		 String linia="";
	    while ((linia = br.readLine()) != null) {
		
		String []parts = linia.split(" ");
							
			if (parts.length >= 2) {
				nouHashMap.put(parts [0], parts [1]);
			}
		}
	    
	} catch (IOException e) {
		    System.err.println("Error en llegir el fitxer");
		}
		 return nouHashMap;
}

static String obtencioPaisRandom (HashMap<String, String> nouHashMap ) {
	Object [] keysHashMap = nouHashMap.keySet().toArray();
		
		int indexRandom = (int) (Math.random() * keysHashMap.length);
			
			return  (String) keysHashMap[indexRandom];
}	

static void escriureDadesFitxer (String frase, String fitxerResultat) {
	
	try {
		FileWriter escriptura = new FileWriter (fitxerResultat, true); 
								
			for (int i=0; i<frase.length(); i++) {
			
					escriptura.write(frase.charAt(i));
				}
			
		System.out.println("El resultat s'ha guardat correctament");
		
		escriptura.close();
	
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

static String demanaString (String missatge) {
	Scanner input =new Scanner (System.in);
	System.out.println(missatge);
	return input.nextLine();
}


}
	


