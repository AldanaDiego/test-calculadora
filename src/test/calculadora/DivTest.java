package calculadora;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DivTest {
    private final Calculadora calc = new Calculadora();
    //Comentario para cerrar issue

    @Test
    void div(){
        assertEquals(calc.div(35, 5), 7.0);
    }

    @Test
    void zeroDiv(){
        assertThrows(UnsupportedOperationException.class,
                new Executable() {
                    public void execute() throws Throwable {
                        calc.div(5, 0);
                    }
                }
        );
    }
}
