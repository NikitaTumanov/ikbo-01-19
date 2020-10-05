package com.number1;

public class TestFactory {
    public static void main(String[] args) {
        Complex complex = new ConcreteFactory().createComplex(2, 3);
        Complex complex1 = new Complex();
        complex1.setImage(-1);
        complex1.setReal(0);
        System.out.println(complex);
        System.out.print(complex1);
    }
}
