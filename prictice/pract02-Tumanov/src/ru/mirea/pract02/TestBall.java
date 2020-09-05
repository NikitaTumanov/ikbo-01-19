package ru.mirea.pract02;

public class TestBall {
    public static void main() {
        Ball ball= new Ball(1.5,2.8);
        System.out.println(ball);
        ball.move(3.1, 4.8);
        System.out.println(ball);
    }
}
