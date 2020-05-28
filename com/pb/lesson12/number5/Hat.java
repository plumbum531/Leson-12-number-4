package com.pb.lesson12.number5;

public enum Hat {
    BlackHat,
    BrownHat;

    private Hat() {
    }

    public static void hatPrint() {
        Hat[] hats= Hat.values();

        for(Hat c: hats) {
            System.out.println("Catalog Hat: " + c);
        }

    }
}
