package tasca105n1exercici5;

import java.io.Serializable;


 class Cotxe implements Serializable{

	private static final long serialVersionUID = 1L;
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
	
	
	public static void frenar() {
		System.out.println("El vehicle està frenant"); 
	}
	
	public void accelerar () {
		System.out.println("El vehicle està accelerant");
	}
	
	public String toString () {
		return "El cotxe de la marca " +marca + " i model "
				+model +" té una potencia de " +potencia;
			}
}
