import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer();
    }

    @Test
    public void hasNumberOfSheets(){
        assertEquals(100, printer.getNumberOfSheets());
    }

    @Test
    public void canReduceSheets(){
        printer.print(2,5);
        assertEquals(90, printer.getNumberOfSheets());
    }

    @Test
    public void canRefill(){
        printer.print(2,5);
        printer.refill();
        assertEquals(100, printer.getNumberOfSheets());
    }

    @Test
    public void canReduceToner(){
        printer.print(2,5);
        assertEquals(40, printer.getTonerVolume());
    }



}
