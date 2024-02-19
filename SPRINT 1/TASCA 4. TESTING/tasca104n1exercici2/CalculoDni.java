package tasca104n1exercici2;

public class CalculoDni {
	
	// metode per calcular la lletra del dni en rebre els numeros per parametre
	
	public static char obtenirLletraDni (int dni) {
		
		String lletres = "TRWAGMYFPDXBNJZSQVHLCKE"; // lletres en ordre 
			     
		return lletres.charAt(dni % 23); //castegem el String a Char per obtenir la lletra en la posicio resultat
		
	}

}
