package ru.mirea.pract02;

public class TestAuthor {
    public static void main() {
        Author author= new Author("Nikita","nikita@email.com",'m');
        System.out.println(author);
        author.setEmail("Nonikita@email.com");
        System.out.println("Email of author: "+author.getEmail());
    }
}
