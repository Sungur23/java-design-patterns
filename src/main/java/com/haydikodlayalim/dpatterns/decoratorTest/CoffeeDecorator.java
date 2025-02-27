package com.haydikodlayalim.dpatterns.decoratorTest;

public abstract class CoffeeDecorator implements Coffee {
    private final Coffee decoratedCoffee;
    public CoffeeDecorator(Coffee coffee) {
        this.decoratedCoffee = coffee;
    }
    @Override
    public double getCost() {
        return decoratedCoffee.getCost();
    }
    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription();
    }
}