package com.pb.lesson12.number4;

public class Skirt extends Dress implements ClothForWomen {

    Skirt() {
    }

    @Override
    public void dressWomen() {
        size = Size.S.euroSize;
        cost = 48;
        color = "yellow";

    }
}
