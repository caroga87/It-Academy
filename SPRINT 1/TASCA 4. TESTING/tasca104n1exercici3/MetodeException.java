package tasca104n1exercici3;

//Crea una classe amb un mètode que llanci una ArrayIndexOutOfBoundsException.
//Verifica el seu correcte funcionament amb un test jUnit.


public class MetodeException {
	
	 public static void main(String[] args) {
	 
		 metodeArrayException (6);
	 }
	
	public static void metodeArrayException (int index) {
		int [] llista = {1,2,3,4};
		System.out.println(llista[index]); // si indica un valor fora de l'index donarà l'error
		
	}
	
}
	
	