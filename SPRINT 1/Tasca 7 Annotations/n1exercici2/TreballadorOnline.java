package n1exercici2;

public class TreballadorOnline extends Treballador{
	
	private final double TARIFA_INTERNET=100; //atribut constant de la classe
	

	public TreballadorOnline(String nom, String cognom, double preu_hora) {
		super(nom, cognom, preu_hora);
		
		// TODO Auto-generated constructor stub
	}


	public double getTARIFA_INTERNET() {
		return TARIFA_INTERNET;
	}
	
	@Override
	public double calcularSou(int horesMes) {
		return super.calcularSou(horesMes)+TARIFA_INTERNET;
	}
	
	@Deprecated
	public double calcularSouOnline (int horesMes) {
		return preu_hora*horesMes;
	}
	

	
	

}
