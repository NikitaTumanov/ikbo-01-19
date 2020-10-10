package com.company.task1;

public class Test1 {
    public static void main(String[] args) {
        System.out.println(new Person(null, "Туманов", null));
        System.out.println(new Person("", "Иванов", ""));
        System.out.println(new Person("Петр", "Петров", null));
        System.out.println(new Person("", "Иванов", "Иванович"));
        System.out.println(new Person("Семен", "Семенов", "Семенович"));
    }
}