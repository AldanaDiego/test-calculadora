package calculadora;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultTest {
    private final Calculadora calc = new Calculadora();

    @Test
    void mult(){
        assertEquals(calc.mult(4,6), 24.0);
    }
}
