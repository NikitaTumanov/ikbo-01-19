package com.company;

import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;

public abstract class AbstractQueue<T> implements Queue<T> {
    protected List<T> queue;

    @Override
    public T element() {
        T element = peek();
        if (element != null)
            return element;
        throw new NoSuchElementException();
    }

    public boolean add(T element) {
        if (offer(element))
            return true;
        throw new IllegalStateException("Queue full");
    }

    public T remove() {
        T element = poll();
        if (element != null)
            return element;
        throw new NoSuchElementException();
    }

    public boolean addAll(Collection<? extends T> collection) {
        if (collection == null)
            throw new NullPointerException();
        if (collection == this)
            throw new IllegalArgumentException();
        boolean modified = false;
        for (T element : collection) {
            if (add(element))
                modified = true;
        }
        return modified;
    }

    public abstract int size();

    @Override
    public String toString() {
        return queue.toString();
    }
}