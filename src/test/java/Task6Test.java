import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class Task6Test {

    @Test
    public void encrypt() throws IOException {
        assertEquals("This is a test!", Task6.encrypt("This is a test!", 0));
        assertEquals("hsi  etTi sats!", Task6.encrypt("This is a test!", 1));
        assertEquals("s eT ashi tist!", Task6.encrypt("This is a test!", 2));



    }


    @Test
    public void decrypt() throws IOException {
        assertEquals("This is a test!", Task6.decrypt("This is a test!", 0));
        assertEquals("hsi  etTi sats!", Task6.decrypt("hsi  etTi sats!",1));
        assertEquals("s eT ashi tist!", Task6.decrypt("s eT ashi tist!", 2));
    }
}