package n1exercici1;
/*Crea una classe anomenada NoGenericMethods que emmagatzemi tres objectes del mateix tipus, 
 * juntament amb els mètodes per a emmagatzemar i extreure aquests objectes i un constructor 
 * per a inicialitzar els tres. 
 * Comprova que els arguments es poden posar en qualsevol posició en la crida al constructor.
 */

public class NoGenericMethods {
	
	private String objecte1;
	private String objecte2;
	private String objecte3;
	
	public NoGenericMethods (String objecte1, String objecte2, String objecte3) {
		this.objecte1= objecte1;
		this.objecte2= objecte2;
		this.objecte3= objecte3;
	}

	public String getObjecte1() {
		return objecte1;
	}

	public String getObjecte2() {
		return objecte2;
	}

	public String getObjecte3() {
		return objecte3;
	}
	
	public void  setObjecte1 (String nouValor) {
		objecte1=nouValor;
	}
	public void  setObjecte2 (String nouValor) {
		objecte2=nouValor;
	}
	public void  setObjecte3 (String nouValor) {
		objecte3=nouValor;
	}
	
	public void print() {
		System.out.println(objecte1);
		System.out.println(objecte2);
		System.out.println(objecte3);
	}
	
	public String toString () {
		return "Conté " +objecte1 +" "+objecte2 +" "+objecte3;
	}

}
