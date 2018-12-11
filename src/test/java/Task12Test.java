import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class Task12Test {

    @Test
    public void isSortedAndHow() {

     int[] testArray = {1,5,8,3,4,5};
     int[] testArray2 = {1,5,8,13,14,25};
     int[] testArray3= {111,54,28,13,9,5};
     int[] testArray4 = {1,5,8,3,44,5};


        assertEquals("no", Task12.isSortedAndHow(testArray));
        assertEquals("yes, ascending", Task12.isSortedAndHow(testArray2));
        assertEquals("yes, descending", Task12.isSortedAndHow(testArray3));
        assertEquals("no", Task12.isSortedAndHow(testArray4));
    }

    @Test
    public void isSortedAndHow2version() {
        int[] testArray = {1,5,8,3,4,5};
        int[] testArray2 = {1,5,8,13,14,25};
        int[] testArray3= {111,54,28,13,9,5};
        int[] testArray4 = {1,5,8,3,44,5};


        assertEquals("no", Task12.isSortedAndHow2version(testArray));
        assertEquals("yes, ascending", Task12.isSortedAndHow2version(testArray2));
        assertEquals("yes, descending", Task12.isSortedAndHow2version(testArray3));
        assertEquals("no", Task12.isSortedAndHow2version(testArray4));
    }
    }

