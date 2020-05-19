package com.pb.lesson12.number4;

public class Pants extends Dress implements ClothForMen, ClothForWomen {

    public Pants(int size, int cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
//  WTF?!  Read my comments in Studio class
//        super.size = Size.L.euroSize;
//        super.cost = 499;
//        super.color = "red";
    }

    @Override
    public void dressWomen() {
//  WTF?!  Read my comments in Studio class
//        super.size = Size.M.euroSize;
//        super.cost = 10;
//        super.color = "green";
    }

    @Override
    public String toString() {
        return "Pants " + super.toString();
    }
}
