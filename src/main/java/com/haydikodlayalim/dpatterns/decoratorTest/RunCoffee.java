package com.haydikodlayalim.dpatterns.decoratorTest;

public class RunCoffee {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        coffee = new Milk(coffee);
        coffee = new Whip(coffee);
        System.out.println(coffee.getDescription() + " costs $" + coffee.getCost());
    }
}
