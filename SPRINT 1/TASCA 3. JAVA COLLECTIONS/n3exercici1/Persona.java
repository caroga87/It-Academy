package n3exercici1;

public class Persona {
	
	String nom;
	String cognom;
	String dni;
	
	public Persona (String nom, String cognom, String dni) {
		this.nom=nom;
		this.cognom=cognom;
		this.dni=dni;
	}
	
	public String getNom() {
        return nom;
    }

    public String getCognom() {
        return cognom;
    }

    public String getDNI() {
        return dni;
    }	
	
	
    @Override
    public String toString() {
        return String.format("%-15s %-15s %-10s", nom, cognom, dni);
    }

}
