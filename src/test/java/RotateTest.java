import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class RotateTest {

    @Test
    void rotate() {
        Rotate rotate = new Rotate();
        int[] test1 = new int[] {1, 2, 3, 4, 5, 6, 7};
        rotate.rotate(test1, 3);
        assertArrayEquals(test1, new int[]{5, 6, 7, 1, 2, 3, 4});

        test1 = new int[]{-1, -100, 3, 99};
        rotate.rotate(test1, 2);
        assertArrayEquals(test1, new int[]{3, 99, -1, -100});

        test1 = new int[]{-1};
        rotate.rotate(test1, 2);
        assertArrayEquals(test1, new int[]{-1});
    }
}