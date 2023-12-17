import org.example.Complexo;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComplexoTest
{

    @Test
    public void testSomar() {
        Complexo num1 = new Complexo(1, 2);
        Complexo num2 = new Complexo(3, 4);
        Complexo resultado = Complexo.somar(num1, num2);

        assertEquals(4, resultado.getParteReal());
        assertEquals(6, resultado.getParteImaginaria());
    }

    @Test
    public void testSubtrair() {
        Complexo num1 = new Complexo(5, 8);
        Complexo num2 = new Complexo(3, 2);
        Complexo resultado = Complexo.subtrair(num1, num2);

        assertEquals(2, resultado.getParteReal());
        assertEquals(6, resultado.getParteImaginaria());
    }

    @Test
    public void testModulo() {
        Complexo num = new Complexo(3, 4);
        double resultado = num.modulo();

        assertEquals(5, resultado, 1e-10);
    }
}