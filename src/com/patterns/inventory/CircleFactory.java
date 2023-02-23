package com.patterns.inventory;

public class CircleFactory implements ShapeFactory{
    public CircleFactory() {
        System.out.println("com.patterns.inventory.Circle Factory Created!");
    }

    @Override
    public Shape getShape() {
        System.out.println("com.patterns.inventory.Circle Factory Creating a new com.patterns.inventory.Circle!");
        return new Circle();
    }
}
