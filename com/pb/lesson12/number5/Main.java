//Создаем мини приложение - интернет-магазин.  Должны быть реализованы следующие возможности:
//        a) аутентификация пользователя. Пользователь вводит логин-пароль с клавиатуры.
//        б) просмотр списка каталогов товаров,
//        в) просмотр списка товаров определенного каталога,
//        г) выбор товара в корзину,
//        д) покупка товаров, находящихся в корзине.
//        Создаем перечисление содержащее значения для перечисленных операций.
//        Можете добавить свои операции или изменить что-то на свой вкус.


package com.pb.lesson12.number5;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Users users = new Users();
        users.getLogin();
        users.getPassword();

        CatalogOfProdact.CatalogPrint();
        Skirt.skirtPrint();
        Hat.hatPrint();

        Basket basket = new Basket(
                Hat.BlackHat,
                Hat.BrownHat,
                Skirt.BigSkirt,
                Skirt.SmallSkirt);

        basket.printProducts();
        new Buy(basket.products).MethodToBuy();
    }
}
