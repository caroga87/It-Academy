package n1exercici1;

import java.util.Arrays;
import java.util.List;

	public class Main {
		
	    public static void main(String[] args) {
	        List<String> llistaStrings = Arrays.asList("pera", "poma", "platan", "albercoc", "maduixa", "coco");
	        
	        llistaStrings.stream().filter(word->word.toLowerCase().contains("o"))
	        							.forEach(word->System.out.println(word));

 

    }
}


