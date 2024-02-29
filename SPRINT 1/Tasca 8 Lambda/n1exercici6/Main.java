package n1exercici6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<String> llistaStrings = Arrays.asList("pera", "poma", "platan", "albercoc", "maduixa", "coco", "alvocat",
													"2541156", "544155","2","25", "Sindria");
		List <String>llistaOrdenada= new ArrayList<String>();
		
		llistaOrdenada=llistaStrings.stream().sorted(Comparator.comparing(obj -> obj.toString().length()))
				.collect(Collectors.toList());
		
		llistaOrdenada.forEach(System.out::println);
	}

}
