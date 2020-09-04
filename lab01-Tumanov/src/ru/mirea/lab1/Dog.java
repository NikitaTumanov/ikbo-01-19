package ru.mirea.lab1;

public class Dog {
    int weight;
    int old;
    public Dog(){
        weight=10;
        old=5;
    }
    public Dog(int w,int o){
        weight=w;
        old=o;
    }
    public int getWeight(){
        return weight;
    }
    public int getOld(){
        return old;
    }
}
