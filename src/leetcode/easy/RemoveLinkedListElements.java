package leetcode.easy;

public class RemoveLinkedListElements {

    public static class ListNode {
        ListNode next;
        int val;
        ListNode (int val) {
            this.val = val;
        }
    }

    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) head = head.next;
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.next.val == val) current.next = current.next.next;
            else current = current.next;
        }
        return head;
    }

    public static void main(String[] args) {
        RemoveLinkedListElements rlle = new RemoveLinkedListElements();
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(1);
        ListNode current = rlle.removeElements(head, 1);
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}
