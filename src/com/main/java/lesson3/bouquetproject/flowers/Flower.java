package com.main.java.lesson3.bouquetproject.flowers;

import java.util.Random;

public abstract class Flower {
    public String color;
    public int length;
    public int amountOfDaysInShop;
    public double price;

    public Random random = new Random();

    public double countingPrice(){
        switch(amountOfDaysInShop){
            case 1: this.price = (random.nextInt(50)+1); break;
            case 2: this.price = (random.nextInt(40)+1); break;
            case 3: this.price = (random.nextInt(30)+1); break;
            case 4: this.price = (random.nextInt(20)+1); break;
            default: this.price = (random.nextInt(10)); break;
        }

        return this.price;
    }

    int setAmountOfDaysInShop(){
        int amount = (int) Math.round(Math.random()*20);
        if (amount>10){
            System.out.println("The flower "+ this.getClass().getSimpleName()+" is "+amount+" days in shop. Should be thrown away!");
        }
        this.amountOfDaysInShop = amount;
        return amount;
    }


}
