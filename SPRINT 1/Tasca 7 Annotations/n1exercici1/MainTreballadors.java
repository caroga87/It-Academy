package n1exercici1;

public class MainTreballadors {

	public static void main(String[] args) {
		
		TreballadorPresencial nouTP = new TreballadorPresencial ("Alba", "Fernandez",15);
		System.out.println(nouTP.calcularSou(100));
		
		TreballadorOnline nouTO = new TreballadorOnline ("Pere", "Garcia", 20);
		System.out.println(nouTO.calcularSou(150));
		
		// TODO Auto-generated method stub

	}

}
