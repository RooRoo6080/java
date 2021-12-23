package Coursera.DataStructures;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class priorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); //largest to smallest int

        pq.add(5);
        pq.add(10);
        pq.add(2);
        pq.add(15);

        //top element
        System.out.println(pq.peek());

        //printing and removing the top element
        System.out.println(pq.poll());

        System.out.println(pq);

        pq.remove(10);

        System.out.println(pq);
        System.out.println(Arrays.toString(pq.toArray()));

        System.out.println(pq.comparator());
    }
}
