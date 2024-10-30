package Easy;

import java.util.List;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode saveNextStep = current.next;
            current.next = prev;
            prev = current;
            current = saveNextStep;
        }

        return prev;
    }

}

