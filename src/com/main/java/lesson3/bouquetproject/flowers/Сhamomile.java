package com.main.java.lesson3.bouquetproject.flowers;

public class Сhamomile extends Flower {
    private boolean hasPairedPetalsCount;

    public Сhamomile(String color, int length){
        this.color = color;
        this.length = length;
        this.setAmountOfDaysInShop();
        this.setHasPairedPetalsCount(random.nextBoolean());
    }

    public boolean isHasPairedPetalsCount() {
        return hasPairedPetalsCount;
    }

    public void setHasPairedPetalsCount(boolean hasPairedPetalsCount) {
        this.hasPairedPetalsCount = hasPairedPetalsCount;
    }

}
