package com.main.java.lesson3.bouquetproject.flowers;

public class Lily extends Flower{

    public Lily(String color, int length){
        this.color = color;
        this.length = length;
        this.setAmountOfDaysInShop();
        this.price = this.countingPrice();
    }

    @Override
    public double countingPrice(){
        switch(amountOfDaysInShop){
            case 1: return (random.nextInt(100)+1);
            case 2: return (random.nextInt(80)+1);
            case 3: return (random.nextInt(60)+1);
            case 4: return (random.nextInt(40)+1);
            default: return (random.nextInt(10));
        }
    }
}
