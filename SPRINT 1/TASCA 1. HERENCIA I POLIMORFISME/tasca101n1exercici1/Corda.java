package tasca101n1exercici1;

public class Corda extends Instruments{
	
	public Corda (String nom, double preu) {
		super(nom, preu);
		}
	
	public void tocar () {
		System.out.println("Està sonant un instrument de corda");
	}
	
	

}
