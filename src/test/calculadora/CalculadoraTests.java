package calculadora;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTests {
    private final Calculadora calc = new Calculadora();

    @Test
    void suma(){
        assertEquals(calc.suma(5,3), 8.0);
    }

    @Test
    void resta(){
        assertEquals(calc.resta(10, 3), 7.0);
    }

    @Test
    void mult(){
        assertEquals(calc.mult(4,6), 24.0);
    }

    @Test
    void div(){
        assertEquals(calc.div(35, 5), 7.0);
    }
}
