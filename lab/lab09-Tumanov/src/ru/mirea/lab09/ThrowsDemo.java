package ru.mirea.lab09;

public class ThrowsDemo {
    public static void printMessage(String key) {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (NullPointerException e){
            System.out.println("Null parameter in key, should be String");
        }

    }

    public static String getDetails(String key) {
        if (key == null) {
            throw new NullPointerException("null key in getDetails");
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        printMessage(null);
        printMessage("MyKey");

    }
}
