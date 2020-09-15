package ru.mirea.lab08;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

	    try(FileWriter writer = new FileWriter("text.txt", false)){
	        String text = scanner.nextLine();
	        writer.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }

	    try (FileReader reader = new FileReader("text.txt")){
	        int c;
	        while((c=reader.read())!=-1){
	            System.out.print((char)c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
