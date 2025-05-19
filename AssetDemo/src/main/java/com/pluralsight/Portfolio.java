package com.pluralsight;

import java.util.ArrayList;

public class Portfolio {

    private String name;
    private String owner;
    private ArrayList<Valuable> valuables;

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
        this.valuables = new ArrayList<Valuable>();
    }

    public void add(Valuable asset){
        this.valuables.add(asset);
    }

    public  double getValue(){
        double total = 0;
        for (Valuable fa : valuables){
            total += fa.getValue();
        }
        return total;
    }
}

