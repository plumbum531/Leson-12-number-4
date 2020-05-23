package com.pb.lesson12.number4;

public enum Size {
    XXS(32){
        void getDiscription(){
            System.out.println("детский размер");
        }
    },XS(34),S(36),M(38),L(40);

    int euroSize;

    Size(int euroSize){
        this.euroSize=euroSize;
    }

    void getDiscription(){
        System.out.println("взрослый размер");
    }
}
