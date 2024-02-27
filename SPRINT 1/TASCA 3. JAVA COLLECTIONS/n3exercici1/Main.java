package n3exercici1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
				
		 ArrayList <Persona> llista = new ArrayList <Persona>();
		 
		 carregarFitxerCSV("C:\\Users\\rocac\\eclipse-workspace\\Sprint1\\Tasca 3 Java Collections\\n3exercici1/FitxerPersones.cvs");
		 
		 int opcio;
		
			do {
				
				opcio = menuSwitch();
				
				switch (opcio) {
				
				case 1:
					introduirPersona(llista);
					break;
				case 2:
					llistaNomAz (llista);
					break;
				case 3:
					llistaNomZa (llista);
					break;
				case 4:
					llistaCognomAz (llista);
					break;
				case 5:
					llistaCognomZa (llista);
					break;
				case 6:
					llistaDniAsc(llista);
					break;
				case 7:
					llistaDniDesc(llista);
					break;
				case 0:
					System.out.println("Has finalitzat el programa.");
					break;
				default:
	                System.out.println("Opció no vàlida!");
	        }
	    } while (opcio != 0);
	    
	    input.close();
}
	
	
    
    private static void introduirPersona(ArrayList <Persona> llista) {
     
        System.out.println("Introdueix el nom: ");
        String nom = input.nextLine();
        System.out.println("Introdueix el cognom: ");
        String cognom = input.nextLine();
        System.out.println("Introdueix el DNI: ");
        String dni = input.nextLine();

        // Crear una nova instància de la classe Persona amb les dades introduïdes
        Persona novaPersona = new Persona(nom, cognom, dni);

        // Afegir la nova persona a la llista de persones
        llista.add(novaPersona);

        // Actualitzar el fitxer CSV amb la nova persona
        actualitzarFitxerCSV("C:\\Users\\rocac\\eclipse-workspace\\Sprint1\\Tasca 3 Java Collections\\n3exercici1/FitxerPersones.cvs"
        						, novaPersona);
    }
    
    private static void actualitzarFitxerCSV(String nomFitxer, Persona novaPersona) {
    	
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomFitxer, true))) {
                        
        	writer.write(novaPersona.getNom() + "," + novaPersona.getCognom() + "," + novaPersona.getDNI() + "\n");
            
        	System.out.println("Nova persona afegida al fitxer CSV.");
        	
        } catch (IOException e) {
        	
            e.printStackTrace();
        }
    }
			
    private static void carregarFitxerCSV(String nomFitxer) {
    	
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomFitxer))) {
      
           	System.out.println("Fitxer CSV creat amb èxit: " + nomFitxer);
        	
        } catch (IOException e) {
            
        	e.printStackTrace();
        }
    }
    
    private static void llistaNomAz(ArrayList <Persona> llista) {
        
    	List<Persona> copia = new ArrayList<>(llista);
        
    	Collections.sort(copia, Comparator.comparing(Persona::getNom));
       
    	mostrarLlistaPersones(copia);
    }

    private static void llistaNomZa(ArrayList <Persona> llista) {
        List<Persona> copia = new ArrayList<>(llista);
        
        copia.sort((p1, p2) -> p2.getNom().compareTo(p1.getNom()));
       
        mostrarLlistaPersones(copia);
    }

    private static void llistaCognomAz(ArrayList <Persona> llista) {
        List<Persona> copia = new ArrayList<> (llista);
        
        Collections.sort(copia, Comparator.comparing(Persona::getCognom));
        
        mostrarLlistaPersones(copia);
    }

    private static void llistaCognomZa(ArrayList <Persona> llista) {
        
    	List<Persona> copia = new ArrayList<>(llista);
        
    	copia.sort((p1, p2) -> p2.getCognom().compareTo(p1.getCognom()));
        
    	mostrarLlistaPersones(copia);
    }

    private static void llistaDniAsc(ArrayList <Persona> llista) {
        
    	List<Persona> copia = new ArrayList<>(llista);
        
    	Collections.sort(copia, Comparator.comparing(Persona::getDNI));
        
    	mostrarLlistaPersones(copia);
    }

    private static void llistaDniDesc(ArrayList <Persona> llista) {
        List<Persona> copia = new ArrayList<>(llista);
        
        copia.sort((p1, p2) -> p2.getDNI().compareTo(p1.getDNI()));
        
        mostrarLlistaPersones(copia);
    }

    private static void mostrarLlistaPersones(List<Persona> persones) {
        
    	System.out.println("\n___Nom___      ____Cognoms___    __NIF__");
        
    	for (Persona persona : persones) {
           
    		System.out.println(persona);
        }
    }
		
	static int menuSwitch () {
		int opcio;
		System.out.println("1.- Introduir persona.");
		System.out.println("2.- Mostrar les persones ordenades per nom (A-Z).");
		System.out.println("3.- Mostrar les persones ordenades per nom (Z-A).");
		System.out.println("4.- Mostrar les persones ordenades per cognoms (A-Z).");
		System.out.println("5.- Mostrar les persones ordenades per cognoms (Z-A).");
		System.out.println("6.- Mostrar les persones ordenades per DNI (1-9).");
		System.out.println("7.- Mostrar les persones ordenades per DNI (9-1).");
		System.out.println("0.- Sortir.");
		opcio=input.nextInt();
		input.nextLine();
		
		return opcio;
		
	}

}
