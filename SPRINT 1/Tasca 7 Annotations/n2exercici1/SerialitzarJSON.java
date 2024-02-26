package n2exercici1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target (ElementType.TYPE)
public @interface SerialitzarJSON {
	
	String rutaFitxerJson ();

}
