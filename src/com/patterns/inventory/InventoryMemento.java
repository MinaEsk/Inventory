package com.patterns.inventory;

import java.util.ArrayList;
import java.util.List;

public class InventoryMemento {
    public List<Shape> getShapes() {
        return shapes;
    }

    private final List<Shape> shapes;

    public InventoryMemento(List<Shape> shapes){
        System.out.println("Creating com.patterns.inventory.InventoryMemento!");
        this.shapes=new ArrayList<>(shapes);
    }



}
