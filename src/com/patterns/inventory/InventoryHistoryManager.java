package com.patterns.inventory;

import java.util.Stack;

public class InventoryHistoryManager {
    private Stack<InventoryMemento> inventoryHistory = new Stack<>();

    public InventoryHistoryManager() {
        System.out.println("Creating com.patterns.inventory.InventoryHistoryManager!");
    }

    public void save(Inventory inv) {
        System.out.println("Adding memento to inventoryHistory!");
        inventoryHistory.push(inv.save());
    }

    public void revert(Inventory inv) {
        System.out.println("removing memento from inventoryHistory!");
        inv.revert(inventoryHistory.pop());
    }

}
