package n1exercici3;

import java.util.Arrays;
import java.util.List;

public class Main {
	
	 public static void main(String[] args) {
	        List<String> mesos = Arrays.asList(
	            "Gener", "Febrer", "Març", "Abril", "Maig", "Juny",
	            "Juliol", "Agost", "Setembre", "Octubre", "Novembre", "Desembre");

	    
	        mesos.forEach(mes -> System.out.println(mes));
	    }

}
