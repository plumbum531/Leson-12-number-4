package com.pb.lesson12.number4;

public class TShirt extends Dress implements ClothForMen, ClothForWomen {

    TShirt() {
    }

    @Override
    public void dressMan() {
        size = Size.XXS.euroSize;
        cost = 28;
        color = "white";
    }

    @Override
    public void dressWomen() {
        size = Size.XS.euroSize;
        cost = 96;
        color = "brown";
    }
}
