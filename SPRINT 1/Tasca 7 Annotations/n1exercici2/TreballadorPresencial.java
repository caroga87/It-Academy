package n1exercici2;

public class TreballadorPresencial extends Treballador{
	
	private static double benzina =150;

	public TreballadorPresencial(String nom, String cognom, double preu_hora) {
		super(nom, cognom, preu_hora);
		
		
		// TODO Auto-generated constructor stub
	}
	
	@Deprecated
	public void calcularSouPresencial(int horesMes) {
		
		double souPresencial = (preu_hora*horesMes)+benzina;
		
		System.out.println(souPresencial);
	}

	@Override
	public double calcularSou(int horesMes) {
		return super.calcularSou(horesMes)+benzina;
	}

	
	
	

}
