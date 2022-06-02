public class MiddleNode {

    public ListNode middleNode(ListNode head) {
        ListNode next = head.next;
        int size = 1;
        while (next != null) {
            size++;
            next = next.next;
        }
        int middle = size / 2 + 1;
        ListNode middleNode = head;
        for (int i = 1; i < middle; i++) {
            middleNode = middleNode.next;
        }

        return middleNode;
    }

    /**
     * Definition for singly-linked list.
     */
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        public void setNext(ListNode next) {
            this.next = next;
        }

    }
}


