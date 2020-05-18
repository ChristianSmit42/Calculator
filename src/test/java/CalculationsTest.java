import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculationsTest {
    Calculations calc = new Calculations();

    @Test
    @DisplayName("Summarize should add 2 and 3 to 5")
    public void SumShouldBe5From2Plus3() {
        // GIVEN
        double a = 2;
        double b = 3;
        // WHEN
        double result = calc.summarize(a, b);
        // THEN
        assertEquals(5, result);
    }

    @Test
    @DisplayName("Substract should substract 2 from 7 to 5")
    public void Substract2From7ShouldBe5() {
        // GIVEN
        double a = 7;
        double b = 2;
        // WHEN
        double result = calc.substract(a, b);
        // THEN
        assertEquals(5, result);
    }

    @Test
    @DisplayName("Multiply should Result in 15 From 5 and 3")
    public void Multiply5And3ToGet15() {
        // GIVEN
        double a = 5;
        double b = 3;
        // WHEN
        double result = calc.multiply(a, b);
        // THEN
        assertEquals(15, result);
    }

    @Test
    @DisplayName("Divide should Result in 12 from 144 and 12")
    public void Divide144By12ToResult12() {
        // GIVEN
        double a = 144;
        double b = 12;
        // WHEN
        double result = calc.divide(a, b);
        // THEN
        assertEquals(12, result);
    }

    @Test
    @DisplayName("SquareRoot of 144 should be 12")
    public void SquareRootOf144is12() {
        // GIVEN
        double a = 144;
        // WHEN
        double result = calc.simpleSquareRoot(a);
        //THEN
        assertEquals(12, result);
    }

}