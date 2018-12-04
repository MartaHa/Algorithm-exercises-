import org.junit.Test;

import static org.junit.Assert.*;

public class Task6Test {

    @Test
    public void encrypt() {
        assertEquals("This is a test!", Task6.encrypt("This is a test!", 0));
        assertEquals("hsi  etTi sats!", Task6.encrypt("This is a test!", 1));
        assertEquals("s eT ashi tist!", Task6.encrypt("This is a test!", 2));
    }
}