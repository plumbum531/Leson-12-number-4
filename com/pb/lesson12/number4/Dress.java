package com.pb.lesson12.number4;

public abstract class Dress {
    int size;
    int cost;
    String color;

    Dress(){}

    public int getSize(){
        return (size);
    }

    public int getCost(){
        return (cost);
    }

    public String getColor(){
        return(color);
    }

    @Override
    public String toString() {
        return "Dress{" +
                "size=" + size +
                ", cost=" + cost +
                ", color='" + color + '\'' +
                '}';
    }
}
