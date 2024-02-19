package tasca101n1exercici1;

public class Percussio extends Instruments {
	
	public Percussio (String nom, double preu) {
		super(nom, preu);
	}
	
	public void tocar () {
		System.out.println("Està sonant un instrument de precussió");
	}
	

}
