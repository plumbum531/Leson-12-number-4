package com.pb.lesson12.number5;

    public enum CatalogOfProdact {
        Hat,
        Skirt,
        Footwear;

        private CatalogOfProdact() {
        }

        public static void CatalogPrint() {
            CatalogOfProdact[] catalogOfProdact = CatalogOfProdact.values();


            for(CatalogOfProdact prodacts: catalogOfProdact) {
                System.out.println("Catalog: " + prodacts);
            }

        }
    }
