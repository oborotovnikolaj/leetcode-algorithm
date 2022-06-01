import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {

    @Test
    void reverseString() {
        ReverseString reverseString = new ReverseString();

        char[] test1 = new char[]{'h','e','l','l','o'};
        reverseString.reverseString(test1);
        assertArrayEquals(test1, new char[]{'o','l','l','e','h'});

        test1 = new char[]{'H','a','n','n','a','h'};
        reverseString.reverseString(test1);
        assertArrayEquals(test1, new char[]{'h','a','n','n','a','H'});
    }
}