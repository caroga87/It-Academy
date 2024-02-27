package tasca105n1exercici3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class ArbreDirectoriTxt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
	    String rutaDirectori ="args[0]";
	    
	    if (args.length !=1) {
	    	System.out.println("Si us plau, escriu la ruta del directori");
	    	rutaDirectori = input.nextLine();
	    	}
	    ordenarAlfabeticamentDirectori2 (rutaDirectori);
	    input.close();
	    	
	}
	public static void ordenarAlfabeticamentDirectori2 (String rutaDirectori) {
		
		File directorio = new File (rutaDirectori);
			
			if (directorio.exists()) {
				File [] arxius = directorio.listFiles();
				Arrays.sort(arxius);
				
				for(int i =0; i< arxius.length; i++) {
					Date novaData = new Date(arxius[i].lastModified());
					
					if (arxius[i].isFile()) {
						
						escriureDadesTxt("-> F " +arxius[i].getName()+novaData.toString());
					
					} else if (arxius[i].isDirectory()) {
						
						escriureDadesTxt("-> D " +arxius[i].getName()+novaData.toString());
						
						ordenarAlfabeticamentDirectori2(arxius[i].getAbsolutePath());
					}
													}
			}else {
				System.out.println("El directori o la ruta no existeixen");
		}
			
	}
	static void escriureDadesTxt (String frase) {
		
		try {
			FileWriter escriptura = new FileWriter ("C:/Users/rocac/Downloads/directori.txt", true); 
				for (int i=0; i<frase.length(); i++) {
				
						escriptura.write(frase.charAt(i));
					}
				
				escriptura.close();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
