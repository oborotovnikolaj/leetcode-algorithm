import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstBadVersionTest {

    @Test
    void firstBadVersion() {
        FirstBadVersion firstBadVersion = new FirstBadVersion();
        firstBadVersion.badVersion = 1702766719;
        assertEquals(firstBadVersion.badVersion, firstBadVersion.firstBadVersion(2126753390));

        firstBadVersion.badVersion = 4;
        assertEquals(firstBadVersion.badVersion, firstBadVersion.firstBadVersion(5));
    }
}