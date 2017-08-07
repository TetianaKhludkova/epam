package com.main.java.lesson3.bouquetproject;

import com.main.java.lesson3.bouquetproject.flowers.Flower;

import java.util.ArrayList;

public class Bouquet {
    private int amountOfFlowers;
    private double price;
    private int avarageFreshness;
    private ArrayList<Flower> flowers;

    public int getAmountOfFlowers() {
        return amountOfFlowers;
    }

    public void setAmountOfFlowers(int amountOfFlowers) {
        this.amountOfFlowers = amountOfFlowers;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(ArrayList<Flower> flowers) {
        flowers.stream().forEach(flower -> {this.price+=flower.countingPrice();});
    }

    public int getAvarageFreshness() {
        return avarageFreshness;
    }

    public void setAvarageFreshness(ArrayList<Flower> flowers) {
        flowers.stream().map(flower -> flower.amountOfDaysInShop).forEach(amount -> this.avarageFreshness+=amount);
        this.avarageFreshness = avarageFreshness/this.getAmountOfFlowers();
    }

    public ArrayList<Flower> getFlowers() {
        return flowers;
    }

    public void setFlowers(ArrayList<Flower> flowers) {
        this.flowers = flowers;
    }

    @Override
    public String toString() {
        String bouquet = "Bouquet contains: "+this.getAmountOfFlowers()+" flowers. The price is "+this.getPrice()+" $. The avarageFreshness is "+this.avarageFreshness+" days.";
        return bouquet;
    }


}
