package com.patterns.inventory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Inventory implements Iterable{

    private List<Shape> shapes = new ArrayList<>();

    public Inventory() {
        System.out.println("com.patterns.inventory.Inventory for shapes Created!");
    }

    @Override
    public Iterator iterator() {
        System.out.println("com.patterns.inventory.Inventory returning Iterator!");
        return shapes.iterator();
    }

    public void addShape(Shape shape){
        System.out.println("Adding a shape to the inventory!");
        shapes.add(shape);
    }

    public InventoryMemento save(){
        System.out.println("Saving inventory!");
        return new InventoryMemento(shapes);
    }

    public void revert(InventoryMemento memento){
        System.out.println("Reverting inventory!");
        this.shapes = memento.getShapes();
    }
}
