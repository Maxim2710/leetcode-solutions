package Easy;

import java.util.Scanner;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        ListNode current = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        current.next = (list1 != null) ? list1 : list2;

        return dummy.next;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MergeTwoSortedLists solution = new MergeTwoSortedLists();

        ListNode list1 = ListNode.deserialize(scanner.nextLine());

        ListNode list2 = ListNode.deserialize(scanner.nextLine());

        ListNode mergedList = solution.mergeTwoLists(list1, list2);

        System.out.println(mergedList.serialize());

        scanner.close();
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public static ListNode deserialize(String data) {
        if (data == null || data.isEmpty()) return null;

        data = data.replaceAll("[\\[\\] ]", "");
        String[] values = data.split(",");

        ListNode dummy = new ListNode();
        ListNode current = dummy;

        for (String value : values) {
            if (!value.isEmpty()) {
                current.next = new ListNode(Integer.parseInt(value.trim()));
                current = current.next;
            }
        }

        return dummy.next;
    }

    public String serialize() {
        StringBuilder sb = new StringBuilder();
        ListNode current = this;

        sb.append("[");
        while (current != null) {
            sb.append(current.val);
            if (current.next != null) sb.append(",");
            current = current.next;
        }
        sb.append("]");

        return sb.toString();
    }
}
