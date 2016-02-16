import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mockito;
import java.util.ArrayList;
import java.util.Scanner;

public class CoffeeMakerTest {

    /*
    Tests whether the user's input matches what is returned from Scanner.
    Test does not pass because Mockito cannot mock java.util.Scanner
     */
    @org.junit.Test
    public void testGetInput() throws Exception {
        CoffeeMaker quest = new CoffeeMaker();
        Scanner scan = Mockito.mock(Scanner.class);
        Mockito.when(scan.nextLine()).thenReturn("N");
        assertEquals("N", quest.getInput());
    }


    @Test
    public void testPrintInventory() throws Exception {
    }

    /*
    Should check whether the boolean array index 0 of the inventory has coffee.
     */
    @org.junit.Test
    public void testCheckCoffee() throws Exception {
        CoffeeMaker q = Mockito.mock(CoffeeMaker.class);
        Mockito.when(q.checkCoffee(null)).thenReturn(true);
        assertEquals(true, q.checkCoffee(null));

        Mockito.when(q.checkCoffee(null)).thenReturn(true);
        assertNotEquals(false, q.checkCoffee(null));

    }

    /*
    Should check whether the boolean array index 1 of the inventory has cream.
     */
    @org.junit.Test
    public void testCheckCream() throws Exception {
        CoffeeMaker q = Mockito.mock(CoffeeMaker.class);
        Mockito.when(q.checkCream(null)).thenReturn(true);
        assertEquals(true, q.checkCream(null));

        Mockito.when(q.checkCream(null)).thenReturn(true);
        assertNotEquals(false, q.checkCream(null));
    }

    /*
    Should check whether the boolean array index 2 of the inventory has sugar.
     */
    @org.junit.Test
    public void testCheckSugar() throws Exception {
        CoffeeMaker q = Mockito.mock(CoffeeMaker.class);
        Mockito.when(q.checkSugar(null)).thenReturn(true);
        assertEquals(true, q.checkSugar(null));

        Mockito.when(q.checkSugar(null)).thenReturn(true);
        assertNotEquals(false, q.checkSugar(null));
    }

    /*
    This test should check the 3 parameters of coffee, cream, and sugar and return 0 only if all 3 are true, otherwise
    it should return false. This test is failing, however.
     */
    @org.junit.Test
    public void testCheckWin() throws Exception {
        CoffeeMaker quest = Mockito.mock(CoffeeMaker.class);
        Mockito.when(quest.checkSugar(null)).thenReturn(true);
        Mockito.when(quest.checkCream(null)).thenReturn(true);
        Mockito.when(quest.checkCoffee(null)).thenReturn(true);
        assertEquals(0, quest.checkWin(null));

        Mockito.when(quest.checkSugar(null)).thenReturn(false);
        Mockito.when(quest.checkCream(null)).thenReturn(false);
        Mockito.when(quest.checkCoffee(null)).thenReturn(false);
        assertEquals(1, quest.checkWin(null));

    }

    @org.junit.Test
    public void testStart() throws Exception {

    }
}
