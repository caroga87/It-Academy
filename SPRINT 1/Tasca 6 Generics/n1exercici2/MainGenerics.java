package n1exercici2;

public class MainGenerics {

	public static void main(String[] args) {
		
		Persona pers1 = new Persona ("Carla", "Roca", 36);
				
		GenericMethod.printElements(pers1, "blau", 42);
		
		GenericMethod.printElements(pers1, new Persona("Joan", "Petit",11), "lila");
		
		GenericMethod.printElements("poma", "pera", "lila");
		
		GenericMethod.printElements(36, 22, 4);
		
		
	}

}
