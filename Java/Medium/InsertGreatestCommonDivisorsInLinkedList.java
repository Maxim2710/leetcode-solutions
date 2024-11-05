package Medium;

public class InsertGreatestCommonDivisorsInLinkedList {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode current = head;

        while (current != null && current.next != null) {
            int gcdValue = gcd(current.val, current.next.val);

            ListNode listNode = new ListNode(gcdValue);

            listNode.next = current.next;
            current.next = listNode;

            current = listNode.next;
        }

        return head;
    }

    private int gcd(int val, int val1) {
        while (val1 != 0) {
            int temp = val1;
            val1 = val % val1;
            val = temp;
        }

        return val;
    }
}
