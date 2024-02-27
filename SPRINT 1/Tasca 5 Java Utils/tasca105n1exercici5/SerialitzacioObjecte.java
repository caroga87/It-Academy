package tasca105n1exercici5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerialitzacioObjecte {

	public static void main(String[] args) {
		
		Cotxe[] nouCotxe = new Cotxe [3];
		nouCotxe[0]= new Cotxe("Alhambra", 150);
		nouCotxe[1]= new Cotxe ("Alhambra", 100);
		nouCotxe[2]= new Cotxe ("Alhambra", 75);
		
		
		serialitzarObjecte(nouCotxe,"C:\\Users\\rocac\\eclipse-workspace\\Sprint1\\Tasca 5 Java Utils\\tasca105n1exercici5//serialitzacio.ser");
		desserialitzarObjecte("C:\\Users\\rocac\\eclipse-workspace\\Sprint1\\Tasca 5 Java Utils\\tasca105n1exercici5//serialitzacio.ser"); 
		
	

	}
	
	public static void serialitzarObjecte (Cotxe[] nouCotxe, String rutaDocument) {
		ObjectOutputStream escriureFitxer;
		try {
			escriureFitxer = new ObjectOutputStream(new FileOutputStream(rutaDocument));
			
			escriureFitxer.writeObject(nouCotxe);
			
			escriureFitxer.close();
			
			System.out.println("La serialització s'ha realitzat correctament.");
		} catch (FileNotFoundException e) {
			
			System.out.println("Error, la ruta donada no és correcte: " +e.getMessage());
		
		} catch (IOException e) {
			
			System.out.println("Error en la serialització: " +e.getMessage());
		} 
			
	}
	
	public static void desserialitzarObjecte (String rutaDocument) {
		
		ObjectInputStream recuperarFitxer;
		try {
			recuperarFitxer = new ObjectInputStream(new FileInputStream(rutaDocument));
			try {
				Cotxe [] cotxe_recuperat = (Cotxe [])recuperarFitxer.readObject();
				for (Cotxe e: cotxe_recuperat) {
					System.out.println(e);
					}
			} catch (ClassNotFoundException e) {
				
				System.out.println("Classe no trobada: " +e.getMessage());
			}
			recuperarFitxer.close();
		} catch (FileNotFoundException e) {
			
			System.out.println("No s'ha trobat el fitxer: " +e.getMessage());
		} catch (IOException e) {
			
			System.out.println("Error en la desserialització: " +e.getMessage());
		}
	}
	

}

 
	

