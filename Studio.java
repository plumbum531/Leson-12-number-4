package Hello.Lesson12number4;
/*    б) Создать интерфейсы "Мужская Одежда" с методом "одетьМужчину" и "Женская Одежда" с методом "одетьЖенщину".
        в) Создать абстрактный класс Одежда, содержащий переменные - размер одежды, стоимость, цвет.
        г) Создать классы наследники Одежды - Футболка (реализует интерфейсы "Мужская Одежда" и "Женская Одежда"),
        Штаны (реализует интерфейсы "Мужская Одежда" и "Женская Одежда"), Юбка (реализует интерфейсы "Женская Одежда"),
        Галстук (реализует интерфейсы "Мужская Одежда").
        д) Создать массив, содержащий все типы одежды. Создать класс Ателье, содержащий методы одетьЖенщину,
        одетьМужчину, на вход которых будет поступать массив, содержащий все типы одежды. Метод одетьЖенщину
        выводит на консоль всю информацию о женской одежде. То же самое для метода одетьМужчину.*/

public class Studio {

    void DressMan ( Dress[] typedress){
        for (Dress d: typedress){
            if(d instanceof ClothForMen){
                ((ClothForMen) d).DressMan();
                System.out.println("Men: "+"Coast: " + d.getCoast() +" Colour: " +  d.getColour() +
                        " Size: " + d.getSize());
            }
        }
    }

    void DressWoman (Dress[] typedress) {
        for (Dress d : typedress) {
            if (d instanceof ClothForWomen) {
                ((ClothForWomen) d).DressWomen();
                System.out.println("Women: "+"Coast: " + d.getCoast() +" Colour: " +  d.getColour() +
                        " Size: " + d.getSize());
            }
        }
    }
}
