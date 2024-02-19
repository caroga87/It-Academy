package tasca101n1exercici1;
import java.util.Scanner;

public class AppInstruments {

	public static void main(String[] args) {
		
		
		crearVent("flauta", 50);
		crearPercussio("tambor", 100);
		crearCorda("guitarra", 256.34);
		System.out.println(crearVent("flauta", 50));
		crearVent("flauta", 50).tocar();
		crearPercussio("tambor", 100).tocar();
		

	}
	
	static Vent crearVent (String nom, double preu) {
		Vent nouVent = new Vent (nom ,preu);
		return nouVent;
	}
	static Percussio crearPercussio (String nom, double preu) {
		Percussio nouPercussio = new Percussio (nom ,preu);
		return nouPercussio;
	}
	static Corda crearCorda (String nom, double preu) {
		Corda nouCorda= new Corda (nom, preu);
		return nouCorda;
	}


}
