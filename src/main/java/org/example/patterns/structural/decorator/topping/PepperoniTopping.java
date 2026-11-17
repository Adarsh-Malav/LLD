package org.example.patterns.structural.decorator.topping;

import org.example.patterns.structural.decorator.BasePizza;
import org.example.patterns.structural.decorator.ToppingDecorator;

// Step 4: Define the Concrete Decorators
public class PepperoniTopping extends ToppingDecorator {

    public PepperoniTopping(BasePizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " + Pepperoni";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 50;
    }
}