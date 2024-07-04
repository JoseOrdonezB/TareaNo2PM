import org.junit.Test;
import static org.junit.Assert.*;

public class CalcTest {
    private Calc calc = new Calc();

    @Test
    public void testSuma() {
        assertEquals(5, calc.suma(2, 3));
        assertEquals(-1, calc.suma(-2, 1));
        assertEquals(0, calc.suma(0, 0));
    }

    @Test
    public void testResta() {
        assertEquals(1, calc.resta(3, 2));
        assertEquals(-3, calc.resta(-2, 1));
        assertEquals(0, calc.resta(0, 0));
    }

    @Test
    public void testMultiplicacion() {
        assertEquals(6, calc.multiplicacion(2, 3));
        assertEquals(-2, calc.multiplicacion(-2, 1));
        assertEquals(0, calc.multiplicacion(0, 10));
    }
}
