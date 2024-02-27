package tasca105n1exercici4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TxtConsola {
	
	public static void main(String[] args) {
		
		llegirTxt ("C:/Users/rocac/Downloads/resultats.txt");
		
	}
	
	
	static void llegirTxt (String fitxer) {
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

}
