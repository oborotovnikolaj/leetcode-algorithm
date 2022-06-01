import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BinarySearchTest {

    @Test
    void search() {
        BinarySearch binarySearch = new BinarySearch();
        Assertions.assertEquals(4, binarySearch.search(new int[]{-1, 0, 3, 5, 9, 12}, 9));
        Assertions.assertEquals(4, binarySearch.search(new int[]{-1, 0, 3, 5, 9, 12, 15}, 9));
        Assertions.assertEquals(-1, binarySearch.search(new int[]{-1, 0, 3, 5, 9, 12}, 2));
        Assertions.assertEquals(-1, binarySearch.search(new int[]{-1}, 2));
        Assertions.assertEquals(0, binarySearch.search(new int[]{2}, 2));
        Assertions.assertEquals(-1, binarySearch.search(new int[]{2, 4, 5}, -10));
        Assertions.assertEquals(1, binarySearch.search(new int[]{-1, 0, 3, 5, 9, 12}, 0));
    }
}