import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchInsertTest {

    @Test
    void searchInsert() {
        SearchInsert searchInsert = new SearchInsert();

        assertEquals(searchInsert.searchInsert(new int[]{1,3,5,6}, 5), 2);
        assertEquals(searchInsert.searchInsert(new int[]{1,3,5,6}, 2), 1);
        assertEquals(searchInsert.searchInsert(new int[]{1,3,5,6}, 7), 4);
        assertEquals(searchInsert.searchInsert(new int[]{1,3,5,6}, 0), 0);
    }
}