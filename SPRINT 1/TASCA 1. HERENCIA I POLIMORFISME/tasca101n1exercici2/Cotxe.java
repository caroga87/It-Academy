package tasca101n1exercici2;

public class Cotxe {
	private static final String marca="Seat";
	private static String model;
	private final int potencia;
	
	public Cotxe (String model, int potencia) {
		Cotxe.model=model;
		this.potencia=potencia;
	}

	public static String getMarca() {
		return marca;
	}

	public static String getModel() {
		return model;
	}

	public int getPotencia() {
		return potencia;
	}
	
	//metode static (pertany a la classe)
	public static void frenar() {
		System.out.println("El vehicle està frenant"); 
	}
	//metode no static (pertany a la instancia)
	public void accelerar () {
		System.out.println("El vehicle està accelerant");
	}
	 public String toString () {
		 return "El vehicle de marca " +marca +" i model "+model
				 	+" té una potència de " +potencia;
	 }

}
