import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void canAdd(){
        assertEquals(6, calculator.add(2,4));
    }

    @Test
    public void canSubtract(){
        assertEquals(6, calculator.subtract(10,4));
    }

    @Test
    public void canMultiply(){
        assertEquals(6, calculator.multiply(2,3));
    }

    @Test
    public void canDivide(){
        assertEquals(6, calculator.divide(24,4), 0.01);
    }

}
