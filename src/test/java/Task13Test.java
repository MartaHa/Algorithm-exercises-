import org.junit.Test;

import static org.junit.Assert.*;

public class Task13Test {

    @Test
    public void findUniq() {

        double [] numbers1 = new double[]{0, 1, 0};
        double [] numbers2 = new double[]{1, 1, 1, 2, 1, 1};

        assertEquals(1.0, Task13.findUniq(numbers1),0.0000000000001);
        assertEquals(2.0, Task13.findUniq(numbers2), 0.0000000000001);


    }

    @Test
    public void findUniq2() {
        double [] numbers1 = new double[]{0, 1, 0};
        double [] numbers2 = new double[]{1, 1, 1, 2, 1, 1};

        assertEquals(1.0, Task13.findUniq2(numbers1),0.0000000000001);
        assertEquals(2.0, Task13.findUniq2(numbers2), 0.0000000000001);
    }
}