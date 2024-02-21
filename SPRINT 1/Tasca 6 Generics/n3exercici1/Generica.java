package n3exercici1;

public class Generica{
	
	public static <T extends Telefon> void metodeTelefon(T telefon) {
        telefon.trucar(); 
        /* des d'aquest metode generic NO es pot cridar al metode
        ferFotos() ja que només podrà cridar als que estiguin
        definits dins la interficie de Telefon*/
    }
	
	public static <S extends Smartphone> void metodeSmartphone(S smartphone) {
        smartphone.trucar();
        smartphone.ferFotos();
    }

}
