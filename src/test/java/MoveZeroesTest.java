import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MoveZeroesTest {

    @Test
    void moveZeroes() {
        MoveZeroes moveZeroes = new MoveZeroes();
        int[] test1 = new int[]{0, 1, 0, 3, 12};
        moveZeroes.moveZeroes(test1);
        assertArrayEquals(test1, new int[]{1, 3, 12, 0, 0});

        test1 = new int[]{0, 1, 0, 3, 12, 0, 14};
        moveZeroes.moveZeroes(test1);
        assertArrayEquals(test1, new int[]{1, 3, 12, 14, 0, 0, 0});


        test1 = new int[]{0, 1, 0, 3, 12, 0, 14, 0, 0, 0, 1, 0};
        moveZeroes.moveZeroes(test1);
        assertArrayEquals(test1, new int[]{1, 3, 12, 14, 1, 0, 0, 0, 0, 0, 0, 0});

        test1 = new int[]{0};
        moveZeroes.moveZeroes(test1);
        assertArrayEquals(test1, new int[]{0});
    }

    @Test
    void moveZeroesEasy() {
        MoveZeroes moveZeroes = new MoveZeroes();
        int[] test1 = new int[]{0, 1, 0, 3, 12};
        moveZeroes.moveZeroesEasy(test1);
        assertArrayEquals(test1, new int[]{1, 3, 12, 0, 0});

        test1 = new int[]{0, 1, 0, 3, 12, 0, 14};
        moveZeroes.moveZeroesEasy(test1);
        assertArrayEquals(test1, new int[]{1, 3, 12, 14, 0, 0, 0});


        test1 = new int[]{0, 1, 0, 3, 12, 0, 14, 0, 0, 0, 1, 0};
        moveZeroes.moveZeroesEasy(test1);
        assertArrayEquals(test1, new int[]{1, 3, 12, 14, 1, 0, 0, 0, 0, 0, 0, 0});

        test1 = new int[]{0};
        moveZeroes.moveZeroesEasy(test1);
        assertArrayEquals(test1, new int[]{0});
    }
}