package org.example.patterns.structural.decorator.topping;

import org.example.patterns.structural.decorator.BasePizza;
import org.example.patterns.structural.decorator.ToppingDecorator;

// Step 4: Define the Concrete Decorators
public class MushroomTopping extends ToppingDecorator {

    public MushroomTopping(BasePizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " + Mushroom";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 40;
    }
}