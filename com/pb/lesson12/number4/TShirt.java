package com.pb.lesson12.number4;

public class TShirt extends Dress implements ClothForMen, ClothForWomen {

    public TShirt(int size, int cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
    }

    @Override
    public void dressWomen() {
    }

    @Override
    public String toString() {
        return "TShirt " + super.toString();
    }
}
