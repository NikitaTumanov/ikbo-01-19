package ru.mirea.prac03.number123;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle(){
        this.filled=true;
        this.color="green";
        this.width=10.3;
        this.length=17.92;
    }

    public Rectangle(double width, double length){
        this.filled=false;
        this.color="green";
        this.width=width;
        this.length=length;
    }

    public Rectangle(double width, double length, String color, boolean filled){
        this.color=color;
        this.filled=filled;
        this.width=width;
        this.length=length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width*length;
    }

    @Override
    public double getPerimeter() {
        return 2*(width+length);
    }

    @Override
    public String toString() {
        return "Rectangle{" + "width=" + width + ", length=" + length + ", color='" + color + '\'' + ", filled=" + filled + '}';
    }
}
