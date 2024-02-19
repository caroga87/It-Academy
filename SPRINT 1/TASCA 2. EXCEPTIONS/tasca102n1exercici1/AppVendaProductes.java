package tasca102n1exercici1;

public class AppVendaProductes {

	public static void main(String[] args) throws VendaBuidaException{
		
		Venda novaVenda= new Venda (0);
		novaVenda.afegirProducte(new Producte ("pera", 15));
		novaVenda.afegirProducte(new Producte ("poma", 20));
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

	}
	
	

}
