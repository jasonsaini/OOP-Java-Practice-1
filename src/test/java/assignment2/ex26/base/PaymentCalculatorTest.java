package assignment2.ex26.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {

    @Test
    void calculates_correct_number_of_months()
    {
        PaymentCalculator calculator = new PaymentCalculator();
        double expected = 70;
        double actual = calculator.calculateMonthsUntilPaidOff(12, 5000, 100);
        assertEquals(expected,actual);
    }





}