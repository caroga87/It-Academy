package tasca104n1exercici3;

import java.util.ArrayList;

//Crea una classe amb un mètode que llanci una ArrayIndexOutOfBoundsException.
//Verifica el seu correcte funcionament amb un test jUnit.
public class Exemple {
	  
	  public static ArrayList<String> crearLlistaMesos() {
	    	ArrayList<String> mesos = new ArrayList<>();
	        mesos.add("gener");
	        mesos.add("febrer");
	        mesos.add("març");
	        mesos.add("abril");
	        mesos.add("maig");
	        mesos.add("juny");
	        mesos.add("juliol");
	        mesos.add("agost");
	        mesos.add("setembre");
	        mesos.add("octubre");
	        mesos.add("novembre");
	        mesos.add("desembre");
	                       
	        return mesos;
	    }
	  
	  public static String obtenirMes(int index) {
	        ArrayList<String> mesos = crearLlistaMesos();
	      
	        if (index <= mesos.size()) {
	        	return mesos.get(index);
	        }else {
	    	throw new ArrayIndexOutOfBoundsException ();
	    }
	  }
}
