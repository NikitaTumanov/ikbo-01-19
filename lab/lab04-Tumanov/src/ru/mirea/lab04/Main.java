package ru.mirea.lab04;

public class Main {

    public static void main(String[] args) {
    System.out.println("Вариант заданий: 1");
	Nameable nameable = new Planet("Neptune");
	nameable.print();
	nameable = new Car("Kia Rio");
	nameable.print();
    }
}