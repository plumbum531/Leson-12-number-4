package com.pb.lesson12.number4;

public abstract class Dress {
    private int size;
    private int cost;
    private String color;

    public Dress(int size, int cost, String color) {
        this.size = size;
        this.cost = cost;
        this.color = color;
    }

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
        return "{" +
                "size=" + size +
                ", cost=" + cost +
                ", color='" + color + '\'' +
                '}';
    }
}
