package ru.mirea.lab03;

public class BigDog extends Dog{
    private double volume;

    public BigDog(String name, double volume) {
        super(name);
        this.volume=volume;
    }

    @Override
    public void showInformation() {
        System.out.println("Собака с именем "+super.getName()+" относится к классу больших собак из-за своих больших размеров ("+volume+")");
    }
}
