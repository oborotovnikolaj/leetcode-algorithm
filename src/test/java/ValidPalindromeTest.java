import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeTest {

    @Test
    void isPalindrome() {
        ValidPalindrome validPalindrome = new ValidPalindrome();
        assertTrue(validPalindrome.isPalindrome("A nan, a"));
        assertTrue(validPalindrome.isPalindrome("A man, a plan, a canal: Panama"));
    }
}