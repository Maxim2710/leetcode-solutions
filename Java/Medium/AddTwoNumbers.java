package Medium;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode pointer1 = l1;
        ListNode pointer2 = l2;
        ListNode curNode = result;

        int carry = 0;

        while (pointer1 != null || pointer2 != null) {
            int p1Value = (pointer1 == null) ? 0 : pointer1.val;
            int p2Value = (pointer2 == null) ? 0 : pointer2.val;

            int sum = p1Value + p2Value + carry;
            carry = sum / 10;
            curNode.next = new ListNode(sum % 10);
            curNode = curNode.next;

            if (pointer1 != null) pointer1 = pointer1.next;
            if (pointer2 != null) pointer2 = pointer2.next;
        }

        if (carry > 0) {
            curNode.next = new ListNode(carry);
        }

        return result.next;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}