package tasca104n1exercici3;

import org.junit.Test;

public class TestMetodeException {
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testThrowArrayIndexOutOfBoundsException() {
        Exemple arrayExample = new Exemple();
        arrayExample.accesArray();
    }
}
