package n3exercici1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	
        List<Persona> persones = llegirFitxerCSV("fitxer.csv");
        persones.add(new Persona("Andreu", "Ballestero Llenas", "34835767J"));
        persones.add(new Persona("Miquel", "Bayona Font", "48743957B"));
        persones.add(new Persona("Guillem", "Capdevila Riu", "33957834J"));
        persones.add(new Persona("Albert", "Carbonell Ferrer", "77364986R"));
        persones.add(new Persona("Ferran", "Casas Coderch", "23047848P"));
        persones.add(new Persona("Maria", "Casellas Fuste", "47102244S"));
        persones.add(new Persona("Genis", "Ciutat Vendrell", "39718459N"));

        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            mostrarMenu();
            option = scanner.nextInt();

            switch (option) {
            	case 1:
                    afegirPersona(persones, scanner);
                    break;
                case 2:
                    ordenarPerNom(persones);
                    break;
                case 3:
                    ordenarPerNomInvers(persones);
                    break;
                case 4:
                    ordenarPerCognom(persones);
                    break;
                case 5:
                    ordenarPerCognomInvers(persones);
                    break;
                case 6:
                    ordenarPerDNI(persones);
                    break;
                case 7:
                    ordenarPerDNIInvers(persones);
                    break;
                default:
                    break;
            }

            if (option >= 2 && option <= 7) {
                mostrarPersones(persones);
            }
        } while (option != 0);
        escriureFitxerCSV(persones, "fitxer.csv");

        scanner.close();
    }

    private static List<Persona> llegirFitxerCSV(String nomFitxer) {
        List<Persona> persones = new ArrayList<>();

        try (Scanner scanner = new Scanner(new FileReader(nomFitxer))) {
        	
            while (scanner.hasNextLine()) {
                
            	String line = scanner.nextLine();
            	
                String[] parts = line.split(",");
                
                if (parts.length == 3) {
                    
                	persones.add(new Persona(parts[0], parts[1], parts[2]));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return persones;
    }
    
    private static void escriureFitxerCSV(List<Persona> persones, String nomFitxer) {
        try (FileWriter writer = new FileWriter(nomFitxer, true)) {
            
            writer.append("___Nom___,____Cognoms___,__NIF__\n");

             for (Persona persona : persones) {
                writer.append(persona.getNom())
                      .append(",")
                      .append(persona.getCognom())
                      .append(",")
                      .append(persona.getDni())
                      .append("\n");
            }

           System.out.println("Fitxer CSV creat amb èxit.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private static void afegirPersona(List<Persona> persones, Scanner scanner) {
     
        System.out.println("Introdueix el nom:");
        String nom = scanner.next();
        System.out.println("Introdueix el cognom:");
        String cognom = scanner.next();
        System.out.println("Introdueix el Dni:");
        String dni = scanner.next();

        persones.add(new Persona(nom, cognom, dni));
    }

    private static void ordenarPerNom(List<Persona> persones) {
        Collections.sort(persones);
    }

    private static void ordenarPerNomInvers(List<Persona> persones) {
        Collections.sort(persones, Collections.reverseOrder());
    }

    private static void ordenarPerCognom(List<Persona> persones) {
        Collections.sort(persones, new ComparadorCognom());
    }

    private static void ordenarPerCognomInvers(List<Persona> persones) {
        Collections.sort(persones, Collections.reverseOrder(new ComparadorCognom()));
    }

    private static void ordenarPerDNI(List<Persona> persones) {
        Collections.sort(persones, new ComparadorDNI());
    }

    private static void ordenarPerDNIInvers(List<Persona> persones) {
        Collections.sort(persones, Collections.reverseOrder(new ComparadorDNI()));
    }

    private static void mostrarPersones(List<Persona> persones) {
        for (Persona persona : persones) {
            System.out.println(persona);
        }
    }
    
    private static void mostrarMenu() {
        System.out.println("1.- Introduir persona.");
        System.out.println("2.- Mostrar les persones ordenades per nom (A-Z).");
        System.out.println("3.- Mostrar les persones ordenades per nom (Z-A).");
        System.out.println("4.- Mostrar les persones ordenades per cognoms (A-Z).");
        System.out.println("5.- Mostrar les persones ordenades per cognoms (Z-A).");
        System.out.println("6.- Mostrar les persones ordenades per DNI (1-9).");
        System.out.println("7.- Mostrar les persones ordenades per DNI (9-1).");
        System.out.println("0.- Sortir.");
        System.out.print("Selecciona una opció: ");
    }

}
