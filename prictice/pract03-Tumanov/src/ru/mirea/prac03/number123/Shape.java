package ru.mirea.prac03.number123;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape(){
        this.filled=false;
        this.color="red";
    }

    public Shape(String color, boolean filled){
        this.color=color;
        this.filled=filled;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public boolean isFilled() {
        return filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape{" + "color='" + color + '\'' + ", filled=" + filled + '}';
    }
}
