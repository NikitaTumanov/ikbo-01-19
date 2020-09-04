package ru.mirea.lab1;

public class Ball {
    public int radius;
    public String colour;
    public Ball(){
        radius=10;
        colour="red";
    }
    public Ball(int r,String c){
        radius=r;
        colour=c;
    }
    public int getRadius(){
        return radius;
    }
    public String getColour(){
        return colour;
    }

}
