package ru.mirea.lab02;

public class Human {
    public Head head;
    public Leg leg;
    public Hand hand;
    public Human() {
        this.head = new Head("white", 25);
        this.leg = new Leg("red", 110);
        this.hand = new Hand("blue", 64);
    }

    public class Head{
        private String color;
        private double length;
        private Head(String colour, double length){
            this.color=colour;
            this.length=length;
        }
        public String getColour(){
            return color;
        }
        public double getLength(){
            return length;
        }
    }

    public class Leg{
        private String color;
        private double length;
        private Leg(String colour, double length){
            this.color=colour;
            this.length=length;
        }
        public String getColour(){
            return color;
        }
        public double getLength(){
            return length;
        }
    }

    public class Hand{
        private String color;
        private double length;
        private Hand(String colour, double length){
            this.color=colour;
            this.length=length;
        }
        public String getColour(){
            return color;
        }
        public double getLength(){
            return length;
        }
    }
}
