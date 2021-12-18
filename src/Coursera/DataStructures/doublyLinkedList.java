package Coursera.DataStructures;

public class doublyLinkedList {
    static class Node {
        Node next, prev;
        int data;
        Node head, tail;

        public Node(int data) {
            this.data = data;
        }
        public Node() {}

        public void append(int data) {
            Node node = new Node(data);
            if (head == null) {
                head = node;
                head.prev = null;
            }
            else {
                tail.next = node;
                node.prev = tail;
            }
            tail = node;
            tail.next = null;
        }

        public void prepend(int data) {
            Node node = new Node(data);
            node.prev = null;
            head.prev = node;
            node.next = head;
            head = node;
        }

        public void insert(int data, int after) {
            Node node = new Node(data);
            Node curr = head;
            while (curr != null && curr.data != after) curr = curr.next;
            if (curr != null) {
                node.next = curr.next;
                curr.next.prev = node;
                curr.next = node;
                node.prev = curr;
            }
        }

        public void print() {
            Node curr = head;
            while (curr != null) {
                System.out.print(curr.data + " ");
                curr = curr.next;
            }
        }

        public void printReverse() {
            Node curr = tail;
            while (curr != null) {
                System.out.print(curr.data + " ");
                curr = curr.prev;
            }
        }

        public void delete(int data) {
            Node curr = head;
            while (curr.next.data != data) {
                curr = curr.next;
            }
            curr.next = curr.next.next;
            curr = curr.next;
            curr.prev = curr.prev.prev;
        }
    }

    public static void main(String[] args) {
        Node head = new Node();
        head.append(5);
        head.print();
        System.out.println();
        head.append(3);
        head.print();
        System.out.println();
        head.prepend(9);
        head.print();
        System.out.println();
        head.insert(4, 5);
        head.print();
        System.out.println();
        head.printReverse();
        head.delete(5);
        System.out.println();
        head.print();
    }
}