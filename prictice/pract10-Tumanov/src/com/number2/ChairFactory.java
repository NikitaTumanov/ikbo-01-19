package com.number2;

public class ChairFactory implements AbstractChairFactory {
    @Override
    public VictorianChair createVictorianChair() {
        return new VictorianChair((int) (Math.random() * 1000) + 1);
    }

    @Override
    public MagicChair createMagicChair() {
        return new MagicChair();
    }

    @Override
    public FunctionalChair createFunctionalChair() {
        return new FunctionalChair();
    }
}
