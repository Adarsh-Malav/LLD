package org.example.patterns.creational.factory.factorymethod;


import org.example.patterns.creational.factory.Shape;
import org.example.patterns.creational.factory.Square;

// Step 4: Concrete Creator classes
public class SquareCreator extends ShapeFactory {
    
    @Override
    public Shape createShape() {
        return new Square();
    }
}
