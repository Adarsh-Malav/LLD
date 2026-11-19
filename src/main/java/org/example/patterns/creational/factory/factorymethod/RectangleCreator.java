package org.example.patterns.creational.factory.factorymethod;


import org.example.patterns.creational.factory.Rectangle;
import org.example.patterns.creational.factory.Shape;

// Step 4: Concrete Creator classes
public class RectangleCreator extends ShapeFactory {

    @Override
    public Shape createShape() {
        return new Rectangle();
    }
}
