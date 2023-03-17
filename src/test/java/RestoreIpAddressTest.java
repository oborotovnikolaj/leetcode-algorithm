import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RestoreIpAddressTest {

    @Test
    void restoreIpAddresses() {
        RestoreIpAddress restoreIpAddress = new RestoreIpAddress();
        List<String> expected = List.of("17.216.25.41", "17.216.254.1", "172.16.25.41", "172.16.254.1", "172.162.5.41", "172.162.54.1");
        List<String> strings = restoreIpAddress.restoreIpAddresses("172162541");
        strings.forEach(s -> System.out.println(s));
        assertTrue(strings.containsAll(expected));
        assertEquals(strings.size(), expected.size());
    }
}