package tasca105n1exercici1;
import java.util.Scanner;
import java.io.File;

public class Directory {
  
	    public static void main(String[] args) {
	    	
	    	Scanner input = new Scanner (System.in);
	    	String rutaDirectori ="args[0]";
	    	
	    	
	    	if (args.length !=1) {
	    		System.out.println("Si us plau, escriu la ruta del directori");
	    		rutaDirectori = input.nextLine();
	    	}
	    	
	    	ordenarAlfabeticamentDirectori(rutaDirectori);
	    	input.close();
	    	
	    }
	    
	    public static void ordenarAlfabeticamentDirectori(String rutaDirectori) {
	        File directory = new File(rutaDirectori);
	        if (directory.exists()) {
	            System.out.println("El contingut ordenat és:");
	            File[] files = directory.listFiles();
	            for (File file : files) {
	                System.out.println(file);
	            }
	        } else {
	            System.out.println("No existeix directori en aquesta ruta");
	        }
	    }
	    }
	    	 
	       
	 
	

