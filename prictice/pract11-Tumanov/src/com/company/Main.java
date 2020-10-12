package com.company;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayQueue<Integer> arrayQueue = new ArrayQueue<>();
        for(int i=0; i<6;i++) {
            arrayQueue.add((int) (Math.random()*100));
        }
        System.out.println("ArrayQueue: "+ arrayQueue);
        System.out.println("Poll: " + arrayQueue.poll() + "\t"+arrayQueue);
        System.out.println("First element: " + arrayQueue.element() + "\t"+arrayQueue+"\n");

        LinkedQueue<Integer> linkedQueue = new LinkedQueue<>();
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(12, 43, 55, 67, 80));
        linkedQueue.addAll(arrayList);
        linkedQueue.offer(45);
        System.out.println("LinkedQueue: " + linkedQueue);
        System.out.println("Queue size: " + linkedQueue.size());
        System.out.println("Poll: " + linkedQueue.poll() + "\t"+linkedQueue);
        System.out.println("Peek: " + linkedQueue.peek() + "\t"+linkedQueue);
    }
}