package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatriceTest {
    @Test
    void testAddition() {
        Calculatrice calc = new Calculatrice();
        assertEquals(5, calc.addition(2, 3));
    }
    @Test
    void testSoustraction() {
        Calculatrice calc = new Calculatrice();
        assertEquals(1, calc.soustraction(3, 2));
    }
    @Test
    void testMultiplication() {
        Calculatrice calc = new Calculatrice();
        assertEquals(6, calc.multiplication(2, 3));
    }
    @Test
    void testDivision() {
        Calculatrice calc = new Calculatrice();
        assertEquals(2, calc.division(6, 3));
    }
    @Test
    void testDivisionParZero() {
        Calculatrice calc = new Calculatrice();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calc.division(5, 0);
        });
        assertEquals("Division par zéro", exception.getMessage());
    }
    @ParameterizedTest
    @CsvSource({
            "2, 3, 5",
            "10, 15, 25",
            "-2, 4, 2"
    })
    void testAdditionParametree(int a, int b, int resultatAttendu) {
        Calculatrice calc = new Calculatrice();
        assertEquals(resultatAttendu, calc.addition(a, b));
    }


}