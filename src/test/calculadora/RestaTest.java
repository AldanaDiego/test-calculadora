package calculadora;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RestaTest {
    private final Calculadora calc = new Calculadora();

    @Test
    void resta(){
        assertEquals(calc.resta(10, 3), 7.0);
    }
}
