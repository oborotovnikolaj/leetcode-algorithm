import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthOfLongestSubstringTest {

    @Test
    void lengthOfLongestSubstringBrute() {
        LengthOfLongestSubstring test = new LengthOfLongestSubstring();
        assertEquals(test.lengthOfLongestSubstringBrute("abcabcbb"), 3);
        assertEquals(test.lengthOfLongestSubstringBrute("bbbbb"), 1);
        assertEquals(test.lengthOfLongestSubstringBrute("pwwkew"), 3);
    }

    @Test
    void lengthOfLongestSubstring() {
        LengthOfLongestSubstring test = new LengthOfLongestSubstring();
        assertEquals(test.lengthOfLongestSubstring("abcabcbb"), 3);
        assertEquals(test.lengthOfLongestSubstring("bbbbb"), 1);
        assertEquals(test.lengthOfLongestSubstring("pwwkew"), 3);
    }
}