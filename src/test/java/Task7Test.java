import org.junit.Test;

import static org.junit.Assert.*;

public class Task7Test {

    @Test
    public void highAndLow() {
        assertEquals("42 -9", Task7.HighAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
        assertEquals("21 -200", Task7.HighAndLow("0 0 -200 14 21 0 0 -92 14 7 14 -44"));
    }
}