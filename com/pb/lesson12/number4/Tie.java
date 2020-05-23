package com.pb.lesson12.number4;

public class Tie extends Dress implements ClothForMen {
    Tie() {

    }


    @Override
    public void DressMan() {
        size = Size.M.euroSize;
        coast = 37;
        colour = "black";
    }
}
