package n1exercici2;

public class MainTreballadors {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		TreballadorPresencial nouTP = new TreballadorPresencial ("Alba", "Fernandez",15);
		System.out.println(nouTP.calcularSou(100));
		
		nouTP.calcularSouPresencial(100);
		
		TreballadorOnline nouTO = new TreballadorOnline ("Pere", "Garcia", 20);
		System.out.println(nouTO.calcularSou(150));
		
		nouTO.calcularSouOnline(150);
		
		// TODO Auto-generated method stub

	}

}
