import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MiddleNodeTest {

    @Test
    void middleNode() {
        MiddleNode middleNode = new MiddleNode();

        assertEquals(middleNode.middleNode(createList(new int[] {1,2,3,4,5})).val, 3);
        assertEquals(middleNode.middleNode(createList(new int[] {1,2,3,4,5,6})).val, 4);
    }

    private MiddleNode.ListNode createList(int[] array) {
        MiddleNode.ListNode head = new MiddleNode.ListNode(array[0]);
        MiddleNode.ListNode current = head;
        for(int e: Arrays.copyOfRange(array, 1, array.length)) {
            MiddleNode.ListNode next = new MiddleNode.ListNode(e);
            current.setNext(next);
            current = next;
        }
        return head;
    }
}