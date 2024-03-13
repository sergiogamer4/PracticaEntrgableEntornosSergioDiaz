import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void sumar() {
        double valor1 = 6.000;
        double valor2 = 14.000;
        double expResult = 20.000;
        double result = Calculadora.sumar(valor1, valor2);
        assertEquals(expResult, result);

        double valor3 = 247.345;
        double valor4 = 1.290;
        double expResult2 = 248.635;
        double result2 = Calculadora.sumar(valor3, valor4);
        assertEquals(expResult2, result2);

        double valor5 = 0.230;
        double valor6 = 50.000;
        double expResult3 = 50.230;
        double result3 = Calculadora.sumar(valor5, valor6);
        assertEquals(expResult3, result3);
    }

    @Test
    void restar() {
        double valor1 = 6.000;
        double valor2 = 14.000;
        double expResult = -8.000;
        double result = Calculadora.restar(valor1, valor2);
        assertEquals(expResult, result);

        double valor3 = 247.345;
        double valor4 = 1.290;
        double expResult2 = 246.055;
        double result2 = Calculadora.restar(valor3, valor4);
        assertEquals(expResult2, result2);

        double valor5 = 0.230;
        double valor6 = 50.000;
        double expResult3 = -49.770;
        double result3 = Calculadora.restar(valor5, valor6);
        assertEquals(expResult3, result3);
    }

    @Test
    void multiplicar() {
        double valor1 = 6.000;
        double valor2 = 14.000;
        double expResult = 84.000;
        double result = Calculadora.multiplicar(valor1, valor2);
        assertEquals(expResult, result, 0.0001);

        double valor3 = -247.345;
        double valor4 = -1.290;
        double expResult2 = 319.075;
        double result2 = Calculadora.multiplicar(valor3, valor4);
        assertEquals(expResult2, result2, 0.0001);

        double valor5 = -0.230;
        double valor6 = 50.000;
        double expResult3 = -11.5;
        double result3 = Calculadora.multiplicar(valor5, valor6);
        assertEquals(expResult3, result3, 0.0001);
    }

    @Test
    void dividir() {
        double valor1 = 6.000;
        double valor2 = 14.000;
        double expResult = 0.428;
        double result = Calculadora.dividir(valor1, valor2);
        assertEquals(expResult, result, 0.01);

        double valor3 = -247.345;
        double valor4 = -1.290;
        double expResult2 = 191.740;
        double result2 = Calculadora.dividir(valor3, valor4);
        assertEquals(expResult2, result2, 0.01);

        double valor5 = 50.000;
        double valor6 = -0.230;
        double expResult3 = -217.391;
        double result3 = Calculadora.dividir(valor5, valor6);
        assertEquals(expResult3, result3, 0.01);
    }
}