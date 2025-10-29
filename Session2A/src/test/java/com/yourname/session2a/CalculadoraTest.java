package com.yourname.session2a;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    Calculator calc = new Calculator();

    @Test
    void testSum() { assertEquals(5, calc.sum(2,3)); }

    @Test
    void testSubtract() { assertEquals(1, calc.subtract(3,2)); }

    @Test
    void testMultiply() { assertEquals(6, calc.multiply(2,3)); }

    @Test
    void testDivide() { 
        assertEquals(2, calc.divide(6,3)); 
        assertEquals(-1, calc.divide(6,0)); 
    }
}
