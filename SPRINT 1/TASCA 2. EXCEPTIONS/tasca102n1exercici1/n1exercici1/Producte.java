package n1exercici1;

public class Producte {
	private String nom;
	private double preu;
	
	public Producte (String nom, double preu) {
		this.nom=nom;
		this.preu=preu;
	}
		

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getPreu() {
		return preu;
	}

	public void setPreu(double preu) {
		this.preu = preu;
	}

	public String toString() {
		return "El producte " +nom +" té un preu de " +preu;
	}
}
