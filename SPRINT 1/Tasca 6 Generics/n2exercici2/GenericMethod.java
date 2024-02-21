package n2exercici2;

import java.util.ArrayList;

public class GenericMethod {
			

	public static <T> void printElements (ArrayList<T>llista) {
		
		for (T element : llista) {
			System.out.println("Els elements de la llista són: " +element.toString());
		}
	}


}
