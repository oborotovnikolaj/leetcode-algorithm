import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlusOneTest {

    private final PlusOne plusOne = new PlusOne();

    @Test
    void plusOne() {
        assertArrayEquals(new int[] {1, 2, 4}, plusOne.plusOne(new int[] {1,2,3}));
        assertArrayEquals(new int[] {2, 0, 0}, plusOne.plusOne(new int[] {1,9,9}));
        assertArrayEquals(new int[] {1, 0, 0}, plusOne.plusOne(new int[] {9,9}));
    }
}