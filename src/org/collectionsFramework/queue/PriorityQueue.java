package org.collectionsFramework.queue;

import java.util.Comparator;
import java.util.Queue;

public class PriorityQueue {
    public static void main(String[] args) {
//        Queue queue = new java.util.PriorityQueue();
//
//        queue.add(23);
//        queue.add(12);
//        queue.add(1);
//        queue.add(11);
//        System.out.println(queue);

        Queue queue = new java.util.PriorityQueue(Comparator.reverseOrder());

        queue.add(23);
        queue.add(12);
        queue.add(1);
        queue.poll();
        queue.add(11);
        System.out.println(queue);
    }
}
