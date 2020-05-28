
    package com.pb.lesson12.number5;

    public enum Skirt {
        BigSkirt,
        SmallSkirt;

        private Skirt() {
        }

        public static void skirtPrint() {
            Skirt[] skirts = Skirt.values();

            for(Skirt s: skirts) {
                System.out.println("Catalog Skirt: " + s);
            }

        }
    }

