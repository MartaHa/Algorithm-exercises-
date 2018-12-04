import org.junit.Test;

import static org.junit.Assert.*;

public class Task3Test {

    @Test
    public void validatePin() {
        String pin1 = "1234";
        String pin2 = "56789";
        String pin3 = "67hg";

        assertTrue("is not true", Task3.validatePin(pin1));
        assertFalse("soemthing is wrong", Task3.validatePin(pin2));
        assertFalse("something is wrong", Task3.validatePin(pin3));
    }
}