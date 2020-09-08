package ru.mirea.lab03;

public class LittleDog extends Dog{
    private double volume;

    public LittleDog(String name, double volume) {
        super(name);
        this.volume=volume;
    }

    @Override
    public void showInformation() {
        System.out.println("Собака с именем "+super.getName()+" относится к классу маленьких собак из-за своих маленьких размеров ("+volume+")");
    }
}