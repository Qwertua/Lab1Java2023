import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

public class CalculatingTask1Test {

    @Test
    public void EqualTest() {
        CalculatingTask1 calculatingTask1 = new CalculatingTask1();
        assertEquals(33, calculatingTask1.calcMethod(3, 4,5,6));
    }

    @Test
    public void exceptionTestingCorrectData() {
        CalculatingTask1 calculatingTask1 = new CalculatingTask1();
        assertThrows(IllegalArgumentException.class, () ->
                calculatingTask1.calcMethod(11,4,5,6));
    }
    @Test
    public void exeptionTestingDivideByZero() {
        CalculatingTask1 calculatingTask1 = new CalculatingTask1();
        assertThrows(IllegalArgumentException.class, () ->
                calculatingTask1.calcMethod(2,4,5,6));
    }
}
