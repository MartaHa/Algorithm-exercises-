import org.junit.Test;

import static org.junit.Assert.*;

public class Task4Test {

    @Test
    public void findEvenIndex() {
        assertEquals(3,Task4.findEvenIndex(new int[] {1,2,3,4,3,2,1}));
        assertEquals(1,Task4.findEvenIndex(new int[] {1,100,50,-51,1,1}));
        assertEquals(-1,Task4.findEvenIndex(new int[] {-8505, -5130, 1926, -9026}));
    }
}