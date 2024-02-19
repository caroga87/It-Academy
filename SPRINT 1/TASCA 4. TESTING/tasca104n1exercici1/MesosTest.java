package tasca104n1exercici1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;

public class MesosTest {

  
    @Test
    //Comprovar que a la llista hi ha els 12 mesos
   void testMidaLlista() {
        ArrayList<String> mesos = Mesos.crearLlistaMesos();
        assertEquals(12, mesos.size());
    }
    @Test
    //comprovar que la llista no està buida
     void testNull() {
    	ArrayList<String> mesos = Mesos.crearLlistaMesos();
        assertNotNull(mesos);
    }
    @Test
    // comprovar que el mes d'agost es troba a la posició 8 (real 7).
     void testAgostPosicio() {
    	ArrayList<String> mesos = Mesos.crearLlistaMesos();
        assertEquals("agost", mesos.get(7));
    }
}

