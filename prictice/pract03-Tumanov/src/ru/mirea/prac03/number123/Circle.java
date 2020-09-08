package ru.mirea.prac03.number123;

public class Circle extends Shape{
    protected double radius;

    public Circle(){
        this.radius=1;
        this.filled=true;
        this.color="blue";
    }

    public Circle(double radius){
        this.radius=radius;
        this.filled=true;
        this.color="blue";
    }

    public Circle(double radius, String color, boolean filled){
        this.color=color;
        this.filled=filled;
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + ", color='" + color + '\'' + ", filled=" + filled + '}';
    }
}
