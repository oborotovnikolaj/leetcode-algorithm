public class RemoveNthFromEnd {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode currentNode = head;
        ListNode nodeToChange = null;
        ListNode nodeToRemove = null;

        int i = 0;
        while (currentNode != null) {
            currentNode = currentNode.next;
            i++;
            if (n == i) {
                nodeToRemove = head;
            }
            if (i >= n && currentNode != null) {
                nodeToRemove = nodeToRemove.next;
                if (nodeToChange == null) {
                    nodeToChange = head;
                } else {
                    nodeToChange = nodeToChange.next;
                }
            }
        }
        if (nodeToRemove == null) {
            return null;
        }
        if (nodeToChange == null) {
            return head.next;
        }
        ListNode next = nodeToChange.next;
        if (next == null) {
            nodeToChange.next = null;
            return head;
        }

        next = next.next;
        nodeToChange.next = next;

        return head;
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


