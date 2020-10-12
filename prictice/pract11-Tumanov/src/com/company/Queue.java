package com.company;

public interface Queue<T> {
    T element();
    T poll();
    T peek();
    boolean offer(T element);
}