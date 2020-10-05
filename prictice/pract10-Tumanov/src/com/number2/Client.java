package com.number2;

public class Client {
    public Chair chair;

    public void sit() {
        System.out.println("Sitting on " + chair);
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }

    @Override
    public String toString() {
        return "Client{" + "chair=" + chair + '}';
    }
}
