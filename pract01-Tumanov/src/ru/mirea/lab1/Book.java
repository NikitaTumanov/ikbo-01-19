package ru.mirea.lab1;

public class Book {
    public String author;
    public int dateofmaking;
    public Book(){
        author="Pushkin";
        dateofmaking=1790;
    }
    public Book(String a,int d){
        author=a;
        dateofmaking=d;
    }
    public int getDateofmaking(){
        return dateofmaking;
    }
    public String getAuthor(){
        return author;
    }
}
