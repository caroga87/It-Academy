package n2exercici3;

public class Main {

	public static void main(String[] args) {
		
		
		Operacio suma = (a,b)-> a+b;
		System.out.println("El resultat de la suma és " +suma.operacio(3,4));
		
		Operacio resta = (a,b)-> a-b;
		System.out.println("El resultat de la resta és " +resta.operacio(3,4));
		
		Operacio multiplicacio = (a,b)-> a*b;
		System.out.println("El resultat de la multiplicació és " +multiplicacio.operacio(3,4));
		
		Operacio divisio= (a,b)-> {
			if (b!=0) {
				return a/b;
			}else {
				System.out.println("No es pot dividir entre 0, si us plau, escriu un valor vàlid.");
				return Float.NaN;
			}
		};
		System.out.println("El resultat de la divisó és " +divisio.operacio(3,4));

	}

}
