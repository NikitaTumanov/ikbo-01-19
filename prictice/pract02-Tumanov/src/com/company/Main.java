package com.company;

import ru.mirea.pract02.TestAuthor;
import ru.mirea.pract02.TestBall;

public class Main {
    public static void main(String[] args) {
        System.out.println("Упражнение 1:");
        TestAuthor testAuthor = new TestAuthor();
        testAuthor.main();
        System.out.println("\n"+"Упражнение 2:");
        TestBall testBall = new TestBall();
        testBall.main();
    }
}
