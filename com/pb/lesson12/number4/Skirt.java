package com.pb.lesson12.number4;

public class Skirt extends Dress implements ClothForWomen {

    public Skirt(int size, int cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressWomen() {
    }

    @Override
    public String toString() {
        return "Skirt " + super.toString();
    }
}
