package n2exercici2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList(1,2,3,4,12,65,45,87,99,64,120,456,164,353416);
		
		System.out.println(numsOrdenats (numeros));
	}
	
	static String numsOrdenats (List <Integer>numeros) {
		
		String numsOrdenats = numeros.stream().map(num->(num % 2 == 0? "e": "o") +num)
									.collect (Collectors.joining(", "));
		
		return numsOrdenats;
	}
	

}
