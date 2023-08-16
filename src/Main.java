public class Main {
    public static void main(String[] args) {
/*
#1
Допустим, у нас есть магазин. В нашем магазине есть товары трёх категорий:
 продукты, электроника, одежда. У каждого товара есть цена и наименование .
  У каждого товара есть метод купить
при покупки продуктов должна появиться дополнительная цена за срочность доставки.
при покупке электроники, покупателю оформляют гарантию
(т.е. при покупке должен выполнятся метод “Оформить гарантию”)

Необходимо создать соответствующую структуру классов метод покупки товара.
Вы можете использовать класс “корзина” реализованный ранее.
#2
Придумайте свою иерархию классов в которой будет родительский класс и классы наследники,
 расширяющих его функционал

 */
        Cloth q1 = new Cloth("Jeans1 ", 45);
        Cloth q2 = new Cloth("T-shirt ", 20);
       Cloth q3 = new Cloth("Shorts ", 30);
        Cloth q4 = new Cloth("Jacket ", 70);

        Products w1=new Products(" Cake ", 15);
        Products w2=new Products(" Sausage ", 8);
        Products w3=new Products(" Meat ", 5);
        Products w4=new Products(" Chips ", 3);

        Electronics e1=new Electronics(" Pone ", 300);
        Electronics e2=new Electronics(" TV ", 150);
        Electronics e3=new Electronics(" Computer ", 1500);
        Electronics e4=new Electronics(" Tablet ", 700);


        Shop[] shops={q1,q2,q3,q4,w1,w2,w3,w4,e1,e2,e3,e4};
        for (Shop e:shops){
            e.getName();
        }
        System.out.println(" Online store assortment ");

        System.out.println("Cloth:");
        System.out.println(q1);
        System.out.println(q2);
        System.out.println(q3);
        System.out.println(q4);
        System.out.println();

        System.out.println("Products:");
        System.out.println(w1);
        System.out.println(w2);
        System.out.println(w3);
        System.out.println(w4);
        System.out.println();

        System.out.println("Electronics:");
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e4);


    }
}