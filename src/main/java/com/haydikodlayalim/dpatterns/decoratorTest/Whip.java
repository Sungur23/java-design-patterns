package com.haydikodlayalim.dpatterns.decoratorTest;

public class Whip extends CoffeeDecorator {
    public Whip(Coffee coffee) {
        super(coffee);
    }
    @Override
    public double getCost() {
        return super.getCost() + 0.7;
    }
    @Override
    public String getDescription() {
        return super.getDescription() + ", with whip";
    }
}