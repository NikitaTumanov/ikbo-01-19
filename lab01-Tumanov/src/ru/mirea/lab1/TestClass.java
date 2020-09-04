package ru.mirea.lab1;

public class TestClass {
    public static void main() {
        Dog d1 = new Dog();
        Dog d2 = new Dog(17, 7);
        System.out.println("Данные первой собаки:\n"+"Возраст:" + d1.getOld());
        System.out.println("Данные второй собаки:\n"+"Возраст:" + d2.getOld()+"\n");
        Ball b1 = new Ball();
        Ball b2 = new Ball(17, "green");
        System.out.println("Данные первого мяча:\n"+"Цвет:" + b1.getColour());
        System.out.println("Данные второго мяча:\n"+"Цвет:" + b2.getColour()+"\n");
        Book bo1 = new Book();
        Book bo2 = new Book("Ожегов", 1999);
        System.out.println("Данные первой книги:\n"+"Дата создания:" + bo1.getDateofmaking());
        System.out.println("Данные второй книги:\n"+"Дата создания:" + bo2.getDateofmaking());
    }
}
