import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TwoSumTest {

    @Test
    void twoSum() {
        TwoSum twoSum = new TwoSum();
        assertArrayEquals(twoSum.twoSum(new int[]{2, 7, 11, 15}, 9), new int[]{1, 2});
        assertArrayEquals(twoSum.twoSum(new int[]{2, 3, 4}, 6), new int[]{1, 3});
        assertArrayEquals(twoSum.twoSum(new int[]{-1, 0}, -1), new int[]{1, 2});
        assertArrayEquals(twoSum.twoSum(new int[]{1, 5, 10, 20, 25}, 15), new int[]{2, 3});
    }

    @Test
    void twoSumReverse() {
        TwoSum twoSum = new TwoSum();
        assertArrayEquals(twoSum.twoSumReverse(new int[]{2, 7, 11, 15}, 9), new int[]{1, 2});
        assertArrayEquals(twoSum.twoSumReverse(new int[]{2, 3, 4}, 6), new int[]{1, 3});
        assertArrayEquals(twoSum.twoSumReverse(new int[]{-1, 0}, -1), new int[]{1, 2});
        assertArrayEquals(twoSum.twoSumReverse(new int[]{1, 5, 10, 20, 25}, 15), new int[]{2, 3});
    }

    @Test
    void twoSumReverseReverse() {
        TwoSum twoSum = new TwoSum();
        assertArrayEquals(twoSum.twoSumReverseReverse(new int[]{2, 7, 11, 15}, 9), new int[]{1, 2});
        assertArrayEquals(twoSum.twoSumReverseReverse(new int[]{2, 3, 4}, 6), new int[]{1, 3});
        assertArrayEquals(twoSum.twoSumReverseReverse(new int[]{-1, 0}, -1), new int[]{1, 2});
        assertArrayEquals(twoSum.twoSumReverseReverse(new int[]{1, 5, 10, 20, 25}, 15), new int[]{2, 3});
        assertArrayEquals(twoSum.twoSumReverseReverse(new int[]{5, 25, 75}, 100), new int[]{2, 3});
    }

    @Test
    void twoSumGoodSolution() {
        TwoSum twoSum = new TwoSum();
        assertArrayEquals(twoSum.twoSumGoodSolution(new int[]{2, 7, 11, 15}, 9), new int[]{1, 2});
        assertArrayEquals(twoSum.twoSumGoodSolution(new int[]{2, 3, 4}, 6), new int[]{1, 3});
        assertArrayEquals(twoSum.twoSumGoodSolution(new int[]{-1, 0}, -1), new int[]{1, 2});
        assertArrayEquals(twoSum.twoSumGoodSolution(new int[]{1, 5, 10, 20, 25}, 15), new int[]{2, 3});
        assertArrayEquals(twoSum.twoSumGoodSolution(new int[]{5, 25, 75}, 100), new int[]{2, 3});
    }
}