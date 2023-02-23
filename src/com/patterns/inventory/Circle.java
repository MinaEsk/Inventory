package com.patterns.inventory;

public class Circle implements Shape {

    @Override
    public void draw(){
        System.out.println("Drawing a com.patterns.inventory.Circle");
    }

    public Circle(){
        System.out.println("com.patterns.inventory.Circle Created!");
    }

}
