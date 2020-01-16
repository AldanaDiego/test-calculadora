package calculadora;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumaTest {
    private final Calculadora calc = new Calculadora();

    @Test
    void suma(){
        assertEquals(calc.suma(5,3), 8.0);
    }
}
