package kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoundToNearestHundred {

    public static int roundToNearestHundred(int num) {
        int rounded = (num + 100);
        rounded = rounded / 100;
        rounded = rounded * 100;
        return rounded;
    }

    @Test
    public void numberOfDivisorsTest() {
        assertEquals(100, roundToNearestHundred(1));
        assertEquals(100, roundToNearestHundred(99));
        assertEquals(200, roundToNearestHundred(101));
        assertEquals(300, roundToNearestHundred(254));
    }
}
