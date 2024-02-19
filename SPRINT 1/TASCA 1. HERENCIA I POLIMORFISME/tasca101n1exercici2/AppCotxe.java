package tasca101n1exercici2;

public class AppCotxe {

	public static void main(String[] args) {
		
		Cotxe nouCotxe =new Cotxe ("Ibiza", 150);
		Cotxe.frenar();
		nouCotxe.accelerar();
		System.out.println(Cotxe.getMarca());
		System.out.println(Cotxe.getModel());
		System.out.println(nouCotxe.getPotencia());
		
		// TODO Auto-generated method stub

	}

}
