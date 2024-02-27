package n2exercici1;

public class MainEntrada {
    public static void main(String[] args) {
    	boolean correcte = true;
        int preguntaSeguent = 1;

        do {
            Entrada entrada = new Entrada();
            try {
                // Mètodes que capturen l'excepció de la classe InputMismatchException:
                if (preguntaSeguent == 1) {
                    byte resultByte = Entrada.llegirByte("Introdueix la teva edat");
                    System.out.println("La teva edat és de: " + resultByte);
                    preguntaSeguent++;
                }
                if (preguntaSeguent == 2) {
                    int resInt = Entrada.llegirEnter("Introdueix quin dia és avui");
                    System.out.println("Avui és: " + resInt);
                    preguntaSeguent++;
                }
                if (preguntaSeguent == 3) {
                    float resFloat = Entrada.llegirFloat("Introdueix el resultat de 3/2");
                    System.out.println("El teu resultat és: " + resFloat);
                    preguntaSeguent++;
                }
                if (preguntaSeguent == 4) {
                    double resDouble = Entrada.llegirDouble("Introdueix la teva alçada");
                    System.out.println("La teva alçada és: " + resDouble);
                    preguntaSeguent++;
                }

                // Mètodes que capturen l'excepció de la classe Exception
                if (preguntaSeguent == 5) {
                    char resChar = Entrada.llegirChar("Introdueix la teva inicial");
                    System.out.println("La teva inicial és: " + resChar);
                    preguntaSeguent++;
                }
                if (preguntaSeguent == 6) {
                    String resString = Entrada.llegirString("Introdueix una frase");
                    System.out.println("La teva frase és: " + resString);
                    preguntaSeguent++;
                }
                
                boolean resBoolean = Entrada.llegirSiNo("Ets un humà? (s/n)");
                System.out.println("Resultat s/n: " + resBoolean);

                correcte = false;
            } catch (Exception e) { // L'excepció InputMismatchException ja és capturada per Exception
                System.out.println("S'ha trobat un error de format.");
            }
        } while (correcte);
    }
       
      
    }

