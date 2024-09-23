import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzyPrinterTest {
    @Test
    public void fizzyPrinterWith3(){
        FizzyPrinter printer = new FizzyPrinter();
        assertEquals("Fizz",printer.printFizzy(9,false));
    }
    @Test
    public void fizzyPrinterWith5(){
        FizzyPrinter printer = new FizzyPrinter();
        assertEquals("Buzz",printer.printFizzy(25,false));
    }
    @Test
    public void fizzyPrinterWith7(){
        FizzyPrinter printer = new FizzyPrinter();
        assertEquals("Bang",printer.printFizzy(49,false));
    }
    @Test
    public void fizzyPrinterWith3and5(){
        FizzyPrinter printer = new FizzyPrinter();
        assertEquals("FizzBuzz",printer.printFizzy(15,false));
    }
    @Test
    public void fizzyPrinterWith35and7(){
        FizzyPrinter printer = new FizzyPrinter();
        assertEquals("FizzBuzzBang",printer.printFizzy(105,false));
    }
    @Test
    public void fizzyPrinterDefault(){
        FizzyPrinter printer = new FizzyPrinter();
        assertEquals("Boom",printer.printFizzy(2,false));
    }
    @Test
    public void fizzyPrinterUpperCase(){
        FizzyPrinter printer = new FizzyPrinter();
        assertEquals("BOOM",printer.printFizzy(2,true));
    }
}
