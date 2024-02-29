package n1exercici1;

import java.util.ArrayList;

public class Venda {
	
private ArrayList<Producte> llistaProductes;
private double preuTotal;


public Venda (double preuTotal) {
	llistaProductes=new ArrayList<Producte>();
	this.preuTotal=preuTotal;
	
	}

public double getPreuTotal() {
	return preuTotal;
}

public ArrayList<Producte> getLlistaProductes (){
	return llistaProductes;
}

public void setPreuTotal(double preuTotal) {
	this.preuTotal = preuTotal;
}



public void afegirProducte(Producte producte) {
	
	llistaProductes.add(producte);
}
	
public void calcularTotal() throws VendaBuidaException {
	
	if (llistaProductes.isEmpty()) {
		
		throw new VendaBuidaException();
	}
	
	for(Producte p: llistaProductes) {
		preuTotal+=p.getPreu();
		
	System.out.println("Preu total de la venda " +preuTotal);
		}
}

public void mostrarProducte(int index) throws ArrayIndexOutOfBoundsException {
	
	if (llistaProductes.size()< index) {
		throw new ArrayIndexOutOfBoundsException ();
	}
		System.out.println(llistaProductes.get(index));
	
}
}
	





