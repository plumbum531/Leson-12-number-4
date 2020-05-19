package com.pb.lesson12.number4;

public class Tie extends Dress implements ClothForMen {
    public Tie(int size, int cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
    }

    @Override
    public String toString() {
        return "Tie " + super.toString();
    }
}
