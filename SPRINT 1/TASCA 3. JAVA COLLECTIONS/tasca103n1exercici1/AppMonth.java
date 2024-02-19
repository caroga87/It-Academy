package tasca103n1exercici1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class AppMonth {

	public static void main(String[] args) {
		
		// instanciar els mesos
		 
		 Month gener = new Month ("Gener");
		 Month febrer = new Month ("Febrer");
		 Month març = new Month ("Març");
		 Month abril = new Month ("Abril");
		 Month maig = new Month ("Maig");
		 Month juny = new Month ("Juny");
		 Month juliol = new Month ("Juliol");
		 Month agost = new Month ("Agost");
		 Month setembre = new Month ("Setembre");
		 Month octubre = new Month ("Octubre");
		 Month novembre = new Month ("Novembre");
		 Month desembre= new Month ("Desembre");
		 
		 
		 //afegir els 11 mesos a una arraylist
		 ArrayList<Month> mesos = new ArrayList<>();
		 mesos.add(gener);
		 mesos.add(febrer);
		 mesos.add(març);
		 mesos.add(abril);
		 mesos.add(maig);
		 mesos.add(juny);
		 mesos.add(juliol);
		 mesos.add(setembre);
		 mesos.add(octubre);
		 mesos.add(novembre);
		 mesos.add(desembre);
		 
		 // afegir el mes d'agost a la posició corresponent
		 mesos.add(7, agost);
		 
		 //comprovació que els mesos es troben per ordre
		 System.out.println("Recorrer ArrayList");
		 for (int i=0; i<mesos.size(); i++) {
			 System.out.println(mesos.get(i).getNom());
		 	}
		 
		 // afegir duplicats a la arrayList
		 mesos.add(juny);
		 mesos.add(juliol);
		 mesos.add(agost);
		 mesos.add(setembre);
		 mesos.add(novembre);
		 mesos.add(desembre);
		 System.out.println("Recorrer ArrayList duplicats");
		 for (int i=0; i<mesos.size(); i++) {
			 System.out.println(mesos.get(i).getNom());
		 	}
		 
		 // convertir ArrayList en HashSet
		 Set<Month> monthSet = new HashSet<Month>(mesos);
		 
		//imprimir hashSet per comprovar que no hi ha duplicats	 		 
		 System.out.println("RECORRER LA LLISTA BUCLE FOR");
		 for (int i=0; i<monthSet.size(); i++) {
			 System.out.println(mesos.get(i).getNom());
		 }
		 System.out.println("RECORRER LA LLISTA ITERADOR");
		 Iterator <Month> iterator = monthSet.iterator();
		 while (iterator.hasNext()) {
			 Month month = iterator.next();
			 System.out.println(month.getNom());
		 }
		 
		 // comparar la quantitat d'elements que hi ha a l'arraylist vs hashSet
		System.out.println("L'arrayList mesos conté " + mesos.size()+ " elements, i el hashSet monthSet"
				+ " conté " +monthSet.size()+" elements.");
		

	}

}
