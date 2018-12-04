import org.junit.Test;

import static org.junit.Assert.*;

public class Task5Test {

    @Test
    public void isTriangle() {
        assertEquals(Task5.isTriangle(1,2,2), true);
        assertEquals(Task5.isTriangle(7,2,2), false);
    }
}