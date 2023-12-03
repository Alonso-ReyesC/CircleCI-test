import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestCalculadora {

    @Test
    public void testSumar() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.sumar(3, 5);
        assertEquals(8, resultado);
    }

    @Test
    public void testRestar() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.restar(10, 4);
        assertEquals(6, resultado);
    }
}
