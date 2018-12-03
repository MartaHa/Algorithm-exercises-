import org.junit.Test;

import static org.junit.Assert.*;

public class Task2Test {

    @Test
    public void findNeddle() {
        Object[] array = {null, "needle", "junk", 3};
        assertEquals("found the needle at position 1", Task2.findNeddle(array));
    }
}