package com.number2;

public class Test {
    public static void main(String[] args) {

        Client client = new Client();

        client.setChair(new ChairFactory().createMagicChair());
        client.sit();
        client.setChair(new ChairFactory().createVictorianChair());
        client.sit();
        client.setChair(new ChairFactory().createFunctionalChair());
        client.sit();

        MagicChair magicChair = new MagicChair();
        magicChair.doMagic();

        FunctionalChair functionalChair = new FunctionalChair();
        System.out.println(functionalChair.sum(32, 23));
    }
}
