package n1exercici1;

public class mainNoGenericMethods {

	public static void main(String[] args) {
		
		String objecte1="Joan";
		String objecte2="Maria";
		String objecte3="Marta";
		
		NoGenericMethods primer = new NoGenericMethods(objecte1,objecte2,objecte3);
		
		System.out.println(primer);
		
		NoGenericMethods segon = new NoGenericMethods(objecte2,objecte3,objecte1);
		
		System.out.println(segon);
		
		NoGenericMethods tercer = new NoGenericMethods(objecte3,objecte1,objecte2);
		
		System.out.println(tercer);
		
		
		

	}

}
