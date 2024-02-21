package n2exercici2;

import java.util.ArrayList;

public class MainGenericMethod {

	public static void main(String[] args) {

		Persona newPersona = new Persona("Pere", "Garcia", 50);
		Persona new2Persona = new Persona("Josep", "Sanchez", 25);
		Persona new3Persona = new Persona("Maria", "Lopez", 54);
		Persona new4Persona = new Persona("Julia", "Fernandez", 30);
		
		ArrayList <Persona>llistaPersones = new ArrayList<Persona>();
		llistaPersones.add(newPersona);
		llistaPersones.add(new2Persona);
		llistaPersones.add(new3Persona);
		llistaPersones.add(new4Persona);
		
		ArrayList <String>llistaNoms=new ArrayList <String>();
		llistaNoms.add("Pere");
		llistaNoms.add("Josep");
		llistaNoms.add("Maria");
		llistaNoms.add("Julia");
		
		ArrayList <Integer>llistaNum=new ArrayList <Integer>();
		llistaNum.add(1);
		llistaNum.add(2);
		llistaNum.add(3);
		llistaNum.add(4);
		
		GenericMethod.printElements(llistaPersones);
		GenericMethod.printElements(llistaNoms);
		GenericMethod.printElements(llistaNum);
		
		
		// TODO Auto-generated method stub

	}

}
