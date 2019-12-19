package com.github.curriculeon;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by leon on 12/16/2019.
 */
public class GenericInventory<SomeType> implements InventoryInterface<SomeType>, Iterable<SomeType> {
    private List<SomeType> inventory = new ArrayList<>();

    public GenericInventory() { }

    public GenericInventory(List<SomeType> inventory) {
        this.inventory = inventory;
    }

    @Override
    public void add(SomeType someObject) {

        inventory.add(someObject);
    }

    @Override
    public Boolean contains(SomeType someObject) {

        return inventory.contains(someObject);
    }

    @Override
    public SomeType get(int indexOfElement) {

        return inventory.get(indexOfElement);
    }

    @Override
    public SomeType remove(int indexOfElement) {

        return inventory.remove(indexOfElement);
    }

    @Override
    public SomeType[] toArray(SomeType[] arrayToBePopulated) {
        return inventory.toArray(arrayToBePopulated);
    }

    @Override
    public Iterator<SomeType> iterator() {
        return inventory.iterator();
    }
}
