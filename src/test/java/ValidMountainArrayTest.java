import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ValidMountainArrayTest {

    private final ValidMountainArray validMountainArray = new ValidMountainArray();

    @Test
    void validMountainArray() {
        assertFalse(validMountainArray.validMountainArray(new int[] {1, 2}));
        assertFalse(validMountainArray.validMountainArray(new int[] {3,5,5}));
        assertTrue(validMountainArray.validMountainArray(new int[] {0,3,2,1}));
    }
}