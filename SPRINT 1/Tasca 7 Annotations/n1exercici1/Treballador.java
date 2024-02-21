package n1exercici1;

public class Treballador {
	
	protected String nom;
	protected String cognom;
	protected double preu_hora;
	
	public Treballador (String nom, String cognom, double preu_hora) {
		this.nom=nom;
		this.cognom=cognom;
		this.preu_hora=preu_hora;
		
	}
	
	public String getNom () {
		return nom;
	}
	public String getCognom () {
		return cognom;
	}
	public double getPreu_hora () {
		return preu_hora;
	}
	
	public double calcularSou (int horesMes) {
		
		return preu_hora*horesMes;
		
		
	}

	
		
		

}
