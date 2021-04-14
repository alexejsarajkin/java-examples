package kyu7;

/*
  Given the triangle of consecutive odd numbers:

  1
  3     5
  7     9    11
  13    15    17    19
  21    23    25    27    29
  ...
  Calculate the row sums of this triangle from the row index (starting at index 1) e.g.:

  rowSumOddNumbers(1); // 1
  rowSumOddNumbers(2); // 3 + 5 = 8
*/

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        System.out.println(sumOfOddNumbers(42));
    }

    private static int sumOfOddNumbers(int n) {
        return n * n * n;
    }

    @Test
    public void sumOfOddNumbersTest() {
        assertEquals(1, sumOfOddNumbers(1));
        assertEquals(8, sumOfOddNumbers(2));
        assertEquals(74088, sumOfOddNumbers(42));
    }
}
