package com.pb.lesson12.number5;

public class Buy {
    Enum[] forBuy;
    public Buy(Enum[] basketForBuy) {
        forBuy =basketForBuy;
    }

    void MethodToBuy(){
        for (Enum buy: forBuy){
        System.out.println("Product to buy: "+buy);
        }
    }
}
