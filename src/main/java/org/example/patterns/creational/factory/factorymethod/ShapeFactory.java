package org.example.patterns.creational.factory.factorymethod;


import org.example.patterns.creational.factory.Shape;

// Step 3: Abstract Creator class
public abstract class ShapeFactory {

    // Factory method - to be implemented by subclasses
    public abstract Shape createShape();

}