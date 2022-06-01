import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseWordsTest {

    @Test
    void reverseWords() {
        ReverseWords reverseWords = new ReverseWords();

        assertEquals("s'teL ekat edoCteeL tsetnoc", reverseWords.reverseWords("Let's take LeetCode contest"));
        assertEquals("doG gniD", reverseWords.reverseWords("God Ding"));

    }
}