package ru.mirea.lab04;

public class Planet implements Nameable {
    private String name;

    public Planet(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Название планеты: "+name);
    }
}
