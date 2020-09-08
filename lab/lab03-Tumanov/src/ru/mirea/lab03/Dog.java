package ru.mirea.lab03;

public abstract class Dog {
    private String name;
    public Dog(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public abstract void showInformation();
}
