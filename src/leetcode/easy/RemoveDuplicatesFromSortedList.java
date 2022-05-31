package leetcode.easy;

public class RemoveDuplicatesFromSortedList {

    public static class ListNode {
        ListNode next;
        int data;
        ListNode (int data) {
            this.data = data;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.next.data == current.data) current.next = current.next.next;
            else current = current.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1); //first item in linked list
        ListNode current = head;
        int[] listNode = {1, 2, 2, 2}; //what comes after the head
        for (int i : listNode) {
            current.next = new ListNode(i);
            current = current.next;
        }
        RemoveDuplicatesFromSortedList rdfsl = new RemoveDuplicatesFromSortedList();
        current = rdfsl.deleteDuplicates(head);
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

}
