package n1exercici8;

public class Main {

	public static void main(String[] args) {
			
		StringReverse alReves = (String input) -> {StringBuilder reversed = new StringBuilder(input);
            
		return reversed.reverse().toString();};
		
		String usuari = "Avui és dia 27 de febrer.";
		System.out.println(alReves.reverse(usuari));
    
				
	}
	

}
