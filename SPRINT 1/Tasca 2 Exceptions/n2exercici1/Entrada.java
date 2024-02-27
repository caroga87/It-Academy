package n2exercici1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {

	private static Scanner sc;
	
	public Entrada() {
		sc = new Scanner(System.in);
	}
	
	// Mètodes que capturen l'excepció de la classe InputMismatchException:
	public static byte llegirByte(String missatge) throws InputMismatchException {
		byte valor = 0;
		System.out.println(missatge);
		valor = sc.nextByte();
		 sc.nextLine();
		return valor;
	}
	
	public static int llegirEnter(String missatge) throws InputMismatchException {
		int valor = 0;
		System.out.println(missatge);
		valor = sc.nextInt();
		 sc.nextLine();
		return valor;
	}
	
	public static float llegirFloat(String missatge) throws InputMismatchException {
		float valor = 0.0f;
		System.out.println(missatge);
		valor = sc.nextFloat();
		 sc.nextLine();
		return valor;
	}
	
	public static double llegirDouble(String missatge) throws InputMismatchException {
		double valor = 0.0;
		System.out.println(missatge);
		valor = sc.nextDouble();
		sc.nextLine();
		return valor;
	}
	
	// Mètodes que capturen l'excepció de la classe Exception
	public static char llegirChar(String missatge) throws Exception {
		String cadena = "";
		char valor = ' ';
		
		System.out.println(missatge);
		cadena = sc.nextLine();
		valor = cadena.charAt(0);
		
        if(Character.isDigit(valor) || cadena.length() != 1) {
			throw new Exception();
        }
			
        return valor;
    }
	
    public static String llegirString(String missatge) throws Exception {
        String valor = "";
       
        System.out.println(missatge);
        valor = sc.nextLine();
        
        if(valor.length() <= 1) {
            throw new Exception();
        }
        
        return valor;
    }
    
    public static boolean llegirSiNo(String missatge) throws Exception {
        String entrada = "";
        char caracter = ' ';
        boolean valor = false;
        
        System.out.println(missatge);
        entrada = sc.nextLine().toLowerCase();
        caracter = entrada.charAt(0);
        
        if(caracter == 's') {
            valor = true;
        } else if(caracter == 'n') {
            valor = false;
        } else {
            throw new Exception();
        }
        
        return valor;
    }
}
