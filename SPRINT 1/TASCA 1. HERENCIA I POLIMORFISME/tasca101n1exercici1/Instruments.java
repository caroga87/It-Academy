package tasca101n1exercici1;

public abstract class Instruments {

	protected String nom;
	protected double preu;
	
	public Instruments (String nom, double preu) {
		this.nom=nom;
		this.preu=preu;
		
	}
	
	// getters i setters
	public String getNom () {
		return nom;
	}
	public double getPreu() {
		return preu;
	}

	public void setNom (String nom) {
		this.nom=nom;
	}
	
	public void setPreu (double preu) {
		this.preu=preu;
	}
	//metode abstracte 
	public abstract void tocar(); 
	
	// toString
	public String toString() {
		return "L'instrument " +nom
				+" té un preu de " +preu;
				
	
	}
}
