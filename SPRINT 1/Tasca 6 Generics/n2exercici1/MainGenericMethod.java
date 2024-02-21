package n2exercici1;


public class MainGenericMethod {
	
	
	public static void main(String[] args) {
		
		Persona pers1 = new Persona ("Carla", "Roca", 36);
				
		GenericMethod.printElements("blau",pers1, 42);
		
		GenericMethod.printElements( "lila", pers1, new Persona("Joan", "Petit",11));
		
		GenericMethod.printElements("poma", "pera", "lila");
		
		GenericMethod.printElements("36", 22, 4);
		
		
	}

}
