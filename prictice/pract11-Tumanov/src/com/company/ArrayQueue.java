package com.company;

import java.util.ArrayList;

public class ArrayQueue<T> extends AbstractQueue<T> {

    public ArrayQueue() {
        this.queue = new ArrayList<>();
    }

    @Override
    public T poll() {
        if (queue == null)
            return null;
        T element = queue.get(0);
        queue.remove(0);
        return element;
    }

    @Override
    public T peek() {
        return queue == null ? null : queue.get(0);
    }

    @Override
    public boolean offer(T element) {
        return queue.add(element);
    }

    @Override
    public int size() {
        return queue.size();
    }

    @Override
    public String toString() {
        return queue.toString();
    }
}