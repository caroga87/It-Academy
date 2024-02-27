package n1exercici1;

public class AppVendaProductes {

	public static void main(String[] args){
		
		Venda novaVenda= new Venda (0);
		
		novaVenda.afegirProducte(new Producte ("pera", 15));
		novaVenda.afegirProducte(new Producte ("poma", 20));
		
		//prova amb llista plena
		try {
			novaVenda.calcularTotal();
		}catch (VendaBuidaException e) {
			System.out.println(e.getMessage());
		}

		
		//prova amb la llista buida 
		Venda segonaVenda = new Venda (0);
		
		try {
			segonaVenda.calcularTotal();
		}catch (VendaBuidaException e) {
			System.out.println(e.getMessage());
		}
		
		// intentem generar i capturar una excepció de tipus ArrayIndexOutOfBoundsException
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
