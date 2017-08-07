package com.main.java.lesson3.bouquetproject;

public class Shop {

    public static void main(String[] args) {
        Person Lida = new Person();
        Lida.buyBouquet(3, 4, 7);
        System.out.println(Lida.getBouquet()+"\n");

        Person Roma = new Person();
        Roma.buyBouquet(4,6,3);
        System.out.println(Roma.getBouquet()+"\n");

        System.out.println(Person.bouquetArrayList+"\n");
        System.out.println(Person.showTheMostFreshBouquet());
    }
}
