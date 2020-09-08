package ru.mirea.prac03.number123;

public class Square extends Rectangle {
    protected double side;

    public Square(){
        this.side=12.4;
        this.color="blue";
        this.filled=true;
        this.width=10.43;
        this.length=5.41;
    }

    public Square(double side){
        this.side=side;
        this.color="white";
        this.filled=false;
        this.width=10.3;
        this.length=5.6;
    }

    public Square(double side, String color, boolean filled){
        this.color=color;
        this.filled=filled;
        this.side=side;
        this.width=3.6;
        this.length=10.1;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setWidth(double width){
        this.width=width;
    }

    public void setLength(double length){
        this.length=length;
    }

    @Override
    public String toString() {
        return "Square{" + "side=" + side + ", width=" + width + ", length=" + length + ", color='" + color + '\'' + ", filled=" + filled + '}';
    }
}
