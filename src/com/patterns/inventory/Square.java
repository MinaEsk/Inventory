package com.patterns.inventory;

public class Square implements Shape {

    @Override
    public void draw(){
        System.out.println("Drawing a com.patterns.inventory.Square");
    }

    public Square(){
        System.out.println("com.patterns.inventory.Square Created!");
    }
}
