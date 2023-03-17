import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesTest {

    private final RemoveDuplicates removeDuplicates = new RemoveDuplicates();

    @Test
    void removeDuplicates() {
        assertEquals(2, removeDuplicates.removeDuplicates(new int[] {1,1,2}));
        assertEquals(5, removeDuplicates.removeDuplicates(new int[] {0,0,1,1,1,2,2,3,3,4}));
    }
}