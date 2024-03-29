package n1exercici1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class AppMonth {

	public static void main(String[] args) {
		
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
		 
		 
		
		 ArrayList<Month> mesos = new ArrayList<>();
		 System.out.println("Afegim els mesos a l'arrayList, excepte agost");
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
		 
		 System.out.println("Afegim el mes d'agost a la posició de mes que li pertoca:");
		 mesos.add(7, agost);
		 
		
		 System.out.println("Recorrer ArrayList");
		 
		 for (int i=0; i<mesos.size(); i++) {
			 
			 System.out.println(mesos.get(i).getNom());
		 	}
		 
		 System.out.println("Afegim duplicats a l'arrayList:");
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
		 
		
		 
		 Set<Month> monthSet = new HashSet<Month>(mesos);
		 
				 
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
		 
		
		System.out.println("L'arrayList mesos conté " + mesos.size()+ " elements, i el hashSet monthSet"
				+ " conté " +monthSet.size()+" elements.");
		

		
	}

}
