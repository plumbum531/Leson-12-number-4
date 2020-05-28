package com.pb.lesson12.number5;



    public class Basket {
        Enum[] products = new Enum[4];

        public Basket(Enum a, Enum b, Enum c, Enum d) {
            this.products[0] = a;
            this.products[1] = b;
            this.products[2] = c;
            this.products[3] = d;
        }

        void printProducts() {
            //Enum[] print = Enum.value();

            for(Enum c: products) {
                System.out.println("In basket: " + c);
            }

        }
    }
