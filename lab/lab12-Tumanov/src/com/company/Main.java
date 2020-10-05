package com.company;

import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Дата в формате DD/MM/YYYY, начиная с 1900 года до 9999 года:");
        Pattern pattern = Pattern.compile("(0[1-9]|[12][0-9]|3[01])[- /.](0[1-9]|1[012])[- /.](19[0-9][0-9]|[2-9][0-9][0-9][0-9])");
        String[] tests = {
                "29/02/9999",
                "30.04.2070",
                "1/1/2458",
                "29/02/1934",
                "30-04-1900",
                "1/1/1899"
        };
        for (String test : tests) {
            System.out.println(pattern.matcher(test).matches() + "\t:" + test);
        }
    }
}
