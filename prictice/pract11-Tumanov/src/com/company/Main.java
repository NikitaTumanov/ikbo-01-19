package com.company;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayQueue<Integer> arrayQueue = new ArrayQueue<>();
        arrayQueue.add(123);
        arrayQueue.add(434);
        arrayQueue.add(524);
        arrayQueue.add(489);
        System.out.println("----------ArrayQueue----------");
        System.out.println(arrayQueue);
        System.out.println("First element: " + arrayQueue.element());
        System.out.println(arrayQueue);
        System.out.println("Poll: " + arrayQueue.poll());
        System.out.println(arrayQueue);
        System.out.println();

        LinkedQueue<Integer> linkedQueue = new LinkedQueue<>();
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(12, 43, 55, 67, 80));
        linkedQueue.addAll(arrayList);
        linkedQueue.offer(1);
        linkedQueue.offer(2);
        linkedQueue.offer(3);
        linkedQueue.offer(4);
        linkedQueue.offer(5);
        System.out.println("----------LinkedQueue----------");
        System.out.println(linkedQueue);
        System.out.println("Queue size: " + linkedQueue.size());
        System.out.println("Peek: " + linkedQueue.peek());
        System.out.println(linkedQueue);
        System.out.println("Poll: " + linkedQueue.poll());
        System.out.println(linkedQueue);
    }
}