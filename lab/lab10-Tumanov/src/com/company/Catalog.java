package com.company;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Catalog {
    final private static String CATALOG_PATH = ".";

    private static List<String> directoryFiles(File dir) {
        List<String> files = new ArrayList<>();
        if (dir.isDirectory()) {
            try {
                for (File file : dir.listFiles()) {
                    files.add(file.getName());
                }
            } catch (NullPointerException e) {
                System.out.println("The directory is empty");
            }
        }
        return files;
    }

    public static void main(String[] args) {
        List<String> curr_files = directoryFiles(new File(CATALOG_PATH));

        if (curr_files.size() >= 5) {
            for (int i = 0; i < 5; i++)
                System.out.println(curr_files.get(i));
        } else {
            System.out.println(curr_files);
        }
    }
}