package Easy;

public class IntersectionOfTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        int lenA = 0, lenB = 0;
        ListNode tempA = headA;
        ListNode tempB = headB;

        while (tempA != null) {
            lenA++;
            tempA = tempA.next;
        }

        while (tempB != null) {
            lenB++;
            tempB = tempB.next;
        }

        tempA = headA;
        tempB = headB;

        if (lenA > lenB) {
            for (int i = 0; i < lenA - lenB; i++) {
                tempA = tempA.next;
            }
        } else {
            for (int i = 0; i < lenB - lenA; i++) {
                tempB = tempB.next;
            }
        }

        while (tempA != tempB) {
            tempA = tempA.next;
            tempB = tempB.next;
        }

        return tempA;
    }
}
