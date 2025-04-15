import com.example.Calculatrice;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatriceTest {

    Calculatrice calc = new Calculatrice();

    @Test
    void testAddition() {
        assertEquals(5, calc.addition(2, 3));
    }

    @Test
    void testSoustraction() {
        assertEquals(1, calc.soustraction(3, 2));
    }

    @Test
    void testMultiplication() {
        assertEquals(6, calc.multiplication(2, 3));
    }

    @Test
    void testDivision() {
        assertEquals(2, calc.division(6, 3));
    }

    @Test
    void testDivisionParZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calc.division(5, 0);
        });
        assertEquals("Division par zéro", exception.getMessage());
    }

    @Test
    void testPuissance() {
        assertEquals(8, calc.puissance(2, 3));
        assertEquals(1, calc.puissance(5, 0));
    }

    @Test
    void testPuissanceNegative() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calc.puissance(2, -1);
        });
        assertEquals("Exponent must be non-negative", exception.getMessage());
    }

    @ParameterizedTest
    @CsvSource({
            "2, 3, 5",
            "10, 15, 25",
            "-2, 4, 2"
    })
    void testAdditionParametree(int a, int b, int resultatAttendu) {
        assertEquals(resultatAttendu, calc.addition(a, b));
    }
}
