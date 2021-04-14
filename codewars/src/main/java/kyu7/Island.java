package kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Island {

    public static int calculateIslands(int[][] array) {
        if (array == null || array.length == 0) {
            return 0;
        }

        int count = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 1) {
                    count++;
                    markIsland(array, i, j);
                }
            }
        }
        return count;
    }

    private static void markIsland(int[][] array, int row, int col) {
        if (row < 0 || row > array.length) {
            return;
        }

        if (col < 0 || col > array[row].length) {
            return;
        }

        if (array[row][col] == 0) {
            return;
        }


        markIsland(array, row, col + 1);
        markIsland(array, row + 1, col);

        array[row][col] = 0;
    }

    @Test
    public void fixedTests() {
        int[][] array = new int[][]{
                {1, 1, 1, 0},
                {1, 1, 0, 0},
                {1, 0, 1, 0},
                {0, 0, 0, 0}
        };

        assertEquals(2, calculateIslands(array));


        array = new int[][]{
                {1, 1, 1, 0},
                {1, 0, 0, 0},
                {1, 0, 1, 0},
                {0, 0, 0, 0}
        };

        assertEquals(2, calculateIslands(array));

        array = new int[][]{
                {0, 1, 1, 0},
                {0, 0, 0, 0},
                {1, 0, 1, 0},
                {0, 0, 0, 0}
        };

        assertEquals(3, calculateIslands(array));
    }
}

