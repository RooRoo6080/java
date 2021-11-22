package Coursera.DataStructures;

import java.util.LinkedList;
import java.util.Queue;

public class tree {
    static class Node {
        Node left, right;
        int data;
        public Node(int data) {
            this.data = data;
        }

        public void insert(int value) {
            if (value <= data) {
                if (left == null) left = new Node(value);
                else left.insert(value);
            }
            else {
                if (right == null) right = new Node(value);
                else right.insert(value);
            }
        }

        private int findSmallestValue() {
            return left == null ? data : left.findSmallestValue();
        }

        public void delete(int value) {
            if (left.data == value || right.data == value) {
                if (left.data == value) {
                    if (left.left == null && left.right == null) left = null;
                    else if (left.left == null) left = left.right;
                    else if (left.right == null) left = left.left;
                    else {
                        int smallestValue = left.findSmallestValue();
                        delete(smallestValue);
                        left.data = smallestValue;
                    }
                }
                else {
                    if (right.left == null && right.right == null) left = null;
                    else if (right.left == null) right = right.right;
                    else if (right.right == null) right = right.left;
                    else {
                        int smallestValue = right.findSmallestValue();
                        delete(smallestValue);
                        right.data = smallestValue;
                    }
                }
            }
            else if (value < data) {
                left.delete(value);
            }
            else {
                right.delete(value);
            }
        }

        public boolean contains(int value) {
            if (value == data) return true;
            else if (value < data) {
                if (left == null) return false;
                else return left.contains(value);
            }
            else {
                if (right == null) return false;
                else return right.contains(value);
            }
        }

        public void printTree() {
            if (left != null) left.printTree();
            System.out.print(data + " ");
            if (right != null) right.printTree();
        }

        public void printPreOrder() {
            System.out.print(data + " ");
            if (left != null) left.printPreOrder();
            if (right != null) right.printPreOrder();
        }

        public void printPostOrder() {
            if (left != null) left.printPostOrder();
            if (right != null) right.printPostOrder();
            System.out.print(data + " ");
        }

        public void printLeverOrder(Node head) {
            Queue<Node> nodes = new LinkedList<>();
            nodes.add(head);
            while (!nodes.isEmpty()) {
                Node curr = nodes.remove();
                System.out.print(curr.data + " ");
                if (curr.left != null) nodes.add(curr.left);
                if (curr.right != null) nodes.add(curr.right);
            }
        }
    }

    public static void main(String[] args) {
        Node head = new Node(6);
        head.insert(4);
        head.insert(8);
        head.insert(3);
        head.insert(5);
        head.insert(7);
        head.insert(9);
        head.insert(10);
        head.printTree();
        System.out.println();
        head.printLeverOrder(head);
        System.out.println();
        System.out.println(head.contains(3));
        head.delete(4);
        head.printTree();
        System.out.println();
        head.printPreOrder();
        System.out.println();
        head.printPostOrder();
        System.out.println();
        head.printLeverOrder(head);
    }
}
