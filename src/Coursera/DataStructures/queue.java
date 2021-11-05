package Coursera.DataStructures;
import java.util.LinkedList;
import java.util.Queue;


public class queue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(16);
        queue.add(51);
        queue.add(85);
        queue.add(28);
        queue.add(56);
        queue.add(45);
        System.out.println(queue);
        int rm = queue.remove();
        System.out.println(rm);
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.size());
    }
}
