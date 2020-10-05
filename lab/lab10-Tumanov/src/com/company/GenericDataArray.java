package com.company;

import java.util.Arrays;

public class GenericDataArray<T> {
    private final T[] data;
    private int currentSize;

    public GenericDataArray(int size) {
        if (size < 0)
            throw new IllegalStateException("Array size can not be negative");
        data = (T[]) new Object[size];
        currentSize = 0;
    }

    public void add(T item) {
        try {
            data[currentSize++] = item;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array is full, can not add more elements");
        }
    }

    public T at(int index) {
        try {
            return data[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ArrayIndexOutOfBoundsException(
                    "Index " + index + " is out of range");
        }
    }

    private boolean isEmpty() {
        return data.length == 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(data);
    }

    public static void main(String[] args) {
        GenericDataArray<Integer> ints = new GenericDataArray<>(10);
        for(int i = 0; i < 10; i++){
            ints.add((int)(Math.random()*1001));
        }
        ints.add(345);
        System.out.println(ints);


        GenericDataArray<String> strings = new GenericDataArray<>(3);
        strings.add("Testing");
        strings.add("generic");
        strings.add("array");
        System.out.println(strings);

        System.out.println(strings.at(2));

    }
}
