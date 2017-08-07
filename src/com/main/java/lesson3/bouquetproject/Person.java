package com.main.java.lesson3.bouquetproject;

import com.main.java.lesson3.bouquetproject.flowers.Flower;
import com.main.java.lesson3.bouquetproject.flowers.Lily;
import com.main.java.lesson3.bouquetproject.flowers.Rose;
import com.main.java.lesson3.bouquetproject.flowers.Сhamomile;

import com.main.java.lesson3.bouquetproject.interfaces.IPersonActions;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Person implements IPersonActions {
    public ArrayList<Flower> flowers;
    private Bouquet bouquet;
    public static ArrayList<Bouquet> bouquetArrayList = new ArrayList<>();

    Random random = new Random();

    public Bouquet getBouquet() {
        return bouquet;
    }

    public void setBouquet(Bouquet bouquet) {
        this.bouquet = bouquet;
    }


    @Override
    public Bouquet buyBouquet(int numberOfRose, int numberOfChamomile, int numberOfLily){
        flowers = new ArrayList<>();
        for (int i=0; i<numberOfRose; i++){
            flowers.add(new Rose("red", (int) Math.round(Math.random()*20+1), random.nextBoolean()));
        }

        for (int i=0; i<numberOfChamomile; i++) {
            flowers.add(new Сhamomile("white", (int) Math.round(Math.random() * 20+1)));
        }

        if (numberOfLily<=5){
            for (int i=0; i<numberOfLily; i++){
                flowers.add(new Lily("yellow", (int) Math.round(Math.random()*30+1)));
            }
        }else{
            System.out.println("There are not a lot of lilies in shop. You can bye only 5 of them.");
            numberOfLily = 5;
            for (int i=0; i<numberOfLily; i++){
                flowers.add(new Lily("yellow", (int) Math.round(Math.random()*30)));
            }
        }

        Bouquet bouquet = new Bouquet();
        bouquet.setAmountOfFlowers(numberOfRose+numberOfChamomile+numberOfLily);
        bouquet.setFlowers(flowers);
        bouquet.setPrice(flowers);
        bouquet.setAvarageFreshness(flowers);
        this.setBouquet(bouquet);
        bouquetArrayList.add(bouquet);

        return new Bouquet();
    }

    private static List<Bouquet> findTheMostFreshBouquets(){
        int mostFreshness = bouquetArrayList.get(0).getAvarageFreshness();
        List<Bouquet> collect = bouquetArrayList.stream().filter(bouquet1 -> bouquet1.getAvarageFreshness() <= mostFreshness).collect(Collectors.toList());
        return collect;
    }

    public static String showTheMostFreshBouquet(){
        List<Bouquet> theMostFreshBouquets;
        theMostFreshBouquets = findTheMostFreshBouquets();
        if (theMostFreshBouquets.size()==1){
            return "The most fresh bouquet is " + theMostFreshBouquets;
        }else
            return "The most fresh bouquets are " + theMostFreshBouquets;
    }

//    private static Flower findTheHighestFlower(Bouquet bouquet){
//        for (int i=0; i<bouquet.getFlowers().size(); i++){
//            int mostHight = bouquet.getFlowers().get(i).length;
//            bouquetArrayList.stream().map(bouquet1 ->
//            {bouquet1.getFlowers().stream().filter(
//                    flower -> flower.length>=mostHight)
//            })
//        }
//
//    }
}
