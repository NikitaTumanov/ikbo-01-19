package ru.mirea.lab09;

public class ExceptionTest {
    public static void main(String[] args) {
	Exception1 exception1 = new Exception1();
	System.out.println("Задание 1");
	exception1.exceptionDemo();

	System.out.println("Задание 2");
	Exception2 exception2 = new Exception2();
	exception2.exceptionDemo();
    }
}
