package n1exercici2;

import java.util.Arrays;
import java.util.List;

public class Main {
	 public static void main(String[] args) {
		 
	        List<String> llistaStrings = Arrays.asList("pera", "poma", "platan", "albercoc", "maduixa", "coco", "alvocat");
	        
	        llistaStrings.stream().filter(word->word.toLowerCase().contains("o")&& word.length()>=5)
	        								.forEach(word->System.out.println(word));
	 }

}
