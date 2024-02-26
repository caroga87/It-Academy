package tasca104n1exercici3;

//Crea una classe amb un mètode que llanci una ArrayIndexOutOfBoundsException.
//Verifica el seu correcte funcionament amb un test jUnit.


public class Exemple {
	  
	public void accesArray () {
		 int[] array = new int[5];
	        // Intentamos acceder a un índice que está fuera del tamaño del array
	        int valor = array[10];
	    }
}
	