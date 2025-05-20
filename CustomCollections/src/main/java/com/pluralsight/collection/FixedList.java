package com.pluralsight.collection;

import java.util.ArrayList;
import java.util.List;

public class FixedList<T> {
    private final List<T> items;
    private final int maxSize;

    public FixedList(int maxSize) {
        this.items = new ArrayList<>();
        this.maxSize = maxSize;
    }

    public void add(T item) {
        if (items.size() < maxSize){
            items.add(item);
        } else {
            System.out.println("Connot add more item: list is full");
        }
    }

    public List<T> getItems(){
        return items;
    }
}
