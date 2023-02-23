package com.patterns.inventory;

public interface Shape {
     default void draw(){
        System.out.println("Drawing a com.patterns.inventory.Shape!");
    }
}
