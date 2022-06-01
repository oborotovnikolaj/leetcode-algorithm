import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SortedSquaresTest {

    @Test
    void sortedSquares() {
        SortedSquares sortedSquares = new SortedSquares();
        assertArrayEquals(new int[]{0, 1, 9, 16, 100}, sortedSquares.sortedSquaresPriorityQueue(new int[]{-4, -1, 0, 3, 10}));
        assertArrayEquals(new int[]{4, 9, 9, 49, 121}, sortedSquares.sortedSquaresPriorityQueue(new int[]{-7, -3, 2, 3, 11}));
    }

    @Test
    void sortedSquaresPriority() {
        SortedSquares sortedSquares = new SortedSquares();
//        assertArrayEquals(new int[]{0, 1, 9, 16, 100}, sortedSquares.sortedSquares(new int[]{-4, -1, 0, 3, 10}));
//        assertArrayEquals(new int[]{4, 9, 9, 49, 121}, sortedSquares.sortedSquares(new int[]{-7, -3, 2, 3, 11}));
        assertArrayEquals(new int[]{1}, sortedSquares.sortedSquares(new int[]{1}));
    }
}