package ru.mirea.prac03.number123;

public class Test {

    public static void main(String[] args) {
        System.out.println("-------------Проверка № 1--------------");
        Shape s1 = new Circle(5.5, "RED", false); // Upcast Circle to Shape
        System.out.println(s1); // Метод вызывается из класса Circle
        System.out.println(s1.getArea()); // Метод вызывается из класса Circle
        System.out.println(s1.getPerimeter()); // Метод вызывается из класса Circle
        System.out.println(s1.getColor()); // Метод вызывается из класса Shape
        System.out.println(s1.isFilled()); // Метод вызывается из класса Shape
        //System.out.println(s1.getRadius()); Метод getRadius отсутствует в классе Shape

        System.out.println("-------------Проверка № 2--------------");
        Circle c1 = (Circle)s1; // Downcast back to Circle
        System.out.println(c1); // Метод вызывается из класса Circle
        System.out.println(c1.getArea()); // Метод вызывается из класса Circle
        System.out.println(c1.getPerimeter()); // Метод вызывается из класса Circle
        System.out.println(c1.getColor()); // Метод вызывается из класса Shape
        System.out.println(c1.isFilled()); // Метод вызывается из класса Shape
        System.out.println(c1.getRadius()); // Метод вызывается из класса Circle

        //Shape s2 = new Shape(); Нельзя создать экземпляр абстрактного класса Shape

        System.out.println("-------------Проверка № 3--------------");
        Shape s3 = new Rectangle(1.0, 2.0, "RED", false); // Upcast
        System.out.println(s3); // Метод вызывается из класса Rectangle
        System.out.println(s3.getArea()); // Метод вызывается из класса Rectangle
        System.out.println(s3.getPerimeter()); // Метод вызывается из класса Rectangle
        System.out.println(s3.getColor()); // Метод вызывается из класса Shape
        //System.out.println(s3.getLength()); Метод getLength отсутствует в классе Shape

        System.out.println("-------------Проверка № 4--------------");
        Rectangle r1 = (Rectangle)s3; // downcast
        System.out.println(r1); // Метод вызывается из класса Rectangle
        System.out.println(r1.getArea()); // Метод вызывается из класса Rectangle
        System.out.println(r1.getColor()); // Метод вызывается из класса Shape
        System.out.println(r1.getLength()); // Метод вызывается из класса Rectangle

        System.out.println("-------------Проверка № 5--------------");
        Shape s4 = new Square(6.6); // Upcast
        System.out.println(s4); // Метод вызывается из класса Square
        System.out.println(s4.getArea()); // Метод вызывается из класса Rectangle
        System.out.println(s4.getColor()); // Метод вызывается из класса Shape
        //System.out.println(s4.getSide()); Метод getSide отсутствует в классе Shape

        System.out.println("-------------Проверка № 6--------------");
        // Take note that we downcast Shape s4 to Rectangle,
        // which is a superclass of Square, instead of Square
        Rectangle r2 = (Rectangle)s4; // downcast
        System.out.println(r2); // Метод вызывается из класса Rectangle
        System.out.println(r2.getArea()); // Метод вызывается из класса Rectangle
        System.out.println(r2.getColor()); // Метод вызывается из класса Shape
        //System.out.println(r2.getSide()); Метод getSide отсутствует в классе Rectangle
        System.out.println(r2.getLength()); // Метод вызывается из класса Rectangle

        System.out.println("-------------Проверка № 7--------------");
        // Downcast Rectangle r2 to Square
        Square sq1 = (Square)r2; // downcast
        System.out.println(sq1); // Метод вызывается из класса Square
        System.out.println(sq1.getArea()); // Метод вызывается из класса Rectangle
        System.out.println(sq1.getColor()); // Метод вызывается из класса Shape
        System.out.println(sq1.getSide()); // Метод вызывается из класса Square
        System.out.println(sq1.getLength()); // Метод вызывается из класса Rectangle
    }
}
