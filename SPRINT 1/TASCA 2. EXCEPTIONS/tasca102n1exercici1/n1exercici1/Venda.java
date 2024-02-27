package n1exercici1;

import java.util.ArrayList;

public class Venda {
	//atributs
	private ArrayList<Producte> llistaProductes;
	private double preuTotal;
	
	//constructor
	public Venda (double preuTotal) {
		llistaProductes=new ArrayList<Producte>();
		this.preuTotal=preuTotal;
		
		}
	//getters i setters
	public double getPreuTotal() {
		return preuTotal;
	}
	
	public ArrayList<Producte> getLlistaProductes (){
		return llistaProductes;
	}

	public void setPreuTotal(double preuTotal) {
		this.preuTotal = preuTotal;
	}
	
	//metodes de classe
	
	public ArrayList<Producte> afegirProducte(Producte producte) {
		llistaProductes.add(producte);
		return llistaProductes;
	}
	public void calcularTotal() throws VendaBuidaException {
		
		if (llistaProductes.isEmpty()) {
			
			throw new VendaBuidaException();
		
		} else { 
			for(Producte p: llistaProductes) {
				preuTotal+=p.getPreu();
			}
		System.out.println("Preu total de la venda " +preuTotal);
			}
	}
	
	public void mostrarProducte(int index) throws ArrayIndexOutOfBoundsException {
		
		if (llistaProductes.size()< index) {
			throw new ArrayIndexOutOfBoundsException ();
		}else {
			System.out.println(llistaProductes.get(index));
		}
   }
}
	




