import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class RemoveNthFromEndTest {

    @Test
    void removeNthFromEnd() {
        RemoveNthFromEnd middleNode = new RemoveNthFromEnd();

        assertArrayEquals(
                createArray(middleNode.removeNthFromEnd(createList(new int[]{1, 2, 3, 4, 5}), 2)),
                new int[]{1, 2, 3, 5}
        );

        assertArrayEquals(
                createArray(middleNode.removeNthFromEnd(createList(new int[]{1,2}), 1)),
                new int[]{1}
        );

//        assertArrayEquals(
//                createArray(middleNode.removeNthFromEnd(createList(new int[]{1,2}), 0)),
//                new int[]{1}
//        );

        assertArrayEquals(
                createArray(middleNode.removeNthFromEnd(createList(new int[]{1}), 1)),
                new int[]{}
        );

        assertArrayEquals(
                createArray(middleNode.removeNthFromEnd(createList(new int[]{1,2}), 2)),
                new int[]{2}
        );
    }

    private RemoveNthFromEnd.ListNode createList(int[] array) {
        RemoveNthFromEnd.ListNode head = new RemoveNthFromEnd.ListNode(array[0]);
        RemoveNthFromEnd.ListNode current = head;
        for (int e : Arrays.copyOfRange(array, 1, array.length)) {
            RemoveNthFromEnd.ListNode next = new RemoveNthFromEnd.ListNode(e);
            current.setNext(next);
            current = next;
        }
        return head;
    }

    private int[] createArray(RemoveNthFromEnd.ListNode head) {
        RemoveNthFromEnd.ListNode current = head;
        ArrayList<Integer> ints = new ArrayList<>();
        while (current != null) {
            ints.add(current.val);
            current = current.next;
        }
        return ints.stream().mapToInt(i -> i).toArray();
    }
}