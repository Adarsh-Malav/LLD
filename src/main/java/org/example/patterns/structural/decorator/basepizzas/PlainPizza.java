package org.example.patterns.structural.decorator.basepizzas;

import org.example.patterns.structural.decorator.BasePizza;

// Step 2: Define the Concrete Component
public class PlainPizza implements BasePizza {
    @Override
    public String getDescription() {
        return "Plain Pizza";
    }

    @Override
    public double getCost() {
        return 200.00;
    }
}