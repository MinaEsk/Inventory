package com.patterns.inventory;

public class Main {

    public static void main(String[] args) {

        System.out.println("Demonstrating Factory pattern!");
        CircleFactory factory= new CircleFactory();
        Shape shape= factory.getShape();
        Shape square = new Square();
        System.out.println("Demonstrating Facade Pattern!");
        shape.draw();
        square.draw();
        System.out.println("Demonstrating Composite pattern!");
        Inventory inventory = new Inventory();
        inventory.addShape(shape);
        inventory.addShape(square);
        System.out.println("Demonstrating Memento pattern!");
        InventoryHistoryManager manager = new InventoryHistoryManager();
        manager.save(inventory);
        manager.revert(inventory);
        System.out.println("Demonstrating Iterator pattern!");
        inventory.iterator();

    }
}