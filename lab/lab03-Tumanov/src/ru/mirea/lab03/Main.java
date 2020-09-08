package ru.mirea.lab03;

public class Main {
    public static void main(String[] args) {
        System.out.println("Вариант заданий: 2");
        Dog littleDog = new LittleDog("Chappy", 3.13);
        Dog bigDog = new BigDog("Wolfy", 20.34);
        littleDog.showInformation();
        bigDog.showInformation();
    }
}
