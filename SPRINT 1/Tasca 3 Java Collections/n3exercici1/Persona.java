package n3exercici1;

class Persona implements Comparable<Persona> {
    
	private String nom;
    private String cognom;
    private String dni;

    public Persona(String nom, String cognom, String dni) {
        this.nom = nom;
        this.cognom = cognom;
        this.dni = dni;
    }
    
    public String getNom () {
    	return nom;
    }
    
    public String getCognom() {
        return cognom;
    }

    public String getDni() {
        return dni;
    }

    @Override
    public int compareTo(Persona other) {
        
        return this.nom.compareTo(other.nom);
    }

    @Override
    public String toString() {
        return String.format("%-15s %-15s %-10s", nom, cognom, dni);
    }
}
