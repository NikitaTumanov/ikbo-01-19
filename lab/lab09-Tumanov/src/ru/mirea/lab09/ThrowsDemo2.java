package ru.mirea.lab09;

import java.util.Scanner;

public class ThrowsDemo2 {

    public static void getKey() {
        Scanner scanner = new Scanner(System.in);
        String key = scanner.next();
        printDetails(key);
    }

    public static void printDetails(String key) {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (Exception e) {
            System.out.println("The string is empty");
        }
    }

    private static String getDetails(String key) throws Exception {
        if (key.equals("")) {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        printDetails("MyKey");
        printDetails("");

    }

}