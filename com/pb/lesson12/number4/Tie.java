package com.pb.lesson12.number4;

public class Tie extends Dress implements ClothForMen {
    Tie() {

    }

    @Override
    public void dressMan() {
        size = Size.M.euroSize;
        cost = 37;
        color = "black";
    }
}
