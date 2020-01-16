package calculadora;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivTest {
    private final Calculadora calc = new Calculadora();
    //Comentario

    @Test
    void div(){
        assertEquals(calc.div(35, 5), 7.0);
    }
}
