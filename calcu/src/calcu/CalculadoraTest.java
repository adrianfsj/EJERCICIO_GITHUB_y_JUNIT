package calcu;

import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {

    @Test
    public void testSumar() {
        calculadora calculadora = new calculadora(17, 5);
        float resultado = calculadora.sumar();
        Assert.assertEquals(22, resultado, 0);
    }

    @Test
    public void testRestar() {
        calculadora calculadora = new calculadora(17, 5);
        float resultado = calculadora.restar();
        Assert.assertEquals(12, resultado, 0);
    }

    @Test
    public void testMultiplicar() {
        calculadora calculadora = new calculadora(17, 5);
        float resultado = calculadora.multiplicar();
        Assert.assertEquals(85, resultado, 0);
    }

    @Test
    public void testDividir() {
        calculadora calculadora = new calculadora(17, 5);
        float resultado = calculadora.dividir();
        Assert.assertEquals(3.4, resultado, 0.001);
    }
}

