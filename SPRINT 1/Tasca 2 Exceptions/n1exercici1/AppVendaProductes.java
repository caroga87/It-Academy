package n1exercici1;

public class AppVendaProductes {

public static void main(String[] args){
	
	Venda novaVenda= new Venda (0);
	
	System.out.println("Provem amb productes a la llista:");
	novaVenda.afegirProducte(new Producte ("pera", 15));
	novaVenda.afegirProducte(new Producte ("poma", 20));
	
	try {
		novaVenda.calcularTotal();
	}catch (VendaBuidaException e) {
		System.out.println("Per fer una venda primer has d’afegir productes");
	}

	
	System.out.println("Provem sense productes a la llista:");
	Venda segonaVenda = new Venda (0);
	
	try {
		segonaVenda.calcularTotal();
	}catch (VendaBuidaException e) {
		System.out.println("Per fer una venda primer has d’afegir productes");
	}
	
	System.out.println("Excepció de tipus ArrayIndexOutOfBoundsException:");
	try {
		novaVenda.mostrarProducte(3);
	
	}catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("Error, l'index que estàs buscant no existeix");
	}
	
	try {
		novaVenda.mostrarProducte(1);
		
	}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error, l'index que estàs buscant no existeix");
		}		
   }

	

}
