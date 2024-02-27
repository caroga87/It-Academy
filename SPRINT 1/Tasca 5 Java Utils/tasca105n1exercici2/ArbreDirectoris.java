package tasca105n1exercici2;

import java.io.File;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class ArbreDirectoris {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
	    String rutaDirectori ="args[0]";
	    
	    if (args.length !=1) {
	    	System.out.println("Si us plau, escriu la ruta del directori");
	    	rutaDirectori = input.nextLine();
	    	}
	    ordenarAlfabeticamentDirectori (rutaDirectori);
	    input.close();
	    	
	    }
		
	public static void ordenarAlfabeticamentDirectori (String rutaDirectori) {
		
		File directorio = new File (rutaDirectori);
			
			if (directorio.exists()) {
				
				File [] arxius = directorio.listFiles();
				Arrays.sort(arxius);
				
				for(int i =0; i< arxius.length; i++) {
					Date novaData = new Date(arxius[i].lastModified());
					
					if (arxius[i].isFile()) {
						
						System.out.println("-> F " +arxius[i].getName()+" "+novaData.toString());
					
					} else if (arxius[i].isDirectory()) {
						
						System.out.println("-> D " +arxius[i].getName()+" "+novaData.toString());
						
						ordenarAlfabeticamentDirectori(arxius[i].getAbsolutePath());
					}
				}
			}else {
				System.out.println("El directori o la ruta no existeixen");
		}
	}


}
