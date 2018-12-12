import org.junit.Test;

import static org.junit.Assert.*;

public class Task14Test {

    @Test
    public void expandedForm() {
        assertEquals("10 + 2", Task14.expandedForm(12));
        assertEquals("100 + 20 + 1", Task14.expandedForm(121));
        assertEquals("4000 + 900 + 10 + 2", Task14.expandedForm(4912));
        assertEquals("10000 + 4000 + 800 + 70 + 1", Task14.expandedForm(14_871));
    }
}