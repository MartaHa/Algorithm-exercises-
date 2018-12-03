import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Task1Test {

    @Test
    public void digital_root() {

        int toTest = 21;
        assertEquals(3, Task1.digital_root(toTest));
        assertEquals(15, Task1.digital_root(456));

    }
}