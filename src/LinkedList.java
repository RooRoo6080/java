public class LinkedList {
    public static class Node {
        Node next;
        int data;
        Node (int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node current = head;
        for (int i = 2; i <= 10; i++) {
            current.next = new Node(i);
            current = current.next;
        }

        iterateList(head);
        append(head, 11);
        System.out.println();
        iterateList(head);
        head = prepend(head, 0);
        System.out.println();
        iterateList(head);
        System.out.println();
        delete(head, 7);
        iterateList(head);
    }

    public static void iterateList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public static void append(Node head, int data) {
        Node current = head;

        if (head == null) {
            head = new Node(data);
            return;
        }

        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(data);
    }

    public static Node prepend (Node head, int data) {
        Node newHead = new Node(data);
        newHead.next = head;
        return newHead;
    }

    public static void delete (Node head, int data) {
        Node current = head;
        while (current.next.data != data) current = current.next;
        current.next = current.next.next;
    }
}
