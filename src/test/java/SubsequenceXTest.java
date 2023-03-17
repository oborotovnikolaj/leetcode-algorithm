import from_interview.SubsequenceX;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubsequenceXTest {

    private final SubsequenceX subsequenceX = new SubsequenceX();

    @Test
    void getSubsequence() {
//        assertArrayEquals(subsequenceX.getSubsequence(new int[]{1, 2, -3, 4, 5}, 6), new int[] {2, 4});
//        assertArrayEquals(subsequenceX.getSubsequence(new int[]{1, 2, -3, 4, 5}, 1), new int[] {0, 0});
//        assertArrayEquals(subsequenceX.getSubsequence(new int[]{1, 2, -3, 4, 100}, 100), new int[] {4, 4});
        assertArrayEquals(subsequenceX.getSubsequence(new int[]{1, 2, 1000, 4, 100}, 1000), new int[] {2, 2});
//        assertArrayEquals(subsequenceX.getSubsequence(new int[]{100, -1, -1, -1, -1}, 100), new int[] {0, 0});
    }
}