package com.pb.lesson12.number4;

public class Pants extends Dress implements ClothForMen, ClothForWomen {

    Pants() {
    }

    @Override
    public void dressMan() {
        super.size = Size.L.euroSize;
        super.cost = 499;
        super.color = "red";
    }

    @Override
    public void dressWomen() {
        super.size = Size.M.euroSize;
        super.cost = 10;
        super.color = "green";
    }
}
