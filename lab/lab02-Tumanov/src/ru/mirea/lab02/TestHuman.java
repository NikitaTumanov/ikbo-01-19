package ru.mirea.lab02;

import ru.mirea.lab02.Human;

public class TestHuman {
    public static void main(String[] args) {
        System.out.println("Вариант задания №2:");
        Human human = new Human();
        System.out.println("Длина головы: "+ human.head.getLength()+" Цвет головы: "+ human.head.getColour());
        System.out.println("Длина ноги: "+ human.leg.getLength()+" Цвет ноги: "+ human.leg.getColour());
        System.out.println("Длина руки: "+ human.hand.getLength()+" Цвет руки: "+ human.hand.getColour());
    }
}
