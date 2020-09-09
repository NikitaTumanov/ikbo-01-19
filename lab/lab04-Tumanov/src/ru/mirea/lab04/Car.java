package ru.mirea.lab04;

public class Car implements Nameable {
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Название машины: "+name);
    }
}
