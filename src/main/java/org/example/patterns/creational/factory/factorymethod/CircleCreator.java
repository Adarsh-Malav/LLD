package org.example.patterns.creational.factory.factorymethod;


import org.example.patterns.creational.factory.Circle;
import org.example.patterns.creational.factory.Shape;

// Step 4: Concrete Creator classes
public class CircleCreator extends ShapeFactory {

    @Override
    public Shape createShape() {
        return new Circle();
    }
}
